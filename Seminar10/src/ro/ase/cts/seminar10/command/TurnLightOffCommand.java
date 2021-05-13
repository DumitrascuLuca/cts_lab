package ro.ase.cts.seminar10.command;

public class TurnLightOffCommand implements CommandInterface{

	
public LightBulb lightBulb;
	
	
	public TurnLightOffCommand(LightBulb lightBulb) {
		super();
		this.lightBulb = lightBulb;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
