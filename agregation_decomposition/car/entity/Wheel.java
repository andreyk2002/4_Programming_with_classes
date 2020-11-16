package by.epam_tc.class_programminng.agregation_decomposition.car.entity;

import java.io.Serializable;

public class Wheel implements Serializable {

	private static final long serialVersionUID = -8466369927065828038L;
	private boolean inCondition;
	private double diametr;

	public Wheel(boolean inCondition, double diametr) {
		super();
		this.inCondition = inCondition;
		if (diametr <= 0) {
			throw new IllegalArgumentException("Diametr of the wheel should be bigger than 0");
		}
		this.diametr = diametr;
	}

	public Wheel() {
		this(false, 1);
	}

	public boolean isInCondition() {
		return inCondition;
	}

	public void setInCondition(boolean inCondition) {
		this.inCondition = inCondition;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diametr);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (inCondition ? 1231 : 1237);
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
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(diametr) != Double.doubleToLongBits(other.diametr))
			return false;
		if (inCondition != other.inCondition)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "diametr = " + diametr + "d." + "wheel is inflanted -" + inCondition;
	}
}
