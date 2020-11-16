package by.epam_tc.class_programming.simple_class.train.view;

import java.util.Scanner;

import by.epam_tc.class_programming.simple_class.train.Train;

public class TrainUser {

	public int getInt(String prompt) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(prompt + " >> ");
		
		while(!sc.hasNextInt()) {
			System.out.print(prompt + " >> ");
			sc.next();
		}
		int result = sc.nextInt();
		sc.close();
		
		return result;
	}

	public Train findTrainByNumber(int number,Train[] trains) {
		for(int i = 0; i < trains.length; i++) {
			if(trains[i].getNumber() == number) {
				return trains[i];
			}
		}
		
		return null;
	}

}
