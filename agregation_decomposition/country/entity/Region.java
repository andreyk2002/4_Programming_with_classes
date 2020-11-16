package by.epam_tc.class_programminng.agregation_decomposition.country.entity;

import java.io.Serializable;

public class Region implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private City regCenter;
	private String regName;
	private double area;

	public Region() throws Exception {
		this(0, new City(), "default region name");
	}
	
	public Region(double area, City regCenter, String regName) throws Exception {
		super();

		setArea(area);
		this.regCenter = regCenter;
		this.regName = regName;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) throws IllegalArgumentException {
		if (area < 0) {
			throw new IllegalArgumentException("Wrong area parametr for region" + this.getRegName());
		}
		this.area = area;
	}

	public City getRegCenter() {
		return regCenter;
	}

	public void setRegCenter(City regCenter) {
		this.regCenter = regCenter;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((regCenter == null) ? 0 : regCenter.hashCode());
		result = prime * result + ((regName == null) ? 0 : regName.hashCode());
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
		Region other = (Region) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (regCenter == null) {
			if (other.regCenter != null)
				return false;
		} else if (!regCenter.equals(other.regCenter))
			return false;
		if (regName == null) {
			if (other.regName != null)
				return false;
		} else if (!regName.equals(other.regName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Region - " + regName + ", regCenter - " + regCenter.getName() + ", area - " + area;

	}

}
