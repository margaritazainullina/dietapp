package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class ProductService {

	public void emptyTable() {
		ProductDAO.getDb().execSQL("delete from " + ProductDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + ProductDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + ProductDAO.NAME
				+ " TEXT, " + ProductDAO.PROTEIN + " DOUBLE, "
				+ ProductDAO.CARBOHYDRATES + " DOUBLE, " + ProductDAO.FAT
				+ " DOUBLE," + ProductDAO.CALORIES + " DOUBLE,"
				+ ProductDAO.PRICE + " DOUBLE," + ProductDAO.TP_ID
				+ " INTEGER, " + "FOREIGN KEY(" + ProductDAO.TP_ID
				+ ") REFERENCES " + TypeProductDAO.TABLE_NAME + "("
				+ TypeProductDAO.ID + "));");
	}

	public void dropTable() {
		ProductDAO.getDb().execSQL(
				"DROP TABLE if exists " + ProductDAO.TABLE_NAME + ";");
	}
}
