package by.epam_tc.class_programminng.agregation_decomposition.account.logic;

import java.util.*;


import by.epam_tc.class_programminng.agregation_decomposition.account.entity.BankAccount;
import by.epam_tc.class_programminng.agregation_decomposition.account.entity.BankClient;

public class BankLogic {
	
	private static BankLogic instance = null;
	
	private BankLogic() {
		
	}
	
	public static BankLogic getInstance() {
		if(instance == null) {
			instance = new BankLogic();
		}
		return instance;
	}

	public BankAccount findById(long id,List<BankAccount> accounts) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getID() == id) {
				return accounts.get(i);
			}
		}
		return null;
	}

	public String getTotalSum(BankClient cl) {
		Double sum = 0.0;
		for (var account : cl.getAccounts()) {
			if (!account.isBlocked() && account.getBalance() >= 0) {
				sum += account.getBalance();

			}
		}
		return sum.toString() + " USD.";
	}

	public String getPositiveSum(BankClient cl) {
		Double positiveSum = 0.0;
		for (var account : cl.getAccounts()) {
			if (!account.isBlocked() && account.getBalance() >= 0) {
				positiveSum += account.getBalance();
			}
		}
		return positiveSum.toString() + " USD.";
	}

	public String getNegativeSum(BankClient cl) {
		Double negativeSum = 0.0;
		for (var account : cl.getAccounts()) {
			if (!account.isBlocked() && account.getBalance() < 0) {
				negativeSum += account.getBalance();
			}
		}
		return negativeSum.toString() + " USD.";
	}

	public BankAccount findByID(BankClient cl, long id) {
		for (var account : cl.getAccounts()) {
			if (account.getID() == id) {
				return account;
			}
		}
		return null;
	}
	

	public void sortByBalance(BankClient client) {
		client.getAccounts().sort(Comparator.comparing(BankAccount::getBalance));
	}
}
