package net.ukr.p454.task3alter;

public class Main {

	public static void main(String[] args) {
		DataBuilder builder = new DataBuilder();
		Human curator = new Human("Иванова Светлана Борисовна", 55, "Украинка", builder.getDate(1, 10, 1986), "Киев",
				Sex.FEMALE);

		Student studentPAI = new Student("Петров Александр Иванович", 20, "украинец", builder.getDate(5, 2, 1996),
				"Ковель", Sex.MALE, "ФЕЛ", 1000001, 1);

		Student studentIAI = new Student("Иванов Александр Иванович", 20, "украинец", builder.getDate(5, 1, 1996),
				"Винница", Sex.MALE, "ФЕЛ", 1000002, 1);
		Student studentBAI = new Student("Буйнов Александр Иванович", 20, "украинец", builder.getDate(5, 3, 1996),
				"Житомир", Sex.MALE, "ФЕЛ", 1000003, 1);
		Student studentCAI = new Student("Смирнов Александр Иванович", 20, "украинец", builder.getDate(5, 4, 1996),
				"Запорожье", Sex.MALE, "ФЕЛ", 1000004, 1);
		Student studentDAI = new Student("Димитров Александр Иванович", 20, "украинец", builder.getDate(5, 5, 1996),
				"Днепр", Sex.MALE, "ФЕЛ", 1000005, 1);
		Student studentGAI = new Student("Грабовский Александр Иванович", 20, "украинец", builder.getDate(5, 6, 1996),
				"Гаспра", Sex.MALE, "ФЕЛ", 1000006, 1);
		Student studentMAI = new Student("Манилов Александр Иванович", 20, "украинец", builder.getDate(5, 7, 1996),
				"Черкассы", Sex.MALE, "ФЕЛ", 1000007, 1);
		Student studentNAI = new Student("Николаев Александр Иванович", 20, "украинец", builder.getDate(5, 8, 1996),
				"Чернигов", Sex.MALE, "ФЕЛ", 1000008, 1);
		Student studentIPI = new Student("Иванов Петр Иванович", 19, "украинец", builder.getDate(5, 9, 1996), "Гаспра",
				Sex.MALE, "ФЕЛ", 1000009, 1);
		Student studentKAI = new Student("Краевой Александр Иванович", 19, "украинец", builder.getDate(5, 10, 1996),
				"Львов", Sex.MALE, "ФЕЛ", 1000010, 1);
		Student studentLAI = new Student("Лунков Александр Иванович", 19, "украинец", builder.getDate(5, 11, 1996),
				"Харьков", Sex.MALE, "ФЕЛ", 1000011, 1);

		Group group = new Group("ДЗ-33", curator);

		group.addStudent(studentIAI);
		// try the same student
		group.addStudent(studentIAI);

		group.addStudent(studentPAI);
		group.addStudent(studentBAI);
		group.addStudent(studentCAI);
		group.addStudent(studentDAI);
		group.addStudent(studentGAI);
		group.addStudent(studentMAI);
		group.addStudent(studentNAI);
		group.addStudent(studentIPI);
		group.addStudent(studentKAI);

		// Group is full
		group.addStudent(studentLAI);

		// Ivanov shirked all pairs
		group.exludStudent("иванов петр сергеевич");
		group.exludStudent("иванов петр иванович");
		group.exludStudent("Манилов Александр Иванович");

		// Add new students
		// group.addStudent(studentLAI);

		// search
		group.searchStudent("Краевой Александр Иванович");

		// try to recover
		// group.addStudent(studentIPI);

		System.out.println(group.toString());

	}

}
