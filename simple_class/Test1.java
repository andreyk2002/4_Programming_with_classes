package by.epam_tc.class_programming.simple_class;

public class Test1 {

	private int a = 3;
	private int b = 5;

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

	public int sumAB() {
		return this.a + this.b;
	}

	public int getMax() {
		return this.a > this.b ? a : b;
	}

	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "a = " + this.a + ";b = " + this.b;
	}

	public static void main(String[] argc) {
		Test1 t1 = new Test1();
		t1.print();
		System.out.println("a = " + t1.getA());
		System.out.println("max(a,b) = " + t1.getMax());
		System.out.println("a + b = " + t1.sumAB());
	}
}
