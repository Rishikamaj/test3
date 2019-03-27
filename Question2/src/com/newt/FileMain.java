package com.newt;

import java.io.IOException;

public class FileMain {
	public static void main(String[] args) throws IOException {
		FileHandling fh = new FileHandling();
		Employee emp = new Employee();

		fh.addRecord("M1022359", "Shruthi S", "22345", "AB+ve", "Ph1004.jpg");
		fh.changePhotoName("M1022359");
		// File f=new File("Hello.txt");

	}
}

