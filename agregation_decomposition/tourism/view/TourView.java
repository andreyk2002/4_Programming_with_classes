package by.epam_tc.class_programminng.agregation_decomposition.tourism.view;

import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.CollectTour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.Tour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.logic.TourLogic;

public class TourView {

	private static TourView instance = null;

	private TourView() {

	}

	public static TourView getInstance() {
		if (instance == null) {
			instance = new TourView();
		}
		return instance;
	}

	public void printTours(CollectTour tours) {
		if (tours.getTours().size() == 0) {
			System.out.println("not found");
			return;
		}
		for (Tour tour : tours.getTours()) {
			System.out.println(tour.toString());
		}
	}
}
