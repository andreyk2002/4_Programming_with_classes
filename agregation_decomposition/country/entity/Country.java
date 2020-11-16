package by.epam_tc.class_programminng.agregation_decomposition.country.entity;

import java.io.Serializable;
import java.util.*;

import by.epam_tc.class_programminng.agregation_decomposition.country.logic.CountryLogic;

public class Country implements Serializable{
	
	private static final long serialVersionUID = -3367338612037948581L;
	private City capital;
	private List<District> districts;
	private String countryName;
	private double area;
	
	public Country() {
		this(new City(), new ArrayList<District>(), "default country name");
	}

	public Country(City capital, List<District> districts, String countryName) {
		super();
		this.capital = capital;
		this.districts = districts;
		this.countryName = countryName;
	}

	public double getArea() {
		this.area = CountryLogic.countCountryArea(this);
		return area;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [capital=" + capital + ", districts=" + districts + ", countryName=" + countryName + ", area="
				+ area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
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
		Country other = (Country) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		return true;
	}

}
