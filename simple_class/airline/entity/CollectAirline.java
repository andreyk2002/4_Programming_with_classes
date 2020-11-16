package by.epam_tc.class_programming.simple_class.airline.entity;

import java.io.Serializable;
import java.util.*;

public class CollectAirline implements Serializable{
	
	private static final long serialVersionUID = 3872560721117464892L;
	private List<Airline> airlines;
	
	public List<Airline> getAirlines() {
		return airlines;
	}
	
	public CollectAirline(List<Airline> airlines) {
		super();
		this.airlines = airlines;
	}

	public CollectAirline() {
		this.airlines = new ArrayList<Airline>();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
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
		CollectAirline other = (CollectAirline) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CollectAirline [airlines=" + airlines + "]";
	}
	
	
	
}
