package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ActionDAO;
import ua.edu.hneu.dietapp.dao.DishDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationDAO;
import ua.edu.hneu.dietapp.dao.ScheduleDAO;
import ua.edu.hneu.dietapp.model.Schedule;
import android.database.sqlite.SQLiteDatabase;

public class ScheduleService {
	
	public void emptyTable() {
		ScheduleDAO.getDb().execSQL("delete from " + ScheduleDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + RationDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ ScheduleDAO.DAY + " TEXT, " 
				+ ScheduleDAO.TIME + " TIME, " 
				+ ScheduleDAO.A_ID + " INTEGER, " + "FOREIGN KEY("
				+ ScheduleDAO.A_ID + ") REFERENCES " + ActionDAO.TABLE_NAME + "("
				+ ActionDAO.ID + "));");
	}

	public void dropTable() {
		ScheduleDAO.getDb().execSQL(
				"DROP TABLE if exists " + ScheduleDAO.TABLE_NAME + ";");
	}	
}
