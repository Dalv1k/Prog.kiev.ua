package net.ukr.p454.task3alter;

import java.util.Comparator;

public class SortByDateOfBirthday implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		return one.getDateOfBirthday().isBefore(two.getDateOfBirthday())? 1:0; 
	}

}
