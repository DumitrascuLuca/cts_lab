package ro.ase.seminar.main;

import ro.ase.seminar.adapter.AmericanCar;
import ro.ase.seminar.adapter.MovableImperial;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Lamborghini lambo=new Lamborghini("Aventador");
		AdapterMetric adapter=new AdapterMetric(lambo);
		cars.add(adapter);
		
		for(MovableImperial car: cars) {
			System.out.println("Max speed is "+car.getMaxSpeed());
		}
		
		
		System.out.println(cars.get(0).getMaxSpeed());
	}
	

}
