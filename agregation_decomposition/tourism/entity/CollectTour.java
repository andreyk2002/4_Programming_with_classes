package by.epam_tc.class_programminng.agregation_decomposition.tourism.entity;

import java.io.Serializable;
import java.util.*;

public class CollectTour implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Tour> tours;

	public List<Tour> getTours() {
		return tours;
	}

	public CollectTour(List<Tour> tours) {
		super();
		this.tours = tours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		CollectTour other = (CollectTour) obj;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CollectTour [tours=" + tours + "]";
	}

	
}
