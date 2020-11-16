package by.epam_tc.class_programminng.agregation_decomposition.car.logic;

import by.epam_tc.class_programminng.agregation_decomposition.car.entity.*;

public class CarLogic {

	private CarMonitoring checker = CarMonitoring.getInstance();
	public static CarLogic instance = null;
	
	private CarLogic() {
		
	}
	
	public static CarLogic getInstance() {
		if(instance == null) {
			instance = new CarLogic();
		}
		return instance;
	}

	public void addWheel(Car car, Wheel... wheels) {
		CarMonitoring checker = CarMonitoring.getInstance();
		Wheel[] oldWheels = car.getWheels();
		int start = checker.countWheels(car);
		int k = 0;
		for (int i = start; i < oldWheels.length && k < wheels.length; i++, k++) {
			oldWheels[i] = wheels[k];
		}
	}

	public void go(Car car) {

		if (car.getEngine() == null) {
			System.out.println("Your car has no engine!");
			return;
		}

		if (!(checker.countWheels(car) == 4)) {
			System.out.print("The amount of wheels is too small.");
			System.out.println("You should add " + (4 - checker.countWheels(car)) + " wheels more");
			return;
		}
		if (!checker.checkWheelConsistance(car)) {
			System.out.println("One or more car tires are deflated");
			return;
		}
		if (!car.getEngine().isFueled()) {
			System.out.println("The car's fuel tank is empty");
			return;
		}
		System.out.println("It works!");

	}

	public void changeWheels(Car car) {
		for (int i = 0; i < 4; i++) {
			if (!car.getWheels()[i].isInCondition()) {
				System.out.printf("Wheel number %d is changed.\n", i + 1);
				double wheelDiametr = car.getWheels()[i].getDiametr();
				car.getWheels()[i] = new Wheel(true, wheelDiametr);
			}
		}
	}

	public void refuel(Car car, TypeOfFuel typeOfFuel) {
		TypeOfFuel expectedFuel = car.getEngine().getFuelType();
		if (expectedFuel != typeOfFuel) {
			System.out.print("You've chose the wrong fuel type!");
			System.out.println("You should use " + expectedFuel);
		} else if (car.getEngine().isFueled()) {
			System.out.println("Your car is already  fueled!");
		} else {
			System.out.println("Your car is successfully refueled");
			car.getEngine().setFueled(true);
		}
	}
}
