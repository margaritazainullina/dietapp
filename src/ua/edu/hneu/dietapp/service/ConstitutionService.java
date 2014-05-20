package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ConstitutionDAO;
import android.database.sqlite.SQLiteDatabase;

public class ConstitutionService {
	
	public void emptyTable() {
		ConstitutionDAO.getDb().execSQL("delete from " + ConstitutionDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ConstitutionDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + ConstitutionDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ ConstitutionDAO.MIN_DIAMETER + " INTEGER, " 
				+ ConstitutionDAO.MAX_DIAMETER + " INTEGER, " 
				+ ConstitutionDAO.DESC + " TEXT); " );
	}

	public void dropTable() {
		ConstitutionDAO.getDb().execSQL(
				"DROP TABLE if exists " + ConstitutionDAO.TABLE_NAME + ";");
	}
}
