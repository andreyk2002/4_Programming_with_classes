package by.epam_tc.class_programming.simple_class.train.logic;

import by.epam_tc.class_programming.simple_class.train.Train;

public class TrainSort {

	public void byNumber(Train[] arr, int begin, int end) {
		if (begin < end) {
			int divideIndex = partition(arr, begin, end);

			byNumber(arr, begin, divideIndex - 1);
			byNumber(arr, divideIndex, end);
		}
	}

	public void byDestination(Train[] trains) {

		int i = 0;
		int len;
		len = trains.length;

		while (i < len - 1) {
			int compare;
			compare = trains[i].getPlaceName().compareToIgnoreCase(trains[i + 1].getPlaceName());
			if (compare < 0) {
				i++;
			} else if (compare == 0) {
				int compTime;
				compTime = trains[i].getArrivalTime().compareTo(trains[i + 1].getArrivalTime());
				if (compTime <= 0) {
					i++;
				} else {
					Train tmp;
					tmp = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = tmp;
					if (i > 0) {
						i--;
					}
				}
			} else {
				Train tmp;
				tmp = trains[i];
				trains[i] = trains[i + 1];
				trains[i + 1] = tmp;
				if (i > 0) {
					i--;
				}
			}
		}
	}
	
	private int partition(Train[] arr, int begin, int end) {
		int rightIndex;
		int leftIndex;

		rightIndex = end;
		leftIndex = begin;

		int pivot;
		pivot = arr[(begin + end) / 2].getNumber();

		while (leftIndex <= rightIndex) {
			// >
			while (arr[leftIndex].getNumber() < pivot) {
				leftIndex++;
			}
			// <
			while (arr[rightIndex].getNumber() > pivot) {
				rightIndex--;
			}
			if (leftIndex <= rightIndex) {
				swap(arr, rightIndex, leftIndex);
				leftIndex++;
				rightIndex--;
			}
		}
		return leftIndex;
	}
	
	private void swap(Train[] arr, int pos1, int pos2) {
		Train tmp;
		tmp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = tmp;
	}

}
