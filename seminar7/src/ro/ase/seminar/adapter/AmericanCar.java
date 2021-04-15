package ro.ase.seminar.adapter;

public class AmericanCar implements MovableImperial{

	private String model;
	
	
	public AmericanCar(String model) {
		super();
		this.model = model;
	}

	@Override
	public int getMaxSpeed() {
		//in imperial system
		return 200;
	}

}
