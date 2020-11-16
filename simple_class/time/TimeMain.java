package by.epam_tc.class_programming.simple_class.time;

public class TimeMain {
	public static void main(String[] argc) {
		Time t = new Time(22, 49, 67);
		TimeLogic logic = new TimeLogic();

		System.out.println(t.toString());
		t.setMinutes(74);
		System.out.println(t.toString());
		logic.add(t, 0, 43, 4);
		System.out.println(t.toString());
		logic.subtract(t, 0, 54, 30);
		System.out.println(t.toString());
	}
}
