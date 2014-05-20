package ua.edu.hneu.dietapp.model;

import ua.edu.hneu.dietapp.model.Ration.Day;

public class Schedule {
	private int id;
	private String time;
	private Day day;

	public Schedule(int id, String time, Day day) {
		super();
		this.id = id;
		this.time = time;
		this.day = day;
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

}
