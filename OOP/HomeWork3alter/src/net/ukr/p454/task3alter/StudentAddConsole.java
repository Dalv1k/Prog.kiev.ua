package net.ukr.p454.task3alter;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class StudentAddConsole implements IStudentAdd {

	@Override
	public Student addStudent() {
		try (Scanner scanner = new Scanner(System.in)) {

			Student student = new Student();
			System.out.print("Input fullname:");
			student.setFullName(inputString(scanner));

			System.out.print("Input faculty:");
			student.setFaculty(inputString(scanner));

			System.out.print("Input placeOfBirthday:");
			student.setPlaceOfBirthday(inputString(scanner));

			System.out.print("Input dateOfBirthday(format:dd.MM.yyyy):");
			student.setDateOfBirthday(LocalDate.parse(inputString(scanner), DateTimeFormatter.ofPattern("dd.MM.yyyy")));

			System.out.print("Input nationality:");
			student.setNationality(inputString(scanner));

			System.out.print("Input age:");
			student.setAge(inputInt(scanner));

			System.out.print("Input sex (1-M; 2-F):");
			student.setSex(inputInt(scanner) == 2 ? Sex.FEMALE : Sex.MALE);

			System.out.print("Input course:");
			student.setCourse(inputInt(scanner));

			student.setStudentID();

			return student;
		} catch (Exception e) {
			System.err.println("You make a mistake. Try again");
			return null;
		}

	}

	private String inputString(Scanner scanner) {
		boolean correct = false;
		String text = "";
		while (!correct) {
			try {
				text = scanner.nextLine();
				if (text.length() > 0) {
					correct = true;
				} else {
					System.out.println("Try Again. Empty field not permit");
				}
			} catch (Exception e) {
				System.out.println("Wrong input. Try again");
			}
		}
		return text;
	}
	private int inputInt(Scanner scanner) {
		boolean correct = false;
		int text = 0;
		while (!correct) {
			try {
				text = scanner.nextInt();
				if (text > 0) {
					correct = true;
				} else {
					System.out.println("Try Again. Empty field not permit");
				}
			} catch (Exception e) {
				System.out.println("Wrong input. Try again");
			}
		}
		return text;
	}
}
