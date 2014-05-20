package ua.edu.hneu.dietapp.model;

import java.util.ArrayList;

public class Dish {
	private int id;
	private String name;
	private String desc;
	private String type;
	private String photo;
	private ArrayList<Product> products;

	public Dish(int id, String name, String desc, String type, String photo,
			ArrayList<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.type = type;
		this.photo = photo;
		this.products = products;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
