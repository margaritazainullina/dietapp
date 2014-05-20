package ua.edu.hneu.dietapp.model;

public class RationSchedule {
	private Ration r;
	private Schedule sc;

	public RationSchedule(Ration r, Schedule sc) {
		super();
		this.r = r;
		this.sc = sc;
	}

	public Ration getR() {
		return r;
	}

	public void setR(Ration r) {
		this.r = r;
	}

	public Schedule getSc() {
		return sc;
	}

	public void setSc(Schedule sc) {
		this.sc = sc;
	}

}
