package by.epam_tc.class_programming.simple_class.triangle;

import by.epam_tc.class_programming.simple_class.Point;

public class TriangleMain {

	public static void main(String[] argc) {
		TriangleLogic tLogic = new TriangleLogic();

		try {

			Point a = new Point(0, 0);
			Point b = new Point(0, 4);
			Point c = new Point(3, 0);
			//в качестве примера - "Пифагоров" прямоугольный треугольник со сторонами 3, 4, 5

			Triangle tr = new Triangle(a, b, c);
			System.out.println("Perimeter: " + tLogic.calculatePerimeter(tr));
			System.out.println("Area: " + tLogic.calculateArea(tr));
			System.out.println("Intersection of medians: x = " + tLogic.findIntersectionOfMedians(tr).getX() + "; y = "
					+ tLogic.findIntersectionOfMedians(tr).getY());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
