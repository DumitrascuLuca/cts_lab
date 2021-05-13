package ro.ase.cts.seminar10.command;

public class IncreaseLishtIntensityCommand implements CommandInterface{

	private LightBulb bulb;

	public IncreaseLishtIntensityCommand(LightBulb bulb) {
		super();
		this.bulb = bulb;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		bulb.increaseLight();
	}

}
