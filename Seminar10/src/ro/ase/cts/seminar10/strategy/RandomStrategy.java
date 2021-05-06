package ro.ase.cts.seminar10.strategy;

import java.util.Random;

public class RandomStrategy implements MarketingStrategyInterface{

	@Override
	public double calculateBonus(double base) {
		Random rand=new Random();
		return rand.nextInt(100)*base;
		
		
	}

}
