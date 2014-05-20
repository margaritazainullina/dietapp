package ua.edu.hneu.dietapp.model;

public class Constitution {
	private int id;
	private int min_diameter;
	private int max_diameter;
	private int desc;

	public Constitution(int id, int min_diameter, int max_diameter, int desc) {
		super();
		this.id = id;
		this.min_diameter = min_diameter;
		this.max_diameter = max_diameter;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMin_diameter() {
		return min_diameter;
	}

	public void setMin_diameter(int min_diameter) {
		this.min_diameter = min_diameter;
	}

	public int getMax_diameter() {
		return max_diameter;
	}

	public void setMax_diameter(int max_diameter) {
		this.max_diameter = max_diameter;
	}

	public int getDesc() {
		return desc;
	}

	public void setDesc(int desc) {
		this.desc = desc;
	}

}
