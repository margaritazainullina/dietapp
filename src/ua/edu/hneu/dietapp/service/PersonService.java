package ua.edu.hneu.dietapp.service;

import ua.edu.hneu.dietapp.dao.ConstitutionDAO;
import ua.edu.hneu.dietapp.dao.DietDAO;
import ua.edu.hneu.dietapp.dao.IdealParametersDAO;
import ua.edu.hneu.dietapp.dao.PersonDAO;
import ua.edu.hneu.dietapp.dao.ProductDAO;
import ua.edu.hneu.dietapp.dao.RationTypeDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import android.database.sqlite.SQLiteDatabase;

public class PersonService {

	public void emptyTable() {
		PersonDAO.getDb().execSQL("delete from " + PersonDAO.TABLE_NAME);
	}

	public void createTable() {
		SQLiteDatabase db = PersonDAO.getDb();
		db.execSQL("CREATE TABLE if not exists person (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, hip_circ INTEGER, waist_circ INTEGER, wrist_circ INTEGER, age INTEGER, sex TEXT, height INTEGER, weight INTEGER, percent_fat DOUBLE, diet_id INTEGER, constitution_id INTEGER,ration_type_id INTEGER, idealparameters_id INTEGER, FOREIGN KEY(diet_id) REFERENCES diet(_id), FOREIGN KEY(ration_type_id) REFERENCES ration_type(_id), FOREIGN KEY(constitution_id) REFERENCES constitution(_id), FOREIGN KEY(idealparameters_id) REFERENCES ideal_parameters(_id))"
				);
	}

	public void dropTable() {
		PersonDAO.getDb().execSQL(
				"DROP TABLE if exists " + PersonDAO.TABLE_NAME + ";");
	}
}
