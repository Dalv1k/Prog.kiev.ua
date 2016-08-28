package net.ukr.p454.task3alter;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{
	@Override
	public int compare(Student studentOne, Student studentTwo) {
		if (studentOne == null && studentTwo == null) {
			return 0;
		} else if (studentOne == null) {
			return 1;
		} else if (studentTwo == null) {
			return -1;
		}
		String studentNameOne = studentOne.getFullName().toUpperCase();
		String studentNameTwo = studentTwo.getFullName().toUpperCase();
		return studentNameOne.compareTo(studentNameTwo);
	}
}
