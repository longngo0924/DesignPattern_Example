package factory;

import model.Car;
import model.Honda;

public class CarFactory {
	public Car getInfomation(String carName) {
		switch (carName) {
		case "Honda":
			return new Honda();
		default:
			throw new IllegalArgumentException("Unexpected value: " + carName);
		}
	}

}
