package ua.edu.hneu.dietapp.model;

public class RationType {
	private int id;
	private String name;
	private TypeProduct typeProduct;

	public RationType(int id, String name, TypeProduct tp) {
		super();
		this.id = id;
		this.name = name;
		this.typeProduct = tp;
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

	public TypeProduct getTp() {
		return typeProduct;
	}

	public void setTp(TypeProduct tp) {
		this.typeProduct = tp;
	}

}
