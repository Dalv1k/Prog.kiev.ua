package net.ukr.p454.task3;

public class Main {

	public static void main(String[] args) {

		Human curator = new Human("Иванова Светлана Борисовна", 55, "Украинка", "01.04.1961", "Киев");

		Student studentIAI = new Student("Иванов Александр Иванович", 20, "украинец", "05.01.1996", "Винница", "ФЕЛ",
				1000001, 1);
		Student studentPAI = new Student("Петров Александр Иванович", 20, "украинец", "05.02.1996", "Ковель", "ФЕЛ",
				1000002, 1);
		Student studentBAI = new Student("Буйнов Александр Иванович", 20, "украинец", "05.03.1996", "Житомир", "ФЕЛ",
				1000003, 1);
		Student studentCAI = new Student("Смирнов Александр Иванович", 20, "украинец", "05.04.1996", "Запорожье", "ФЕЛ",
				1000004, 1);
		Student studentDAI = new Student("Димитров Александр Иванович", 20, "украинец", "05.05.1996", "Днепр", "ФЕЛ",
				1000005, 1);
		Student studentGAI = new Student("Грабовский Александр Иванович", 20, "украинец", "05.06.1996", "Гаспра", "ФЕЛ",
				1000006, 1);
		Student studentMAI = new Student("Манилов Александр Иванович", 20, "украинец", "05.07.1996", "Черкассы", "ФЕЛ",
				1000007, 1);
		Student studentNAI = new Student("Николаев Александр Иванович", 20, "украинец", "05.08.1996", "Чернигов", "ФЕЛ",
				1000008, 1);
		Student studentIPI = new Student("Иванов Петр Иванович", 19, "украинец", "05.09.1996", "Гаспра", "Черновцы",
				1000009, 1);
		Student studentKAI = new Student("Краевой Александр Иванович", 19, "украинец", "05.10.1996", "Львов", "ФЕЛ",
				1000010, 1);
		Student studentLAI = new Student("Лунков Александр Иванович", 19, "украинец", "05.11.1996", "Харьков", "ФЕЛ",
				1000011, 1);

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
