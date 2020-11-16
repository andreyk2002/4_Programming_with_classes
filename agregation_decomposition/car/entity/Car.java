package by.epam_tc.class_programminng.agregation_decomposition.car.entity;

import java.io.Serializable;
import java.util.Arrays;

import by.epam_tc.class_programminng.agregation_decomposition.car.logic.CarMonitoring;

public class Car implements Serializable{

	private static final long serialVersionUID = 340576022107958692L;
	private Wheel[] wheels;
	private Engine engine;
	private String carName;

	{
		wheels = new Wheel[4];
	}

	public Car(String carName, Wheel[] wheels, Engine engine) {
		super();
		setWheels(wheels);
		this.engine = engine;
		this.carName = carName;
	}
	
	
	public Car() {
		this("", new Wheel[4], new Engine());
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		for (int i = 0; i < Math.min(this.wheels.length, wheels.length); i++) {
			this.wheels[i] = wheels[i];
		}
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModelName() {
		return carName;
	}

	public void setModelName(String modelName) {
		this.carName = modelName;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + Arrays.toString(wheels) + ", engine=" + engine + ", carName=" + carName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

}
