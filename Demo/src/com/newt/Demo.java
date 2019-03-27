package com.newt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		String filename = "MyFile.text";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filename);

			fos.write(98);
			fos.flush();
			System.out.println("file created");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
