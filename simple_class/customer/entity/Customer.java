package by.epam_tc.class_programming.simple_class.customer.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Customer implements Serializable {

	private static final long serialVersionUID = 4614413661977217418L;
	private final int ID;
	private static int nextId = 0;
	private String name;
	private String surname;
	private String fatherName;
	private String adress;
	private long creditNumber;
	private int[] bankAccountNumber;

	public String getAdress() {
		return adress;
	}

	public Customer() {
		this("", "", "", "", -1, new int[] { 0 });
	}

	public Customer(String surname, String name, String adress, long creditNumber, int[] bankAccountNumber) {
		this(surname, name, "", adress, creditNumber, bankAccountNumber);
	}

	public Customer(String surname, String name, String fatherName, String adress, long creditNumber,
			int[] bankAccountNumber) {
		super();
		++nextId;
		ID = nextId;
		this.name = name;
		this.surname = surname;
		this.fatherName = fatherName;
		this.adress = adress;
		this.creditNumber = creditNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	

	public long getCreditNumber() {
		return creditNumber;
	}

	public String getBankAccountNumber() {

		StringBuilder strB = new StringBuilder();
		for (int i = 0; i < bankAccountNumber.length; i++) {
			strB.append(bankAccountNumber[i]);
		}
		return strB.toString();
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getFullName() {
		return surname + name + fatherName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + Arrays.hashCode(bankAccountNumber);
		result = prime * result + (int) (creditNumber ^ (creditNumber >>> 32));
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (ID != other.ID)
			return false;
		if (adress == null) {
			if (other.adress != null)
				return false;
		} else if (!adress.equals(other.adress))
			return false;
		if (!Arrays.equals(bankAccountNumber, other.bankAccountNumber))
			return false;
		if (creditNumber != other.creditNumber)
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "ID = " + ID + ", " + surname + " " + name + ", " + "adress = " + adress + ", creditNumber = "
				+ creditNumber + ", bankAccountNumber = " + this.getBankAccountNumber();
	}
}
