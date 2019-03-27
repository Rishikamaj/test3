package com.newt;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
public static void main(String[]args) {
	try(FileInputStream fos=new FileInputStream("Templerun.srf");){
		ObjectInputStream oos =new ObjectInputStream(fos)	;
		{
			Game g=(Game)oos.readObject();
		System.out.println(g.level+" "+ g.internetConnection);	
		}}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
}
}
