package by.epam_tc.class_programminng.agregation_decomposition.tourism.logic;

import java.util.*;
import java.util.Comparator;

import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.CollectTour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.MealType;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.Tour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.Transport;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.TypeOfTour;

public class TourLogic {

	private static TourLogic instance = null;

	private TourLogic() {

	}

	public static TourLogic getInstance() {
		if (instance == null) {
			instance = new TourLogic();
		}
		return instance;
	}

	public void sortToursByPrice(CollectTour setTours) {
		setTours.getTours().sort(Comparator.comparing(Tour::getPrice));
	}

	public void sortToursByDaysCount(CollectTour setTours) {
		setTours.getTours().sort(Comparator.comparing(Tour::getDaysCount));
	}

	public CollectTour selectByTourPackageType(CollectTour setTours, TypeOfTour type) {
		CollectTour toursByType = new CollectTour(new ArrayList<Tour>());
		for (Tour tour : setTours.getTours()) {
			if (tour.getType().equals(type)) {
				toursByType.getTours().add(tour);
			}
		}
		return toursByType;
	}

	public CollectTour selectByMoreOption(CollectTour setTours, Transport transport) {
		CollectTour toursTransport = new CollectTour(new ArrayList<Tour>());
		for (Tour tour : setTours.getTours()) {
			if (tour.getTransport().equals(transport)) {
				toursTransport.getTours().add(tour);
			}
		}
		return toursTransport;
	}

	public CollectTour selectByMoreOption(CollectTour setTours, Transport transport, MealType foodType) {
		CollectTour toursTransportAndFood = selectByMoreOption(setTours, transport);
		for (Tour tour : setTours.getTours()) {
			if (!tour.getMealType().equals(foodType)) {
				toursTransportAndFood.getTours().remove(tour);
			}
		}
		return toursTransportAndFood;
	}

	public CollectTour selectByMoreOption(CollectTour setTours, int minDays, int maxDays) {
		CollectTour toursDays = new CollectTour(new ArrayList<Tour>());
		for (Tour tour : setTours.getTours()) {
			if (tour.getDaysCount() >= minDays && tour.getDaysCount() <= maxDays) {
				toursDays.getTours().add(tour);
			}
		}
		return toursDays;
	}

	public CollectTour selectByMoreOption(CollectTour setTours, Transport transport, MealType foodType, int minDays,
			int maxDays) {
		CollectTour toursTransportFoodDays = selectByMoreOption(setTours, transport, foodType);
		for (Tour tour : setTours.getTours()) {
			if (!(tour.getDaysCount() >= minDays && tour.getDaysCount() <= maxDays)) {
				toursTransportFoodDays.getTours().remove(tour);
			}
		}
		return toursTransportFoodDays;
	}
}
