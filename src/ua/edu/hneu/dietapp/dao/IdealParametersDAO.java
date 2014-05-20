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

public class IdealParametersDAO extends ContentProvider {

	public static String TABLE_NAME = "ideal_parameters";
	public static final String ID = "_id";
	public static final String MIN_HEIGHT = "min_height";
	public static final String MAX_HEIGHT = "max_height";
	public static final String MIN_WEIGHT = "min_weight";
	public static final String MAX_WEIGHT = "max_weight";
	public static final String C_ID = "constitution_id";
	public static final String NAME = "name";

	public static final Uri CONTENT_URI = Uri
			.parse("content://ua.edu.hneu.dietapp.idealparametersprovider/diet");
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
		mContactMap.put(MIN_HEIGHT, MIN_HEIGHT);
		mContactMap.put(MAX_HEIGHT, MAX_HEIGHT);
		mContactMap.put(MIN_WEIGHT, MIN_WEIGHT);
		mContactMap.put(MAX_WEIGHT, MAX_WEIGHT);
		mContactMap.put(C_ID, C_ID);
		mContactMap.put(NAME, NAME);
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
