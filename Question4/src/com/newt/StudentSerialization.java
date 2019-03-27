package com.newt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerialization {
	public boolean addRecord(Student st) {
		boolean result = false;
		if (st.marks > 0 && st.marks < 100) {
			if (st.courseName == "CSE" | st.courseName == "ISE" | st.courseName == "ECE" | st.courseName == "MCH"
					| st.courseName == "EEE") {
				if (st.id.charAt(0) == 'S') {
					try (FileOutputStream fos = new FileOutputStream("Student.txt");
							ObjectOutputStream oos = new ObjectOutputStream(fos);) {
						Student sim = new Student();
						sim.id = st.id;
						sim.marks = st.marks;
						sim.name = st.name;
						oos.writeObject(sim);
						
						result = true;
						return result;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					} 

				} 
			}

		}

		return result;

	}

	public Student retrieveRecord(String sId) {
		try (FileInputStream fis = new FileInputStream("Student.txt");
				ObjectInputStream oos = new ObjectInputStream(fis);) {
			Student m = (Student) oos.readObject();

			if (m.id.equalsIgnoreCase(sId)) {

				return m;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}
}
