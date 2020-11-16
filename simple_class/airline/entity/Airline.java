package by.epam_tc.class_programming.simple_class.airline.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.*;

public class Airline implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm");
	private TypeOfPlane typeOfPlane;
	private Set<DayOfWeek> daysOfWeek;
	private String destination;
	private long numbOfFlight;
	private Date flightTime;

	{
		daysOfWeek = new TreeSet<DayOfWeek>();
	}

	public Airline(TypeOfPlane typeOfPlane, Set<DayOfWeek> daysOfWeek, String destination, long numbOfFlight,
			Date flightTime) {
		super();
		this.typeOfPlane = typeOfPlane;
		this.daysOfWeek = daysOfWeek;
		this.destination = destination;
		this.numbOfFlight = numbOfFlight;
		this.flightTime = flightTime;
	}

	public Airline(TypeOfPlane typeOfPlane, String destination, long numbOfFlight, Date flightTime,
			DayOfWeek... daysOfWeek) {
		super();
		this.typeOfPlane = typeOfPlane;
		addDays(daysOfWeek);
		this.destination = destination;
		this.numbOfFlight = numbOfFlight;
		this.flightTime = flightTime;
	}

	public Airline() {
		this(null, "", 0, new Date(), (DayOfWeek) null);
	}

	public void addDays(DayOfWeek... daysOfWeek) {
		for (int i = 0; i < daysOfWeek.length; i++) {
			this.daysOfWeek.add(daysOfWeek[i]);
		}
	}

	public TypeOfPlane getTypeOfPlane() {
		return typeOfPlane;
	}

	public void setTypeOfPlane(TypeOfPlane typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}

	public Set<DayOfWeek> getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(TreeSet<DayOfWeek> daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getNumbOfFlight() {
		return numbOfFlight;
	}

	public void setNumbOfFlight(long numbOfFlight) {
		this.numbOfFlight = numbOfFlight;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	@Override
	public String toString() {
		return "Airline [typeOfPlane=" + typeOfPlane + ", daysOfWeek=" + daysOfWeek + ", destination=" + destination
				+ ", numbOfFlight=" + numbOfFlight + ", flightTime=" + flightTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daysOfWeek == null) ? 0 : daysOfWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightTime == null) ? 0 : flightTime.hashCode());
		result = prime * result + (int) (numbOfFlight ^ (numbOfFlight >>> 32));
		result = prime * result + ((typeOfPlane == null) ? 0 : typeOfPlane.hashCode());
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
		Airline other = (Airline) obj;
		if (daysOfWeek == null) {
			if (other.daysOfWeek != null)
				return false;
		} else if (!daysOfWeek.equals(other.daysOfWeek))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightTime == null) {
			if (other.flightTime != null)
				return false;
		} else if (!flightTime.equals(other.flightTime))
			return false;
		if (numbOfFlight != other.numbOfFlight)
			return false;
		if (typeOfPlane != other.typeOfPlane)
			return false;
		return true;
	}

}
