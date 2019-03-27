package sef.module6.activity.a1.test;

import java.util.Arrays;

public class Administrator {

	private Student[] studentsList;
	private Teacher[] teacherList;
	int temp = 0;
	int team = 0;

	public Administrator(Student[] studentsList, Teacher[] teacherList) {
		super();
		this.studentsList = studentsList;
		this.teacherList = teacherList;
	}

	public Administrator() {
		studentsList = new Student[5];
		int i;
		for (i = 0; i < studentsList.length; i++) {
			studentsList[i] = new Student();
		}
		teacherList = new Teacher[6];
		for (i = 0; i < teacherList.length; i++) {
			teacherList[i] = new Teacher();
		}

	}

	boolean enrollStudent(Student student) {
		if (team < studentsList.length)
			studentsList[team++] = student;
		return true;
	}

	public boolean addTeacher(Teacher teacher) {
		if (temp < teacherList.length)
			teacherList[temp++] = teacher;
		return true;

	}

	public double calculatePay(Teacher teacher) {
		double salary = teacher.getBasic() + teacher.getHra() - teacher.getDeductions();
		return salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(studentsList);
		result = prime * result + Arrays.hashCode(teacherList);
		result = prime * result + team;
		result = prime * result + temp;
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
		Administrator other = (Administrator) obj;
		if (!Arrays.equals(studentsList, other.studentsList))
			return false;
		if (!Arrays.equals(teacherList, other.teacherList))
			return false;
		if (team != other.team)
			return false;
		if (temp != other.temp)
			return false;
		return true;
	}

	public Student calculateStudentTopper() {
		double max = 0;
		int index = 0;

		for (int i = 0; i < studentsList.length; i++) {

			if (studentsList[i].getScore() > max) {

				max = studentsList[i].getScore();
				index = i;
				return studentsList[index];
			}
		}
		return null;

	}
	

			
		// TODO Auto-generated method stub

	}
