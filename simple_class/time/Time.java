package by.epam_tc.class_programming.simple_class.time;

import java.io.Serializable;

public class Time implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int seconds;
	private int minutes;
	private int hours;

	public Time(int hours, int minutes, int seconds) {
		super();
		setSeconds(seconds);
		setMinutes(minutes);
		setHours(hours);
	}
	
	public Time() {
		this(0, 0, 0);
	}
	
	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;

		if (seconds > 59 || seconds < 0) {
			this.seconds = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
		if (minutes > 59 || minutes < 0) {
			this.minutes = 0;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
		if (hours > 23 || hours < 0) {
			this.hours = 0;
		}
	}

	@Override
	public String toString() {
		return "Time: " + hours + "H. " + minutes + "m. " + seconds + "s.";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

}
