package by.epam_tc.class_programminng.agregation_decomposition.car.main;

import by.epam_tc.class_programminng.agregation_decomposition.car.entity.Car;
import by.epam_tc.class_programminng.agregation_decomposition.car.entity.Engine;
import by.epam_tc.class_programminng.agregation_decomposition.car.entity.TypeOfFuel;
import by.epam_tc.class_programminng.agregation_decomposition.car.entity.Wheel;
import by.epam_tc.class_programminng.agregation_decomposition.car.logic.CarLogic;

public class CarMain {

	public static void main(String[]argc) {
		
		
		CarLogic logic = CarLogic.getInstance();
		
		Wheel[] wheels = new Wheel[4];
		
		
		Car superCar = new Car("Ferrari F40",wheels,null);
		logic.go(superCar);
		
		superCar.setEngine(new Engine(TypeOfFuel.PETROL,false,2.9,478));
		logic.go(superCar);
		
		
		for(int i = 0; i < 4; i++) {
			logic.addWheel(superCar, new Wheel(false,19.0));
		}
		logic.go(superCar);
		
		logic.changeWheels(superCar);
		logic.go(superCar);
		
		logic.refuel(superCar,TypeOfFuel.DIESEL);
		logic.refuel(superCar,TypeOfFuel.PETROL);
		
		logic.go(superCar);
		superCar.getModelName();
		
	}
}
