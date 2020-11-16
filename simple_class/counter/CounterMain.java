package by.epam_tc.class_programming.simple_class.counter;

public class CounterMain {
	public static void main(String[] argc) {
		try {
		Counter ct = new Counter();
		Counter ct1 = new Counter(2, 14, 33);
		Counter ct2 = new Counter(56);

		for (; ct.getCurrent() < 30; ct.next()) {
			ct1.next();
			ct2.previous();

			System.out.println("First counter: " + ct.getCurrent());
			System.out.println("Second counter: " + ct1.getCurrent());
			System.out.println("Third counter: " + ct2.getCurrent());
			System.out.println("====================================");
		}
		}
		catch(ArithmeticException aE) {
			System.out.println(aE.getMessage());
		}
	}
}
