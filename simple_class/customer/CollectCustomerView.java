package by.epam_tc.class_programming.simple_class.customer;

import by.epam_tc.class_programming.simple_class.customer.entity.CollectCustomer;

public class CollectCustomerView {

	public void showInfo(CollectCustomer customers) {
		for (var customer : customers.getCollectCustomer()) {
			System.out.println(customer.toString());
		}
	}
	
	public void showByCreditNumber(CollectCustomer customers, long minNumber, long maxNumb) {

		int howMany = 0;
		for (var customer : customers.getCollectCustomer()) {
			long number;
			number = customer.getCreditNumber();
			if (number >= minNumber && number <= maxNumb) {
				System.out.println(customer.toString());
				howMany++;
			}
		}
		if (howMany == 0) {
			System.out.println("Customers with entered credit card numbers are not found");
		}
	}

}
