package by.epam_tc.class_programminng.agregation_decomposition.car.logic;

import by.epam_tc.class_programminng.agregation_decomposition.car.entity.Car;

public class CarMonitoring {

	public static CarMonitoring instance = null;
	
	private CarMonitoring() {
		
	}
	
	public static CarMonitoring getInstance() {
		if(instance == null) {
			instance = new CarMonitoring();
		}
		return instance;
	}
	
	public int countWheels(Car car) {
		int len = car.getWheels().length;
		for (int i = 0; i < len; i++) {
			if (car.getWheels()[i] == null) {
				return i;
			}
		}
		return len;
	}

	public boolean checkWheelConsistance(Car car) {
		int len = car.getWheels().length;
		for (int i = 0; i < len; i++) {
			if (!car.getWheels()[i].isInCondition()) {
				return false;
			}
		}
		return true;
	}
}
