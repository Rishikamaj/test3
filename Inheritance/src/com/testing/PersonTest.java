package com.testing;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sef.module6.activity.a1.test.Administrator;
import sef.module6.activity.a1.test.Person;
import sef.module6.activity.a1.test.Student;
import sef.module6.activity.a1.test.Teacher;

public class PersonTest {
	Person p;
	Student s;
	Teacher t;
	Administrator admin;

	@BeforeEach
	public void initEnv() {
		System.out.println("Executing init");
		p = new Person();
		s = new Student();
		t = new Teacher();
		// admin = new Administrator();

		Student[] studentsList = new Student[5];

		studentsList[0] = new Student(1, 56, 23, "mahi", 'M');
		studentsList[1] = new Student(2, 90, 24, "rohit", 'M');
		studentsList[2] = new Student(3, 78, 24, "madhu", 'F');
		studentsList[3] = new Student(4, 80, 25, "rishi", 'M');
		studentsList[4] = new Student(5, 89, 25, "rohan", 'M');

		Teacher[] teacherList = new Teacher[6];

		teacherList[0] = new Teacher("madhu", 23, 'F', "English", 24000, 2000, 400);
		teacherList[1] = new Teacher("rita", 23, 'F', "geo", 26000, 7000, 4000);
		teacherList[2] = new Teacher("rinku", 23, 'F', "maths", 28000, 8000, 6000);
		teacherList[3] = new Teacher("simran", 23, 'F', "English", 29000, 10000, 9400);
		teacherList[4] = new Teacher("Sweety", 23, 'F', "history", 30000, 9000, 5000);
		teacherList[5] = new Teacher("raj", 23, 'F', "Science", 34000, 7000, 8400);
		System.out.println("initialized");
		admin = new Administrator(studentsList, teacherList);

	}

	@Test
	public void UTC_120() {
		Student expected = new Student(1, 56, 23, "mahi", 'M');
		Student actual = admin.calculateStudentTopper();
		
		
		assertTrue(expected.equals(actual));
		
	}

	@AfterEach
	public void cleanEvn() {
		System.gc();
	}

}
