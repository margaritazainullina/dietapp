package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.DishDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class RationService {
	public void emptyTable() {
		RationDAO.getDb().execSQL("delete from " + RationDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = RationDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + RationDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ RationDAO.TIME + " TIME, " 
				+ RationDAO.DAY + " STRING, " 
				+ RationDAO.D_ID + " INTEGER, " + "FOREIGN KEY("
				+ RationDAO.D_ID + ") REFERENCES " + DishDAO.TABLE_NAME + "("
				+ DishDAO.ID + "));");
	}

	public void dropTable() {
		RationDAO.getDb().execSQL(
				"DROP TABLE if exists " + RationDAO.TABLE_NAME + ";");
	}	
	
}
