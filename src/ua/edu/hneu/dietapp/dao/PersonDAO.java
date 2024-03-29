package ua.edu.hneu.dietapp.dao;
import java.util.HashMap;

import ua.edu.hneu.dietapp.db.DietDbHelper;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;

public class PersonDAO extends ContentProvider {

	public static String TABLE_NAME = "person";
	public static final String ID = "_id";
	public static final String HIP_CIRC = "hip_circ";
	public static final String WRIST_CIRC = "wrist_circ";
	public static final String WAIST_CIRC = "waist_circ";
	public static final String RT_ID = "ration_type_id";
	public static final String DIET_ID = "diet_id";
	public static final String C_ID = "constitution_id";
	public static final String IDEALPARAMETERS_ID = "idealparameters_id";
	public static final String NAME = "name";
	public static final String AGE = "age";
	public static final String SEX = "sex";
	public static final String HEIGHT = "height";
	public static final String WEIGHT = "weight";
	public static final String PERCENT_FAT = "percent_fat";

	public static final Uri CONTENT_URI = Uri
			.parse("content://ua.edu.hneu.dietapp.personprovider/diet");
	public static final int URI_CODE = 1;
	public static final int URI_CODE_ID = 2;

	private static final UriMatcher mUriMatcher;

	private static HashMap<String, String> mContactMap;

	static SQLiteDatabase db;

	static {
		mUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
		mUriMatcher.addURI("ua.hneu.languagetrainer.db", TABLE_NAME, URI_CODE);
		mUriMatcher.addURI("ua.hneu.languagetrainer.db", TABLE_NAME + "/#",
				URI_CODE_ID);

		mContactMap = new HashMap<String, String>();
		mContactMap.put(DietDbHelper._ID, DietDbHelper._ID);
		mContactMap.put(RT_ID, RT_ID);
		mContactMap.put(NAME, NAME);
		mContactMap.put(DIET_ID, DIET_ID);
		mContactMap.put(C_ID, C_ID);
		mContactMap.put(IDEALPARAMETERS_ID, IDEALPARAMETERS_ID);
		mContactMap.put(AGE, AGE);
		mContactMap.put(SEX, SEX);
		mContactMap.put(HEIGHT, HEIGHT);
		mContactMap.put(WEIGHT, WEIGHT);
		mContactMap.put(PERCENT_FAT, PERCENT_FAT);
	}

	public String getDbName() {
		return (DietDbHelper.DB_NAME);
	}

	public static SQLiteDatabase getDb() {
		return db;
	}

	@Override
	public boolean onCreate() {
		db = (new DietDbHelper(getContext())).getWritableDatabase();
		return (db == null) ? false : true;
	}
	
	@Override
	public Cursor query(Uri url, String[] projection, String selection,
			String[] selectionArgs, String sort) {

		String orderBy;
		if (TextUtils.isEmpty(sort)) {
			orderBy = ID;
		} else {
			orderBy = sort;
		}

		Cursor c = db.query(TABLE_NAME, projection, selection, selectionArgs,
				null, null, orderBy);
		c.setNotificationUri(getContext().getContentResolver(), url);
		return c;
	}

	@Override
	public Uri insert(Uri url, ContentValues inValues) {

		ContentValues values = new ContentValues(inValues);

		long rowId = db.insert(TABLE_NAME, ID, values);
		if (rowId > 0) {
			Uri uri = ContentUris.withAppendedId(CONTENT_URI, rowId);
			getContext().getContentResolver().notifyChange(uri, null);
			return uri;
		} else {
			throw new SQLException("Failed to insert row into " + url);
		}
	}

	@Override
	public int delete(Uri url, String where, String[] whereArgs) {
		int retVal = db.delete(TABLE_NAME, where, whereArgs);
		getContext().getContentResolver().notifyChange(url, null);
		return retVal;
	}

	@Override
	public int update(Uri url, ContentValues values, String where,
			String[] whereArgs) {
		int retVal = db.update(TABLE_NAME, values, where, whereArgs);
		getContext().getContentResolver().notifyChange(url, null);
		return retVal;
	}

	@Override
	public String getType(Uri uri) {
		return null;
	}

}
