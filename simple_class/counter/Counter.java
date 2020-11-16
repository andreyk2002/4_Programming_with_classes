package by.epam_tc.class_programming.simple_class.counter;

import java.io.*;
public class Counter implements Serializable{

	
	private static final long serialVersionUID = -8370503881141806640L;
	private int current;
	private int min;
	private int max;

	public Counter() {
		this.min = 0;
		this.max = Integer.MAX_VALUE;
		setCurrent(current);
	}

	public Counter(int current) {
		this.min = 0;
		this.max = Integer.MAX_VALUE;
		setCurrent(current);
	}

	public Counter(int current, int min, int max) {
		if (min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		this.max = max;
		this.min = min;
		setCurrent(current);
	}

	public void setCurrent(int current) {
		if (current > min && current < max) {
			this.current = current;
		} else {
			this.current = min;
		}
	}

	public void next() throws ArithmeticException {
		if (current == max) {
			throw new ArithmeticException("Current bigger than max!");
		} else {
			current++;
		}
	}

	public void previous() throws ArithmeticException {
		if (current == min) {
			throw new ArithmeticException("Current smaller than max!");
		} else {
			current--;
		}
	}

	public int getCurrent() {
		return current;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + current;
		result = prime * result + max;
		result = prime * result + min;
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
		Counter other = (Counter) obj;
		if (current != other.current)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [current=" + current + ", min=" + min + ", max=" + max + "]";
	}

	
}
