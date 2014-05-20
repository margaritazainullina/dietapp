package ua.edu.hneu.dietapp.model;

public class Action {

	private int id;
	private String desc;
	private double energy;
	private Schedule s;

	public Action(int id, String desc, double energy, Schedule s) {
		super();
		this.id = id;
		this.desc = desc;
		this.energy = energy;
		this.s = s;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public Schedule getS() {
		return s;
	}

	public void setS(Schedule s) {
		this.s = s;
	}

}
