package net.ukr.p454.task3;

public class Main {

	public static void main(String[] args) {

		Human curator = new Human("������� �������� ���������", 55, "��������", "01.04.1961", "����");

		Student studentIAI = new Student("������ ��������� ��������", 20, "��������", "05.01.1996", "�������", "���",
				1000001, 1);
		Student studentPAI = new Student("������ ��������� ��������", 20, "��������", "05.02.1996", "������", "���",
				1000002, 1);
		Student studentBAI = new Student("������ ��������� ��������", 20, "��������", "05.03.1996", "�������", "���",
				1000003, 1);
		Student studentCAI = new Student("������� ��������� ��������", 20, "��������", "05.04.1996", "���������", "���",
				1000004, 1);
		Student studentDAI = new Student("�������� ��������� ��������", 20, "��������", "05.05.1996", "�����", "���",
				1000005, 1);
		Student studentGAI = new Student("���������� ��������� ��������", 20, "��������", "05.06.1996", "������", "���",
				1000006, 1);
		Student studentMAI = new Student("������� ��������� ��������", 20, "��������", "05.07.1996", "��������", "���",
				1000007, 1);
		Student studentNAI = new Student("�������� ��������� ��������", 20, "��������", "05.08.1996", "��������", "���",
				1000008, 1);
		Student studentIPI = new Student("������ ���� ��������", 19, "��������", "05.09.1996", "������", "��������",
				1000009, 1);
		Student studentKAI = new Student("������� ��������� ��������", 19, "��������", "05.10.1996", "�����", "���",
				1000010, 1);
		Student studentLAI = new Student("������ ��������� ��������", 19, "��������", "05.11.1996", "�������", "���",
				1000011, 1);

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
