package by.epam_tc.class_programming.simple_class.student;

import java.util.InputMismatchException;

public class StudentMain {

	public static void main(String[] argc) {
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student("St" + i, "A.I", i);
		}
		try {
			students[0].setScore(10, 9, 10, 9, 10);
		} catch (InputMismatchException e) {
			
			System.out.println(e.getMessage());
		}

		try {
			students[1].setScore(5, 7, 8, 9, 4);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[2].setScore(10, 10, 10, 9, 8);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[3].setScore(8, 9, 8, 9, 8);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[4].setScore(10, 7, 10, 10, 10);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[5].setScore(8, 8, 7, 7, 8);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[6].setScore(10, 9, 10, 9, 10);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[7].setScore(4, 4, 4, 4, 4);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[8].setScore(9, 4, 5, 5, 4);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}
		try {
			students[9].setScore(8, 8, 10, 9, 8);
		} catch (InputMismatchException e) {

			System.out.println(e.getMessage());
		}

		for (int i = 0; i < students.length; i++) {
			if (students[i].onlyTenOrNine()) {
				System.out.println(students[i].getName() + " " + students[i].getInitials());
				System.out.println();
			}
		}
	}
}
