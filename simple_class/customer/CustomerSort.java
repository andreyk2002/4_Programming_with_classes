package by.epam_tc.class_programming.simple_class.customer;

import java.util.*;

import by.epam_tc.class_programming.simple_class.customer.entity.CollectCustomer;
import by.epam_tc.class_programming.simple_class.customer.entity.Customer;

public class CustomerSort {

	public void sortByAlphabet(CollectCustomer collectCustomer) {
		sortByAlphabet(0, collectCustomer.getCollectCustomer().size() - 1, collectCustomer.getCollectCustomer());
	}

	private void sortByAlphabet(int begin, int end, List<Customer> list) {
		if (begin < end) {
			int divideIndex = partition(begin, end, list);

			sortByAlphabet(begin, divideIndex - 1, list);
			sortByAlphabet(divideIndex, end, list);
		}
	}

	private int partition(int begin, int end, List<Customer> list) {
		int rightIndex;
		int leftIndex;

		rightIndex = end;
		leftIndex = begin;

		String pivot;
		Customer pivotCustomer;
		pivotCustomer = list.get((begin + end) / 2);
		pivot = pivotCustomer.getFullName();

		while (leftIndex <= rightIndex) {

			int compL;
			compL = list.get(leftIndex).getFullName().compareTo(pivot);
			while (compL < 0) {

				leftIndex++;
				compL = list.get(leftIndex).getFullName().compareTo(pivot);
			}

			int compR;
			compR = list.get(rightIndex).getFullName().compareTo(pivot);

			while (compR > 0) {
				rightIndex--;
				compR = list.get(rightIndex).getFullName().compareTo(pivot);
			}
			if (leftIndex <= rightIndex) {
				swap(rightIndex, leftIndex, list);
				leftIndex++;
				rightIndex--;
			}
		}
		return leftIndex;
	}

	private void swap(int pos1, int pos2, List<Customer> list) {
		Customer tmp;
		tmp = list.get(pos1);
		list.set(pos1, list.get(pos2));
		list.set(pos2, tmp);
	}
}
