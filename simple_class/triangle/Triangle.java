package by.epam_tc.class_programming.simple_class.triangle;

import by.epam_tc.class_programming.simple_class.Point;

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	

	public Triangle(Point a, Point b, Point c) {
		if (!TriangleLogic.canCreate(a, b, c)) {
			throw new IllegalArgumentException("Can't create triangle with entered sides");
		}

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		if (TriangleLogic.canCreate(a, b, c)) {
			this.a = a;
		}
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		if (TriangleLogic.canCreate(a, b, c)) {
			this.b = b;
		}
	}

	public Point getC() {

		return c;
	}

	public void setC(Point c) {
		if (TriangleLogic.canCreate(a, b, c)) {
			this.c = c;
		}
	}

	public double getAb() {
		return TriangleLogic.countLen(a, b);
	}

	public double getBc() {
		
		return TriangleLogic.countLen(b, c);
	}

	public double getAc() {
		 
		return TriangleLogic.countLen(a, c);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
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
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	
}
