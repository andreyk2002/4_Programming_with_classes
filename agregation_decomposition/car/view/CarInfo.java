package by.epam_tc.class_programminng.agregation_decomposition.car.view;

import by.epam_tc.class_programminng.agregation_decomposition.car.entity.Car;

public class CarInfo {

	private Car car;
	
	public CarInfo(Car car) {
		this.car = car;
	}
	
	public String getWheels() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < car.getWheels().length; i++) {
			stringBuilder.append("Wheel " + i + ":");
			stringBuilder.append(car.getWheels()[i].toString() + "\n");
		}
		return stringBuilder.toString();
	}
	
	public void showModel() {
		System.out.println(car.getModelName());
	}
}
