package ro.ase.seminar.adapter;

public class AdapterMetric implements MovableImperial{

	private final double multiplier=1.609334;
	private EuropeanCar euroCar;
	
	public AdapterMetric(EuropeanCar euroCar) {
		super();
		this.euroCar = euroCar;
	}

	
	
	private int kmToMiles()
	{
		return (int)(euroCar.getMaxSpeed()*multiplier);
	}



	@Override
	public int getMaxSpeedImperial() {
		// TODO Auto-generated method stub
		return kmToMiles();
	}

	
	
}
