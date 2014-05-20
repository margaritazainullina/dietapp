package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ConstitutionDAO;
import ua.edu.hneu.dietapp.dao.IdealParametersDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationTypeDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class IdealParametersService {

	public void emptyTable() {
		IdealParametersDAO.getDb().execSQL("delete from " + IdealParametersDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + IdealParametersDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ IdealParametersDAO.MAX_HEIGHT + " INTEGER, " 
				+ IdealParametersDAO.MIN_HEIGHT + " INTEGER, " 
				+ IdealParametersDAO.MAX_WEIGHT + " INTEGER, " 
				+ IdealParametersDAO.MIN_WEIGHT + " INTEGER, " 
				+ IdealParametersDAO.C_ID + " INTEGER, " + "FOREIGN KEY("
				+ IdealParametersDAO.C_ID + ") REFERENCES " + ConstitutionDAO.TABLE_NAME + "("
				+ ConstitutionDAO.ID + "));");
	}

	public void dropTable() {
		IdealParametersDAO.getDb().execSQL(
				"DROP TABLE if exists " + IdealParametersDAO.TABLE_NAME + ";");
	}
}
