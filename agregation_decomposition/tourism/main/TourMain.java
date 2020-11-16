package by.epam_tc.class_programminng.agregation_decomposition.tourism.main;

import java.util.ArrayList;

import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.CollectTour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.MealType;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.Tour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.Transport;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.entity.TypeOfTour;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.logic.TourLogic;
import by.epam_tc.class_programminng.agregation_decomposition.tourism.view.TourView;

public class TourMain {

	public static void main(String... argc) {
		CollectTour tourAgency = new CollectTour(new ArrayList<Tour>());
		try {
			tourAgency.getTours().add(new Tour(7, 800, Transport.PLANE, TypeOfTour.HOLIDAY, MealType.ALL_INCLUSIVE,
					"Barselona Grand Hotel"));
			tourAgency.getTours().add(
					new Tour(12, 1800, Transport.PLANE, TypeOfTour.HOLIDAY, MealType.ALL_INCLUSIVE, "Hilton Greece"));
			tourAgency.getTours()
					.add(new Tour(12, 1400, Transport.PLANE, TypeOfTour.HOLIDAY, MealType.HALF_BOARD, "Hilton Greece"));
			tourAgency.getTours().add(
					new Tour(10, 1000, Transport.PLANE, TypeOfTour.HOLIDAY, MealType.ALL_INCLUSIVE, "Samoa Spa Resort"));
			tourAgency.getTours().add(
					new Tour(7, 550, Transport.BUS, TypeOfTour.HOLIDAY, MealType.ALL_INCLUSIVE, "Burgos Resort Hotel"));
			tourAgency.getTours()
					.add(new Tour(7, 380, Transport.TRAIN, TypeOfTour.HOLIDAY, MealType.BREAKFAST, "Sochi hotel"));

			tourAgency.getTours().add(
					new Tour(22, 2200, Transport.SHIP, TypeOfTour.CRUISE, MealType.ALL_INCLUSIVE, "European cruise"));
			tourAgency.getTours().add(new Tour(14, 2500, Transport.SHIP, TypeOfTour.CRUISE, MealType.ALL_INCLUSIVE,
					"Norwegian fiords by ship"));
			tourAgency.getTours().add(new Tour(90, 5000, Transport.SHIP, TypeOfTour.CRUISE, MealType.ALL_INCLUSIVE,
					"Across the world in 90 days"));

			tourAgency.getTours()
					.add(new Tour(4, 900, Transport.PLANE, TypeOfTour.EXCURSION, MealType.BREAKFAST, "Visit Paris"));
			tourAgency.getTours().add(new Tour(5, 1000, Transport.PLANE, TypeOfTour.EXCURSION, MealType.BREAKFAST,
					"Attractions of London"));
			tourAgency.getTours().add(new Tour(4, 500, Transport.TRAIN, TypeOfTour.EXCURSION, MealType.HALF_BOARD,
					"St.Petersburg museum and palaces"));
			tourAgency.getTours()
					.add(new Tour(1, 40, Transport.BUS, TypeOfTour.EXCURSION, MealType.NONE, "Visit Mir Castle"));
			tourAgency.getTours().add(new Tour(4, 1050, Transport.PLANE, TypeOfTour.EXCURSION, MealType.FULL_BOARD,
					"Attractions of Rome"));

			tourAgency.getTours()
					.add(new Tour(2, 100, Transport.BUS, TypeOfTour.SHOPPING, MealType.NONE, "Shopping in Vulnus"));
			tourAgency.getTours()
					.add(new Tour(2, 130, Transport.BUS, TypeOfTour.SHOPPING, MealType.NONE, "Shopping in Belostok"));
			tourAgency.getTours().add(
					new Tour(3, 400, Transport.PLANE, TypeOfTour.SHOPPING, MealType.BREAKFAST, "Best turkish textile"));
			tourAgency.getTours().add(new Tour(3, 700, Transport.PLANE, TypeOfTour.SHOPPING, MealType.HALF_BOARD,
					"MainProg shopping center, New York"));
			tourAgency.getTours()
					.add(new Tour(3, 500, Transport.PLANE, TypeOfTour.SHOPPING, MealType.BREAKFAST, "Milan fashion"));
			tourAgency.getTours()
					.add(new Tour(3, 340, Transport.BUS, TypeOfTour.SHOPPING, MealType.BREAKFAST, "Milan fashion"));

			tourAgency.getTours()
					.add(new Tour(10, 550, Transport.TRAIN, TypeOfTour.THREATMENT, MealType.FULL_BOARD, "Kislovodsk"));
			tourAgency.getTours()
					.add(new Tour(10, 480, Transport.TRAIN, TypeOfTour.THREATMENT, MealType.HALF_BOARD, "Essentyki"));
			tourAgency.getTours()
					.add(new Tour(12, 530, Transport.TRAIN, TypeOfTour.THREATMENT, MealType.FULL_BOARD, "XZ"));
			tourAgency.getTours().add(new Tour(12, 420, Transport.TRAIN, TypeOfTour.THREATMENT, MealType.HALF_BOARD,
					"Sanatoriy \"Borovoe\""));
			tourAgency.getTours().add(new Tour(14, 460, Transport.BUS, TypeOfTour.THREATMENT, MealType.FULL_BOARD,
					"Sanatoriy \\\"Lesnoe\\\"(with full-board meal) "));
			tourAgency.getTours().add(new Tour(14, 400, Transport.BUS, TypeOfTour.THREATMENT, MealType.HALF_BOARD,
					"Sanatoriy \\\"Lesnoe\\\"(with half-board meal)"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		TourLogic logic =TourLogic.getInstance();
		TourView view = TourView.getInstance();

		System.out.println("Select by shopping:");
		CollectTour selectByType = logic.selectByTourPackageType(tourAgency, TypeOfTour.SHOPPING);
		view.printTours(selectByType);

		System.out.println("\nSelect by plane:");
		CollectTour selectByTransport = logic.selectByMoreOption(tourAgency, Transport.PLANE);
		view.printTours(selectByTransport);

		System.out.println("\nSelect by bus and breakfast:");
		CollectTour selectByTransportFood = logic.selectByMoreOption(tourAgency, Transport.BUS, MealType.BREAKFAST);
		view.printTours(selectByTransportFood);

		System.out.println("\nSelect by train, half-board, for 7-12 days:");
		CollectTour selectByTransportFoodDays = logic.selectByMoreOption(tourAgency, Transport.TRAIN,
				MealType.HALF_BOARD, 7, 12);
		view.printTours(selectByTransportFoodDays);

		System.out.println("\nSelect for 2-5 days:");
		CollectTour selectByDays = logic.selectByMoreOption(tourAgency, 2, 5);
		view.printTours(selectByDays);
	}

}
