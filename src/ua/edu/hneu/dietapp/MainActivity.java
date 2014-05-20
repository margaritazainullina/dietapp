package ua.edu.hneu.dietapp;

import ua.edu.hneu.dietapp.dao.IdealParametersDAO;
import ua.edu.hneu.dietapp.dao.TypeProductDAO;
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
import android.view.Menu;

public class MainActivity extends Activity {
	ActionService as = new ActionService();
	ConstitutionService cs = new ConstitutionService();
	DietService dts = new DietService();
	DishService ds = new DishService();
	IdealParametersService ips = new IdealParametersService();
	PersonService ps = new PersonService();
	ProductService prs = new ProductService();
	RationService rs = new RationService();
	RationTypeService rts = new RationTypeService();
	ScheduleService ss = new ScheduleService();
	TypeProductService tps = new TypeProductService();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
