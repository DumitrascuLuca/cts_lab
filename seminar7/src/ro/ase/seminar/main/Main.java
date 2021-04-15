package ro.ase.seminar.main;

import java.util.ArrayList;

import ro.ase.seminar.adapter.AdapterMetric;
import  ro.ase.seminar.adapter.AmericanCar;
import  ro.ase.seminar.adapter.Lamborghini;
import  ro.ase.seminar.adapter.MovableImperial;

public class Main {

	public static void main(String[] args) {
		ArrayList<MovableImperial> cars=new ArrayList<MovableImperial>();
		cars.add(new AmericanCar("Ford"));
		cars.add(new AmericanCar("Chevy"));
		
		
		Lamborghini lambo=new Lamborghini("Aventador");
		AdapterMetric adapter=new AdapterMetric(lambo);
		cars.add(adapter);
		
		for(MovableImperial car: cars) {
			System.out.println("Max speed in miles is "+car.getMaxSpeed());
		}
		
		
		System.out.println(cars.get(0).getMaxSpeed());

	}

}
