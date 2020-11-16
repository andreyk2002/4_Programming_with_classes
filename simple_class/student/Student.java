package by.epam_tc.class_programming.simple_class.student;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Student {

	private String name;
	private String initials;
	private int groupNumb;
	private int[] score;

	{
		score = new int[5];
	}

	Student(String name, String initials, int groupNumb) {
		setName(name);
		setInitials(initials);
		setGroup(groupNumb);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public void setGroup(int group) {
		this.groupNumb = group;
	}

	public void setScore(int... marks) throws InputMismatchException {
		if (marks.length > 5) {
			throw new InputMismatchException("Wrong input format");
		} else {
			for (int i = 0; i < marks.length; i++) {
				if (marks[i] < 1 || marks[i] > 10) {
					throw new InputMismatchException("marks can't be bigger than 10 or smaller then 1");
				}
				score[i] = marks[i];
			}
		}
	}

    public String getName() {
		return name;
	}

	public String getInitials() {
		return initials;
	}

	public int getGroup() {
		return groupNumb;
	}

	public int[] getScore() {
		return score;
	}

	@Override
	public String toString() {
		StringBuffer answer = new StringBuffer();
		answer.append("FIO" + name + " " + initials + "\n");
		answer.append("Group" + name + " " + initials + "\n" + "Marks:");
		for (int i = 0; i < score.length; i++) {
			answer.append(score[i] + " ");
		}
		return answer.toString();
	}

	public boolean onlyTenOrNine() {

		for (int i = 0; i < score.length; i++) {
			if (score[i] < 9) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumb;
		result = prime * result + ((initials == null) ? 0 : initials.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(score);
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
		Student other = (Student) obj;
		if (groupNumb != other.groupNumb)
			return false;
		if (initials == null) {
			if (other.initials != null)
				return false;
		} else if (!initials.equals(other.initials))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(score, other.score))
			return false;
		return true;
	}
	
	

}
