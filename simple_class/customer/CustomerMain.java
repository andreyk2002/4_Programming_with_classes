package by.epam_tc.class_programming.simple_class.customer;

import java.util.ArrayList;

import by.epam_tc.class_programming.simple_class.customer.entity.CollectCustomer;
import by.epam_tc.class_programming.simple_class.customer.entity.Customer;

public class CustomerMain {

	public static void main(String[] argc) {
		
		CustomerSort sort = new CustomerSort();
		CollectCustomerView view = new CollectCustomerView();

		CollectCustomer clients = new CollectCustomer(new ArrayList<>());

		clients.addCustomer(new Customer("Kashkevich", "Serge", "Ivanovich", "Minsk", 23456789L,
				new int[] { 9, 0, 7, 1, 4, 2, 4, 2, 2, 2, 2, 2 }));

		clients.addCustomer(new Customer("Matveev", "Genadiy", "Vasilievich", "Minsk", 2345678933L,
				new int[] { 5, 6, 7, 1, 4, 2, 4, 2, 2, 2, 2, 2 }));

		clients.addCustomer(
				new Customer("Antonov", "Fedor", "Moscow", 23146789L, new int[] { 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2 }));

		clients.addCustomer(
				new Customer("Petrov", "Petr", "Vitebsk", 2312424124L, new int[] { 2, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2 }));
		clients.addCustomer(new Customer("Vasilkov", "Dmitry", "Michailovich", "Minsk", 2351353251L,
				new int[] { 2, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3 }));
		clients.addCustomer(new Customer("Petrovich", "Egor", "Ivanovich", "Gomel", 35987395511L,
				new int[] { 2, 1, 1, 1, 3, 1, 1, 1, 1, 2, 2 }));
		clients.addCustomer(new Customer("Ivanov", "Ivan", "Ivanovich", "Grodno", 3498571948357L,
				new int[] { 3, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2 }));
		clients.addCustomer(new Customer("Dombrowski", "Andrey", "Warsaw", 3487149867198476L,
				new int[] { 2, 1, 1, 1, 3, 5, 1, 1, 1, 1, 2 }));
		clients.addCustomer(new Customer("Heisenberg", "Walt", "Berlin", 348598947698847777L,
				new int[] { 9, 1, 1, 1, 3, 1, 1, 1, 1, 1, 2 }));

		try {
			System.out.println("Sort by alphabet :");
			sort.sortByAlphabet(clients);
			view.showInfo(clients);
			System.out.println("\nInfo by credit number interval:");
			view.showByCreditNumber(clients,2351353250L, 3487149867198476L);
		} catch (NullPointerException nE) {
			System.out.println("bank accout number was undefined");
		}
	}
}
