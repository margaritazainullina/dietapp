package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.DishDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class DishService {
	
	public void emptyTable() {
		DishDAO.getDb().execSQL("delete from " + DishDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + ProductDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ DishDAO.NAME + " TEXT, " 
				+ DishDAO.DESC + " TEXT, " 
				+ DishDAO.TYPE + " TEXT, " 
				+ DishDAO.PHOTO + " TEXT,"	
				+ DishDAO.P_ID + " INTEGER, " + "FOREIGN KEY("
				+ DishDAO.P_ID + ") REFERENCES " + ProductDAO.TABLE_NAME + "("
				+ ProductDAO.ID + "));");
	}

	public void dropTable() {
		DishDAO.getDb().execSQL(
				"DROP TABLE if exists " + DishDAO.TABLE_NAME + ";");
	}	
}
