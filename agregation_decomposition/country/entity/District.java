package by.epam_tc.class_programminng.agregation_decomposition.country.entity;

import java.io.Serializable;
import java.util.*;

import by.epam_tc.class_programminng.agregation_decomposition.country.logic.CountryLogic;

public class District implements Serializable{

	
	private static final long serialVersionUID = 1920428489907538315L;
	private String name;
	private City districtCenter;
	private double districtArea;
	private List<Region> districtRegions;

	public District() {
		this("Default district name", new City(), new ArrayList<Region>());
	}

	public District(String name, City districtCenter, List<Region> districtRegions) {
		super();
		this.name = name;
		this.districtCenter = districtCenter;
		this.districtRegions = districtRegions;
	}
	
	public String getName() {
		return name;
	}

	public int getRegionsAmount() {
		return districtRegions.size();
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City districtCenter) {
		this.districtCenter = districtCenter;
	}

	public List<Region> getDistrictRegions() {
		return districtRegions;
	}

	public void setDistrictRegions(List<Region> districtRegions) {
		this.districtRegions = districtRegions;
	}

	public double getDistrictArea() {
		this.districtArea = CountryLogic.countDistrictArea(this);
		return districtArea;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", districtCenter=" + districtCenter + ", districtArea="
				+ districtArea + ", districtRegions=" + districtRegions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(districtArea);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((districtCenter == null) ? 0 : districtCenter.hashCode());
		result = prime * result + ((districtRegions == null) ? 0 : districtRegions.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		District other = (District) obj;
		if (Double.doubleToLongBits(districtArea) != Double.doubleToLongBits(other.districtArea))
			return false;
		if (districtCenter == null) {
			if (other.districtCenter != null)
				return false;
		} else if (!districtCenter.equals(other.districtCenter))
			return false;
		if (districtRegions == null) {
			if (other.districtRegions != null)
				return false;
		} else if (!districtRegions.equals(other.districtRegions))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
