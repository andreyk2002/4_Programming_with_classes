package by.epam_tc.class_programminng.agregation_decomposition.account.main;

import java.util.ArrayList;

import by.epam_tc.class_programminng.agregation_decomposition.account.entity.BankAccount;
import by.epam_tc.class_programminng.agregation_decomposition.account.entity.BankClient;
import by.epam_tc.class_programminng.agregation_decomposition.account.logic.BankLogic;
import by.epam_tc.class_programminng.agregation_decomposition.account.view.BankView;

public class BankMain {
	 
	
	public static void main(String[] argc) {
		
		BankView view = BankView.getInstance();
		BankLogic logic = BankLogic.getInstance();
		
		BankClient ivanovIvan = new BankClient(new ArrayList<BankAccount>(), "Ivanov Ivan");
		BankClient sidorovIvan = new BankClient(new ArrayList<BankAccount>(), "Sidorov Ivan");

		ivanovIvan.getAccounts().add(new BankAccount(105.25, false));
		ivanovIvan.getAccounts().add(new BankAccount(200.99, false));
		ivanovIvan.getAccounts().add(new BankAccount(-500.01, false));
		ivanovIvan.getAccounts().add(new BankAccount(300.13, true));

		sidorovIvan.getAccounts().add(new BankAccount(445.25, false));
		sidorovIvan.getAccounts().add(new BankAccount(2033.99, true));
		sidorovIvan.getAccounts().add(new BankAccount(-340.71, true));
		sidorovIvan.getAccounts().add(new BankAccount(90.13, true));
		sidorovIvan.getAccounts().add(new BankAccount(533.99, true));
		sidorovIvan.getAccounts().add(new BankAccount(-540.71, false));
		sidorovIvan.getAccounts().add(new BankAccount(567.44, false));

		System.out.println("Trying to spend some money from all client accounts:");

		for (int i = 0; i < sidorovIvan.getAccounts().size(); i++) {
			BankAccount acc;
			acc = sidorovIvan.getAccounts().get(i);

			System.out.print("ID of account - " + acc.getID());
			System.out.print(". Balance before spending - " + acc.getBalance());
			acc.spendBalance(50);
			System.out.print("; Balance after spending - " + acc.getBalance());
			System.out.println();
		}
		System.out.println();
		long id = 1;
		BankAccount firstAccount;
		firstAccount = logic.findById(id, ivanovIvan.getAccounts());

		if (firstAccount != null) {
			System.out.println("Find account - " + firstAccount.toString());
		} else {
			System.out.println("Can't find account with ID = " + id + "In chosen field.");
		}
		System.out.println();
		logic.sortByBalance(sidorovIvan);
		logic.sortByBalance(ivanovIvan);

		view.printAccounts(ivanovIvan);
		view.printAccounts(sidorovIvan);
		
		System.out.println(ivanovIvan.getName() + ", total balance: " + logic.getTotalSum(ivanovIvan));
		System.out.println(sidorovIvan.getName() + ", total balance: " + logic.getTotalSum(sidorovIvan));

		System.out.println();
		System.out.println(ivanovIvan.getName() + ", positive balance: " + logic.getPositiveSum(ivanovIvan));
		System.out.println(sidorovIvan.getName() + ", positive balance: " + logic.getPositiveSum(sidorovIvan));

		System.out.println();
		System.out.println(ivanovIvan.getName() + ", negative balance: " + logic.getNegativeSum(ivanovIvan));
		System.out.println(sidorovIvan.getName() + ", negative balance: " + logic.getNegativeSum(sidorovIvan));
	}

}
