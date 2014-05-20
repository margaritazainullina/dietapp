package ua.edu.hneu.dietapp.model;

public class Action {

	private int id;
	private String desc;
	private double energy;

	public Action(int id, String desc, double energy) {
		super();
		this.id = id;
		this.desc = desc;
		this.energy = energy;
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

	public String toString() {
		return "energy " + energy + ", desc" + desc;
	}
}
