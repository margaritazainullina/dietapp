package ua.edu.hneu.dietapp.model;

public class Person {
	private int id;
	private String name;
	private double hip_circumference;
	private double waist_circumference;
	private double wrist_circumference;
	private int age;
	private Sex sex;
	private int height;
	private int weight;
	private Constitution constitution;
	private Diet diet;
	private RationType rationType;
	private IdealParameters idealParameters;
	private double percentOfFat;

	public enum Sex {
		M, F
	}

	public Person(int id, String name, double hip_circumference,
			double waist_circumference, double wrist_circumference, int age,
			Sex sex, int height, int weight, Constitution constitution,
			Diet diet, RationType rationType, IdealParameters idealParameters,
			double percentOfFat) {
		super();
		this.id = id;
		this.name = name;
		this.hip_circumference = hip_circumference;
		this.waist_circumference = waist_circumference;
		this.wrist_circumference = wrist_circumference;
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
		this.constitution = constitution;
		this.diet = diet;
		this.rationType = rationType;
		this.idealParameters = idealParameters;
		this.percentOfFat = percentOfFat;
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

	public double getHip_circumference() {
		return hip_circumference;
	}

	public void setHip_circumference(double hip_circumference) {
		this.hip_circumference = hip_circumference;
	}

	public double getWaist_circumference() {
		return waist_circumference;
	}

	public void setWaist_circumference(double waist_circumference) {
		this.waist_circumference = waist_circumference;
	}

	public double getWrist_circumference() {
		return wrist_circumference;
	}

	public void setWrist_circumference(double wrist_circumference) {
		this.wrist_circumference = wrist_circumference;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Constitution getConstitution() {
		return constitution;
	}

	public void setConstitution(Constitution constitution) {
		this.constitution = constitution;
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public RationType getRationType() {
		return rationType;
	}

	public void setRationType(RationType rationType) {
		this.rationType = rationType;
	}

	public IdealParameters getIdealParameters() {
		return idealParameters;
	}

	public void setIdealParameters(IdealParameters idealParameters) {
		this.idealParameters = idealParameters;
	}

	public double getPercentOfFat() {
		return percentOfFat;
	}

	public void setPercentOfFat(double percentOfFat) {
		this.percentOfFat = percentOfFat;
	};

}
