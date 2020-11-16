package by.epam_tc.class_programminng.agregation_decomposition.account.entity;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private static final long serialVersionUID = 5233244014479117589L;
	private double balance;
	private static long nextId = 0;
	private final long ID;
	private boolean isBlocked;

	public BankAccount(double money, boolean isBlocked) {
		super();
		this.balance = money;
		this.ID = ++nextId;
		this.isBlocked = isBlocked;
	}

	public BankAccount() {
		this(0, true);
	}

	public void changeBlock() {
		boolean newBlock = !this.isBlocked;
		this.isBlocked = newBlock;
	}

	//Надеюсь, я правильно сделал, что не стал выносить
	//два небольших метода (логики) в отдельный класс 
	
	public void spendBalance(int money) {
		if (!isBlocked) {
			this.balance -= money;
		}
	}

	public void addBalance(int money) {
		if (!isBlocked) {
			this.balance += money;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double money) {
		this.balance = money;
	}

	public long getID() {
		return ID;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isBlocked ? 1231 : 1237);
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
		BankAccount other = (BankAccount) obj;
		if (ID != other.ID)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account ID - " + ID + "; balance on account - " + balance + "; blocked: " + isBlocked;
	}

}
