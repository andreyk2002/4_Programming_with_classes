package by.epam_tc.class_programming.simple_class;

public class Test2 {
	private int a;
	private int b;

	public Test2(int a, int b) {
		setA(a);
		setB(b);

	}

	public Test2() {
		setA(0);
		setB(0);

	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

	@Override
	public String toString() {
		return "a = " + this.a + ";b = " + this.b;
	}

	public static void main(String[] argc) {
		Test2 t1 = new Test2(3, 5);
		System.out.print(t1.toString());
	}
}
