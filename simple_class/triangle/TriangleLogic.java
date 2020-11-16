package by.epam_tc.class_programming.simple_class.triangle;

import by.epam_tc.class_programming.simple_class.Point;

public class TriangleLogic {

	public double calculateArea(Triangle tr) {
		double p = this.calculatePerimeter(tr) / 2;

		double res = Math.sqrt(p * (p - tr.getAb()) * (p - tr.getBc()) * (p - tr.getAc()));
		return res;
	}

	public double calculatePerimeter(Triangle tr) {
		return tr.getAb() + tr.getBc() + tr.getAc();
	}

	public Point findIntersectionOfMedians(Triangle tr) {
		double x = (tr.getA().getX() + tr.getB().getX() + tr.getC().getX()) / 3;
		double y = (tr.getA().getY() + tr.getB().getY() + tr.getC().getY()) / 3;
		return new Point(x, y);
	}

	public static boolean canCreate(Point A, Point B, Point C) {
		double ab, bc, ac;

		ab = countLen(A, B);
		bc = countLen(C, B);
		ac = countLen(A, C);
		if (ab + bc <= ac || ab + ac <= bc || bc + ac <= ab) {
			return false;
		}
		return true;
	}

	public static double countLen(Point A, Point B) {
		double ab;
		ab = Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
		return ab;
	}
}
