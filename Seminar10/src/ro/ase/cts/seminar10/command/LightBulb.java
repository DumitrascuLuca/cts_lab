package ro.ase.cts.seminar10.command;

public class LightBulb {
	
	int lightIntensity=0;

	public void  turnOnLight()
	{
		System.out.println("Light has been turned on");
		lightIntensity=1;
	}
	
	public void  turnOffLight()
	{
		System.out.println("Light has been turned off");
		lightIntensity=0;
	}
	
	public void  dimLight()
	{
		System.out.println("Light has been dimmed");
		if(lightIntensity>0)
		{
		lightIntensity--;
		System.out.println("Light is at " + lightIntensity + " intensity level ");
		}
	}
	
	public void  increaseLight()
	{
		System.out.println("Light has been increased");
		lightIntensity++;	
		System.out.println("Light is at " + lightIntensity + " intensity level ");
	}
}
