package ro.ase.seminar.adapter;

public abstract class EuropeanCar {
	
	private String model;
	public abstract int getMaxSpeed();
	public EuropeanCar(String model) {
		super();
		this.model = model;
	}

}
