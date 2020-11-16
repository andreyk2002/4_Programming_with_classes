package by.epam_tc.class_programming.simple_class.airline;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.util.ArrayList;

import by.epam_tc.class_programming.simple_class.airline.entity.Airline;
import by.epam_tc.class_programming.simple_class.airline.entity.CollectAirline;
import by.epam_tc.class_programming.simple_class.airline.entity.TypeOfPlane;

public class AirlineMain {
	public static void main(String[] argc) throws ParseException {

		CollectAirline airlines = new CollectAirline(new ArrayList<Airline>());

		AirlineView view = new AirlineView();
		try {

			Airline airline1;
			airline1 = new Airline(TypeOfPlane.PASSANGER_PLANE, "Minsk", 123241, Airline.DATE_FORMAT.parse("12:06"),
					DayOfWeek.MONDAY);
			airlines.getAirlines().add(airline1);

			Airline airline2;
			airline2 = new Airline(TypeOfPlane.PASSANGER_PLANE, "Moscow", 223241, Airline.DATE_FORMAT.parse("06:45"),
					DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY);
			airlines.getAirlines().add(airline2);

			Airline airline3;
			airline3 = new Airline(TypeOfPlane.PASSANGER_PLANE, "Warsaw", 909241, Airline.DATE_FORMAT.parse("13:55"),
					DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY);
			airlines.getAirlines().add(airline3);

			Airline airline4;
			airline4 = new Airline(TypeOfPlane.CROPDUSTER, "Pychovichi", 1, Airline.DATE_FORMAT.parse("21:17"),
					DayOfWeek.SUNDAY);
			airlines.getAirlines().add(airline4);

			Airline airline5;
			airline5 = new Airline(TypeOfPlane.RESCUE_PLANE, "Sydney", 54624625, Airline.DATE_FORMAT.parse("15:32"),
					DayOfWeek.MONDAY, DayOfWeek.TUESDAY);
			airlines.getAirlines().add(airline5);

			Airline airline6;
			airline6 = new Airline(TypeOfPlane.PASSANGER_PLANE, "Minsk", 1232431, Airline.DATE_FORMAT.parse("04:45"),
					DayOfWeek.MONDAY, DayOfWeek.FRIDAY);
			airlines.getAirlines().add(airline6);

			Airline airline7;
			airline7 = new Airline(TypeOfPlane.CARGO_PLANE, "Vilnus", 18823241, Airline.DATE_FORMAT.parse("9:56"),
					DayOfWeek.SUNDAY, DayOfWeek.WEDNESDAY);
			airlines.getAirlines().add(airline7);
		} catch (ParseException pE) {
			System.out.println(pE.getMessage());
			System.exit(1);
		}
		System.out.println("Flights by day");
		view.showFlightsByDay(airlines, DayOfWeek.MONDAY);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Flights by day and time");
		view.showFlightsByDay(airlines, DayOfWeek.WEDNESDAY, Airline.DATE_FORMAT.parse("8:00"));
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Flights by destination city");
		view.showFlightsByDestination(airlines, "Minsk");
	}

}
