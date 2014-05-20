package ua.edu.hneu.dietapp.model;

import java.util.ArrayList;

public class Ration {
	private int id;
	private String time;
	private Day day;
	private ArrayList<Dish> dishes;
	
	public enum Day{
		MONDAY, TUESDAY, WEDNESDAY, THIRSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public Ration(int id, String time, Day day, ArrayList<Dish> dishes) {
		super();
		this.id = id;
		this.time = time;
		this.day = day;
		this.dishes = dishes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public ArrayList<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(ArrayList<Dish> dishes) {
		this.dishes = dishes;
	};
	
	
}
