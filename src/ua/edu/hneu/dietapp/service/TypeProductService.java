package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class TypeProductService {

	public void emptyTable() {
		TypeProductDAO.getDb().execSQL("delete from " + TypeProductDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + TypeProductDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + TypeProductDAO.NAME
				+ " TEXT, " + TypeProductDAO.DESC + " TEXT); ");
	}

	public void dropTable() {
		ProductDAO.getDb().execSQL(
				"DROP TABLE if exists " + TypeProductDAO.TABLE_NAME + ";");
	}
}
