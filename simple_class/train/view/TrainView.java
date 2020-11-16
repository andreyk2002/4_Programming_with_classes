package by.epam_tc.class_programming.simple_class.train.view;

import by.epam_tc.class_programming.simple_class.train.Train;

public class TrainView {
	
	private TrainUser user_input = new TrainUser();
	
	public String infoByName(Train[] trains) {
		showAviableTrainsNumbers(trains);
		int number = user_input.getInt("Enter number of the train");
		Train train = user_input.findTrainByNumber(number,trains);
		
		if(train != null) {
			return getInfo(train);
		}
		return "Can't find train with number " + number;
	}
	
	private void showAviableTrainsNumbers(Train[] trains) {
		System.out.print("Avaiable numbers: ");
		for(int i = 0; i < trains.length; i++) {
			System.out.print(trains[i].getNumber() + " ");
		}
		System.out.println();
	}

	public String getInfo(Train tr) {
		StringBuilder info = new StringBuilder();
		info.append("The number of the train is " + tr.getNumber() + "; ");
		info.append("This train goes to " + tr.getPlaceName() + "; ");
		info.append("The arrival time is ");
		info.append(Train.DATE_FORMAT.format(tr.getArrivalTime()));
		return info.toString();
	}

	public String getAllTrainsInfo(Train[]trains) {
		StringBuilder info = new StringBuilder();
		for(var tr : trains) {
			info.append(getInfo(tr) + "\n");
		}
		return info.toString();
	}
}
