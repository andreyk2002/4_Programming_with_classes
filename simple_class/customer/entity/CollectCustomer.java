package by.epam_tc.class_programming.simple_class.customer.entity;

import java.io.Serializable;
import java.util.*;

public class CollectCustomer implements Serializable {

	private static final long serialVersionUID = -2885575288172098114L;
	private List<Customer> collectCustomer;

	public int size() {
		return collectCustomer.size();
	}

	public List<Customer> getCollectCustomer() {
		return collectCustomer;
	}

	public void addCustomer(Customer cst) {
		collectCustomer.add(cst);
	}

	public void remove(int index) {
		collectCustomer.remove(index);
	}

	public CollectCustomer(List<Customer> collectCustomer) {
		super();
		this.collectCustomer = collectCustomer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collectCustomer == null) ? 0 : collectCustomer.hashCode());
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
		CollectCustomer other = (CollectCustomer) obj;
		if (collectCustomer == null) {
			if (other.collectCustomer != null)
				return false;
		} else if (!collectCustomer.equals(other.collectCustomer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CollectCustomer [collectCustomer=" + collectCustomer + "]";
	}

}
