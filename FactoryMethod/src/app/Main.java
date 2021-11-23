package app;

import factory.CarFactory;
import model.Car;

public class Main {

	public static void main(String[] args) {
		Car car = new CarFactory().getInfomation("Honda");
		System.out.println(car.getConfiguration());

	}

}
