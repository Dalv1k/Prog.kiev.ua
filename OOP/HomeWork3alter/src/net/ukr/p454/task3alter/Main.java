package net.ukr.p454.task3alter;

import java.time.LocalDate;
import java.time.Month;

public class Main {

	public static void main(String[] args) {

		Human curator = new Human("Ivanova Inna Vladimirovna", 55, "ukrainian", LocalDate.of(1961, Month.JANUARY, 10),
				"Kyiv", Sex.FEMALE);

		System.out.println(curator.toString());

		Student studentPAI = new Student("Petrov Alexandr Ivanovich", 20, "ukrainian",
				LocalDate.of(1996, Month.FEBRUARY, 5), "Vinnitsa", Sex.MALE, "FEL", 1);
		
		Student studentIAI = new Student("Ivanov Alexandr Ivanovich", 20, "ukrainian",
				LocalDate.of(1996, Month.MARCH, 5), "Lviv", Sex.MALE, "FEL", 1);
		
		Group group = new Group("DZ-33", curator);
		
		
		group.addStudent(studentIAI);
		group.addStudent(studentPAI);
		
		System.out.println(group.toString());
		
		
		/*
		 * 
		 * 
		 * group.addStudent(studentIAI); // try the same student
		 * 
		 * 
		 * group.addStudent(studentPAI); group.addStudent(studentBAI);
		 * group.addStudent(studentCAI); group.addStudent(studentDAI);
		 * group.addStudent(studentGAI); group.addStudent(studentMAI);
		 * group.addStudent(studentNAI); group.addStudent(studentIPI);
		 * group.addStudent(studentKAI);
		 * 
		 * // Group is full group.addStudent(studentLAI);
		 * 
		 * // Ivanov shirked all pairs
		 * group.exludStudent("������ ���� ���������");
		 * group.exludStudent("������ ���� ��������");
		 * group.exludStudent("������� ��������� ��������");
		 * 
		 * // Add new students // group.addStudent(studentLAI);
		 * 
		 * // search group.searchStudent("������� ��������� ��������");
		 * 
		 * // try to recover // group.addStudent(studentIPI);
		 * 
		 * System.out.println(group.toString());
		 * System.out.println(studentLAI.toString());
		 */
	}

}
