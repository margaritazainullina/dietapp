package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ConstitutionDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationTypeDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class RationTypeService {

	public void emptyTable() {
		RationTypeDAO.getDb().execSQL("delete from " + RationTypeDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + RationTypeDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ RationTypeDAO.NAME + " TEXT, " 
				+ RationTypeDAO.TP_ID + " INTEGER, " + "FOREIGN KEY("
				+ RationTypeDAO.TP_ID + ") REFERENCES " + TypeProductDAO.TABLE_NAME + "("
				+ TypeProductDAO.ID + "));");
	}

	public void dropTable() {
		RationTypeDAO.getDb().execSQL(
				"DROP TABLE if exists " + RationTypeDAO.TABLE_NAME + ";");
	}
}
