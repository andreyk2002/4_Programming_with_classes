package by.epam_tc.class_programming.simple_class.train;

import java.util.Date;
import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Train implements Serializable{

	private static final long serialVersionUID = -117395352866194564L;
	private String placeName;
	private int number;
	private Date arrivalTime;
	public final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm");

	public Train(String place, int trainNumb, Date arrTime) {
		this.placeName = place;
		setNumber(trainNumb);
		this.arrivalTime = arrTime;
	}

	public Train() {
		this("", 0, new Date());
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number < 0) {
			number = 0;
		}
		this.number = number;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[placeName=" + placeName + ", number=" + number + ", arrivalTime="
				+ arrivalTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalTime == null) ? 0 : arrivalTime.hashCode());
		result = prime * result + number;
		result = prime * result + ((placeName == null) ? 0 : placeName.hashCode());
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
		Train other = (Train) obj;
		if (arrivalTime == null) {
			if (other.arrivalTime != null)
				return false;
		} else if (!arrivalTime.equals(other.arrivalTime))
			return false;
		if (number != other.number)
			return false;
		if (placeName == null) {
			if (other.placeName != null)
				return false;
		} else if (!placeName.equals(other.placeName))
			return false;
		return true;
	}

}