package ua.edu.hneu.dietapp.service;

import java.util.ArrayList;

import ua.edu.hneu.dietapp.dao.ActionDAO;
import ua.edu.hneu.dietapp.dao.DishDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationDAO;
import ua.edu.hneu.dietapp.dao.ScheduleDAO;
import ua.edu.hneu.dietapp.model.Action;
import ua.edu.hneu.dietapp.model.Schedule;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

@SuppressLint("NewApi")
public class ActionService {

	public void emptyTable() {
		ActionDAO.getDb().execSQL("delete from " + ActionDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = ProductDAO.getDb();
		db.execSQL("CREATE TABLE if not exists " + ActionDAO.TABLE_NAME
				+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ ActionDAO.ENERGY + " DOUBLE, " + ActionDAO.DESC + " TEXT) ");
	}

	public void dropTable() {
		ActionDAO.getDb().execSQL(
				"DROP TABLE if exists " + ActionDAO.TABLE_NAME + ";");
	}

	public void insert(Action a, ContentResolver cr) {
		ContentValues values = new ContentValues();
		values.put(ActionDAO.ENERGY, a.getEnergy());
		values.put(ActionDAO.DESC, a.getDesc());
		cr.insert(ActionDAO.CONTENT_URI, values);
	}
	public  ArrayList<Action> getAll( ContentResolver cr) {
		String[] col = { ActionDAO.ID, ActionDAO.ENERGY, ActionDAO.DESC };
		Cursor c = cr.query(ActionDAO.CONTENT_URI, col, null, null, null, null);
		c.moveToFirst();
		int id =0;
		String desc = "";
		int energy =0;
		ArrayList<Action> a = new ArrayList<Action>();
		while (!c.isAfterLast()) {
			id = c.getInt(0);
			energy = c.getInt(1);
			desc = c.getString(2);
			a.add(new Action(id, desc, energy));
			c.moveToNext();
		}
		c.close();
		return a;
	}
}
