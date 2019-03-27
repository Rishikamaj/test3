package com.newt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		String Filename="image.png";
		String outputFilename="Copy Of"+Filename;
		try {
			FileInputStream fis= new FileInputStream(Filename);
			FileOutputStream fos= new FileOutputStream(Filename);{
				int data;
				while((data=fis.read())!=-1);{
					fos.write(data);
				}

				fos.flush();
				System.out.println("File copied successfully");
			}}catch(FileNotFoundException e) {
				System.out.println(e.getMessage());

			}catch(IOException e) {

			}


		}}
	
