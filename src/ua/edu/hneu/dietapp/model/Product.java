package ua.edu.hneu.dietapp.model;

public class Product {
	private int id;
	private TypeProduct type;
	private double protein;
	private double carbohydtates;
	private double fat;
	private double calories;
	private double price;

	public Product(int id, TypeProduct type, double protein,
			double carbohydtates, double fat, double calories, double price) {
		super();
		this.id = id;
		this.type = type;
		this.protein = protein;
		this.carbohydtates = carbohydtates;
		this.fat = fat;
		this.calories = calories;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TypeProduct getType() {
		return type;
	}

	public void setType(TypeProduct type) {
		this.type = type;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getCarbohydtates() {
		return carbohydtates;
	}

	public void setCarbohydtates(double carbohydtates) {
		this.carbohydtates = carbohydtates;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
