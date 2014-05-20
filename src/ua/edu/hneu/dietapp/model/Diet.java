package ua.edu.hneu.dietapp.model;

public class Diet {
	private int id;
	private String name;
	private int duration;
	private Product p;

	public Diet(int id, String name, int duration, Product p) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

}
