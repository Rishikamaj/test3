package com.newt;

//package com.file.project.Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHandling {
	public int addRecord(String id, String name, String cardNo, String bloodGroup, String photoName)
			throws IOException {
		String concate = id + ":" + name + ":" + cardNo + ":" + bloodGroup + ":" + photoName;
		String file = "rishu.txt";
		FileWriter fw = new FileWriter(file);
		// FileOutputStream fos=null;
		try (BufferedWriter fos = new BufferedWriter(fw);) {
			// fos=new FileOutputStream(f);
			fos.write(concate);

		}
		FileReader fr = new FileReader(file);
		if (fr.read() != -1)
			return 1;
		else
			return 0;

	}

	public boolean changePhotoName(String id) throws IOException {
		try {
			String picName = null;
			FileReader fr = new FileReader("rishu.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("read the line " + line);

				String str = line;
				String[] str1 = str.split(":");

				if (str1[0].equals(id)) {
					picName = str1[0] + str1[1] + str1[3];
					String photoName = picName;
					System.out.println("photoName:" + photoName);
				}
				return true;
			}
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("no match");
		return false;
	}
}
