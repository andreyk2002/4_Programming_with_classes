package by.epam_tc.class_programminng.agregation_decomposition.account.entity;

import java.io.Serializable;
import java.util.*;

public class BankClient implements Serializable {

	private static final long serialVersionUID = 1388301524485136373L;
	private List<BankAccount> accounts;
	private String name;

	public BankClient(List<BankAccount> accounts, String name) {
		super();
		this.accounts = accounts;
		this.name = name;
	}

	public BankClient() {
		this(new ArrayList<BankAccount>(), "");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void removeAcount(int accNumber) {
		for (int i = 0; i < this.accounts.size(); i++) {
			if (accounts.get(i).getID() == accNumber) {
				accounts.remove(i);
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankClient other = (BankClient) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankClient [accounts=" + accounts + ", name=" + name + "]";
	}

}
