package by.epam_tc.class_programming.simple_class.time;

public class TimeLogic {

	public void add(Time t, int hours, int minutes, int seconds) {
		int allSeconds;
		allSeconds = toSeconds(t.getHours(), t.getMinutes(), t.getSeconds());
		allSeconds += toSeconds(hours, minutes, seconds);

		this.timeFromSeconds(allSeconds, t);

	}

	public void subtract(Time t, int hours, int minutes, int seconds) {
		int allSeconds;
		allSeconds = toSeconds(t.getHours(), t.getMinutes(), t.getSeconds());
		allSeconds -= toSeconds(hours, minutes, seconds);

		this.timeFromSeconds(allSeconds, t);
	}

	public static int toSeconds(int hours, int minutes, int seconds) {
		int secondsRes;
		secondsRes = 3600 * hours;
		secondsRes += 60 * minutes;
		secondsRes += seconds;

		return secondsRes;
	}

	public void timeFromSeconds(int totalSeconds, Time t) {
		int newHours = 0;
		int newMinutes = 0;
		int newSeconds = 0;
		
		while (totalSeconds >= 3600) {
			newHours++;
			totalSeconds -= 3600;
		}
		while (totalSeconds >= 60) {
			newMinutes++;
			totalSeconds -= 60;
		}
		newSeconds += totalSeconds;

		t.setHours(newHours);
		t.setMinutes(newMinutes);
		t.setSeconds(newSeconds);

	}
}
