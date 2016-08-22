package net.ukr.p454.task3alter;

public class Main {

	public static void main(String[] args) {
		DataBuilder builder = new DataBuilder();
		Human curator = new Human("������� �������� ���������", 55, "��������", builder.getDate(1, 10, 1986), "����",
				Sex.FEMALE);

		Student studentPAI = new Student("������ ��������� ��������", 20, "��������", builder.getDate(5, 2, 1996),
				"������", Sex.MALE, "���", 1000001, 1);

		Student studentIAI = new Student("������ ��������� ��������", 20, "��������", builder.getDate(5, 1, 1996),
				"�������", Sex.MALE, "���", 1000002, 1);
		Student studentBAI = new Student("������ ��������� ��������", 20, "��������", builder.getDate(5, 3, 1996),
				"�������", Sex.MALE, "���", 1000003, 1);
		Student studentCAI = new Student("������� ��������� ��������", 20, "��������", builder.getDate(5, 4, 1996),
				"���������", Sex.MALE, "���", 1000004, 1);
		Student studentDAI = new Student("�������� ��������� ��������", 20, "��������", builder.getDate(5, 5, 1996),
				"�����", Sex.MALE, "���", 1000005, 1);
		Student studentGAI = new Student("���������� ��������� ��������", 20, "��������", builder.getDate(5, 6, 1996),
				"������", Sex.MALE, "���", 1000006, 1);
		Student studentMAI = new Student("������� ��������� ��������", 20, "��������", builder.getDate(5, 7, 1996),
				"��������", Sex.MALE, "���", 1000007, 1);
		Student studentNAI = new Student("�������� ��������� ��������", 20, "��������", builder.getDate(5, 8, 1996),
				"��������", Sex.MALE, "���", 1000008, 1);
		Student studentIPI = new Student("������ ���� ��������", 19, "��������", builder.getDate(5, 9, 1996), "������",
				Sex.MALE, "���", 1000009, 1);
		Student studentKAI = new Student("������� ��������� ��������", 19, "��������", builder.getDate(5, 10, 1996),
				"�����", Sex.MALE, "���", 1000010, 1);
		Student studentLAI = new Student("������ ��������� ��������", 19, "��������", builder.getDate(5, 11, 1996),
				"�������", Sex.MALE, "���", 1000011, 1);

		Group group = new Group("��-33", curator);

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
		group.exludStudent("������ ���� ���������");
		group.exludStudent("������ ���� ��������");
		group.exludStudent("������� ��������� ��������");

		// Add new students
		// group.addStudent(studentLAI);

		// search
		group.searchStudent("������� ��������� ��������");

		// try to recover
		// group.addStudent(studentIPI);

		System.out.println(group.toString());

	}

}
