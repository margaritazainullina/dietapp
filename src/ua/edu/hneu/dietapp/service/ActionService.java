package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ActionDAO;
import ua.edu.hneu.dietapp.dao.DishDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationDAO;
import ua.edu.hneu.dietapp.dao.ScheduleDAO;
import ua.edu.hneu.dietapp.model.Schedule;
import android.database.sqlite.SQLiteDatabase;

public class ActionService {
	
	public void emptyTable() {
		ActionDAO.getDb().execSQL("delete from " + ActionDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + ActionDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ ActionDAO.ENERGY + " DOUBLE, " 
				+ ActionDAO.DESC + " TEXT, " 
				+ ActionDAO.SCH_ID + " INTEGER, " + "FOREIGN KEY("
				+ ActionDAO.SCH_ID + ") REFERENCES " + ScheduleDAO.TABLE_NAME + "("
				+ ScheduleDAO.ID + "));");
	}

	public void dropTable() {
		ActionDAO.getDb().execSQL(
				"DROP TABLE if exists " + ActionDAO.TABLE_NAME + ";");
	}	
}
