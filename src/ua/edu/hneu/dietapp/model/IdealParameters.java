package ua.edu.hneu.dietapp.model;

public class IdealParameters {
	private int id;
	private int maxHeight;
	private int minHeight;
	private int maxWeight;
	private int minWeight;
	private String name;
	private Constitution constitution;

	public IdealParameters(int id, int maxHeight, int minHeight, int maxWeight,
			int minWeight, String name, Constitution constitution) {
		super();
		this.id = id;
		this.maxHeight = maxHeight;
		this.minHeight = minHeight;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
		this.name = name;
		this.constitution = constitution;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	public int getMinHeight() {
		return minHeight;
	}

	public void setMinHeight(int minHeight) {
		this.minHeight = minHeight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public int getMinWeight() {
		return minWeight;
	}

	public void setMinWeight(int minWeight) {
		this.minWeight = minWeight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Constitution getConstitution() {
		return constitution;
	}

	public void setConstitution(Constitution constitution) {
		this.constitution = constitution;
	}

}
