package by.epam_tc.class_programminng.agregation_decomposition.car.entity;

import java.io.Serializable;

public class Engine implements Serializable {

	private static final long serialVersionUID = -8306364446143813823L;
	private TypeOfFuel fuelType;
	private boolean isFueled;
	private double volume;
	private double power;

	public Engine(TypeOfFuel fuelType, boolean isFueled, double volume, double power) {
		super();
		this.fuelType = fuelType;
		this.isFueled = isFueled;
		if (power <= 0 || volume < 0) {
			throw new IllegalArgumentException("Power of the engine and its volume should be positive");
		}

		this.volume = volume;
		this.power = power;
	}

	public Engine() {
		this(TypeOfFuel.PETROL, false, 0, 1);
	}

	public boolean isFueled() {
		return isFueled;
	}

	public void setFueled(boolean isFueled) {
		this.isFueled = isFueled;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public TypeOfFuel getFuelType() {
		return fuelType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		result = prime * result + (isFueled ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(power);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Engine other = (Engine) obj;
		if (fuelType != other.fuelType)
			return false;
		if (isFueled != other.isFueled)
			return false;
		if (Double.doubleToLongBits(power) != Double.doubleToLongBits(other.power))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "fuel type - " + fuelType + " has fuel - " + isFueled + ", volume = " + volume + ", power = " + power
				+ "hp.";
	}
}
