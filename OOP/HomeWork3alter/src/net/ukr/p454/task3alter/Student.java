package net.ukr.p454.task3alter;

import java.util.Comparator;
import java.util.Date;
import java.util.Formatter;

public class Student extends Human  {

	private String faculty;
	private String group;
	private int studentID;
	private int course;

	public Student(String fullName, int age, String nationality, Date dateOfBirthday, String placeOfBirthday, Sex sex,
			String faculty, int studentID, int course) {
		super(fullName, age, nationality, dateOfBirthday, placeOfBirthday, sex);
		this.faculty = faculty;
		this.studentID = studentID;
		this.course = course;
	}

	public Student(Human human) {
		super(human.getFullName(), human.getAge(), human.getNationality(), human.getDateOfBirthday(),
				human.getPlaceOfBirthday(), human.getSex());
	}

	public Student(Human human, String faculty, int studentID, int course) {
		super(human.getFullName(), human.getAge(), human.getNationality(), human.getDateOfBirthday(),
				human.getPlaceOfBirthday(), human.getSex());
		this.faculty = faculty;
		this.studentID = studentID;
		this.course = course;
	}

	@Override
	public String toString() {
		String str;
		Formatter formatter = new Formatter();
		formatter.format(super.toString());
		formatter.format("%-18s %s", "Faculty:", faculty);
		formatter.format(System.lineSeparator());
		formatter.format("%-18s %s", "Group:", group);
		formatter.format(System.lineSeparator());
		formatter.format("%-18s %d", "StudentID:", studentID);
		formatter.format(System.lineSeparator());
		formatter.format("%-18s %d", "Course:", course);
		formatter.format(System.lineSeparator());
		str = formatter.toString();
		formatter.close();
		return str;
	}

	public Student() {
		super();
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}
