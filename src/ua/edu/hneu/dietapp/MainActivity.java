package ua.edu.hneu.dietapp;

import java.util.ArrayList;

import ua.edu.hneu.dietapp.dao.ActionDAO;
import ua.edu.hneu.dietapp.dao.IdealParametersDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
import ua.edu.hneu.dietapp.model.Action;
import ua.edu.hneu.dietapp.model.Constitution;
import ua.edu.hneu.dietapp.model.Person;
import ua.edu.hneu.dietapp.model.Person.Sex;
import ua.edu.hneu.dietapp.model.RationType;
import ua.edu.hneu.dietapp.model.Schedule;
import ua.edu.hneu.dietapp.service.ActionService;
import ua.edu.hneu.dietapp.service.ConstitutionService;
import ua.edu.hneu.dietapp.service.DietService;
import ua.edu.hneu.dietapp.service.DishService;
import ua.edu.hneu.dietapp.service.IdealParametersService;
import ua.edu.hneu.dietapp.service.PersonService;
import ua.edu.hneu.dietapp.service.ProductService;
import ua.edu.hneu.dietapp.service.RationService;
import ua.edu.hneu.dietapp.service.RationTypeService;
import ua.edu.hneu.dietapp.service.ScheduleService;
import ua.edu.hneu.dietapp.service.TypeProductService;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity{
	private static ActionService as = new ActionService();
	private static ConstitutionService cs = new ConstitutionService();
	private static DietService dts = new DietService();
	private static DishService ds = new DishService();
	private static IdealParametersService ips = new IdealParametersService();
	private static PersonService ps = new PersonService();
	private static ProductService prs = new ProductService();
	private static RationService rs = new RationService();
	private static RationTypeService rts = new RationTypeService();
	private static ScheduleService ss = new ScheduleService();
	private static TypeProductService tps = new TypeProductService();
	ListView lv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv = (ListView) findViewById(R.id.ActionLV);
		
		// создание табличек, первый раз раскомментировать
		rs.createTable();
		ds.createTable();
		as.createTable();
		ss.createTable();
		rts.createTable();
		tps.createTable();
		dts.createTable();
		cs.createTable();
		ips.createTable();
		ps.createTable();
		
		// вставка
		Action a = new Action(0, "something", 250);
		as.insert(a, getContentResolver());	
		lv.setAdapter(new ArrayAdapter(this,  android.R.layout.simple_list_item_1, as.getAll(getContentResolver())));
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
