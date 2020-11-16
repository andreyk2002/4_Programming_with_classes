package by.epam_tc.class_programming.simple_class.train;

import java.text.ParseException;

import by.epam_tc.class_programming.simple_class.train.logic.TrainSort;
import by.epam_tc.class_programming.simple_class.train.view.TrainView;

public class TrainMain {
	public static void main(String[] argc) {
		TrainSort trainSort = new TrainSort();
		TrainView trainView = new TrainView();
		Train[] trains = new Train[5];

		try {
			trains[0] = new Train("D", 1, Train.DATE_FORMAT.parse("7:50"));
			trains[1] = new Train("B", 35, Train.DATE_FORMAT.parse("1:40"));
			trains[2] = new Train("B", 34, Train.DATE_FORMAT.parse("1:40"));
			trains[3] = new Train("B", 36, Train.DATE_FORMAT.parse("1:40"));
			trains[4] = new Train("A", 16, Train.DATE_FORMAT.parse("9:59"));
		} catch (ParseException e) {

			System.out.println(e.getMessage());
			System.exit(1);
		}

		System.out.print(trainView.getAllTrainsInfo(trains));

		System.out.println("=============================");
		trainSort.byDestination(trains);
		System.out.println("After sorting by destination");
		System.out.print(trainView.getAllTrainsInfo(trains));

		System.out.println("=============================");
		trainSort.byNumber(trains, 0, trains.length - 1);
		System.out.println("After sorting by number");
		System.out.print(trainView.getAllTrainsInfo(trains));

		System.out.println("=============================");
		System.out.println(trainView.infoByName(trains));
	}
}
