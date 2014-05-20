package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.DietDAO;
import ua.edu.hneu.dietapp.dao.DishDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationDAO;
import android.database.sqlite.SQLiteDatabase;

public class DietService {
	
	public void emptyTable() {
		DietDAO.getDb().execSQL("delete from " + DietDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + RationDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ DietDAO.NAME + " TEXT, " 
				+ DietDAO.DURATION + " INTEGER, " 
				+ DietDAO.P_ID + " INTEGER, " + "FOREIGN KEY("
				+ DietDAO.P_ID + ") REFERENCES " + ProductDAO.TABLE_NAME + "("
				+ ProductDAO.ID + "));");
	}

	public void dropTable() {
		DietDAO.getDb().execSQL(
				"DROP TABLE if exists " + DietDAO.TABLE_NAME + ";");
	}	
}
