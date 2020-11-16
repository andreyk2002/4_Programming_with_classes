package by.epam_tc.class_programming.simple_class.airline;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Date;

import by.epam_tc.class_programming.simple_class.airline.entity.Airline;
import by.epam_tc.class_programming.simple_class.airline.entity.CollectAirline;

public class AirlineView {

	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm");
	
	public String getDays(Airline a) {
		StringBuilder strB = new StringBuilder();
		for (var i : a.getDaysOfWeek()) {
			strB.append(i.toString() + " ");
		}
		return strB.toString();
	}

	public String getAirlineInfo(Airline a) {
		StringBuilder strB = new StringBuilder();
		strB.append("Type of plane : " + a.getTypeOfPlane());
		strB.append("\nDestination :" + a.getDestination());
		strB.append("\nArrival time : " + DATE_FORMAT.format(a.getFlightTime()));
		strB.append("\nNumber of a flight : " + a.getNumbOfFlight());
		strB.append("\nDays of flights : " + this.getDays(a) + "\n");
		return strB.toString();
	}

	public void showFlightsByDestination(CollectAirline airlines, String place) {
		for (var current : airlines.getAirlines()) {
			if (current.getDestination() == place) {
				System.out.println(this.getAirlineInfo(current));
			}
		}
	}

	public void showFlightsByDay(CollectAirline airlines, DayOfWeek dayOfWeek) {
		for (var current : airlines.getAirlines()) {
			for (var day : current.getDaysOfWeek()) {
				if (day.toString() == dayOfWeek.toString()) {
					System.out.println(this.getAirlineInfo(current));
					break;
				}
			}
		}
	}

	public void showFlightsByDay(CollectAirline airlines, DayOfWeek dayOfWeek, Date minTime) {
		for (var current : airlines.getAirlines()) {
			if (current.getFlightTime().compareTo(minTime) > 0) {
				for (var day : current.getDaysOfWeek()) {
					if (day.toString() == dayOfWeek.toString()) {
						System.out.println(this.getAirlineInfo(current));
						break;
					}
				}
			}
		}
	}

}
