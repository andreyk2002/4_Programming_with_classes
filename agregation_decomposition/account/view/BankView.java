package by.epam_tc.class_programminng.agregation_decomposition.account.view;

import by.epam_tc.class_programminng.agregation_decomposition.account.entity.*;

public class BankView {
	
	private static BankView instance = null;

	private BankView() {

	}

	public static BankView getInstance() {
		if (instance == null) {
			instance = new BankView();
		}
		return instance;
	}

	public void printAccounts(BankClient cl) {
		System.out.println("Client name : " + cl.getName());
		for (var el : cl.getAccounts()) {
			System.out.println(el.toString());
		}
		System.out.println();
	}

}
