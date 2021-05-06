package ro.ase.cts.seminar10.command;

public class TurnLightOn implements CommandInterface{

	
	private LightBulb Bulb;
	
	
	
	public TurnLightOn(LightBulb bulb) {
		super();
		Bulb = bulb;
	}

	


	@Override
	public void execute() {
		Bulb.turnOnLight();
		
	}

}
