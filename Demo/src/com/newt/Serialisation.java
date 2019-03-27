package com.newt;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialisation {

	public static void main(String[] args) {
		try(FileOutputStream fos=new FileOutputStream("Templerun.srf");){
			ObjectOutputStream oos =new ObjectOutputStream(fos)	;
			//Games mygame=new Games();
			Game mygame=new Game();
			mygame.level=5;
			mygame.internetConnection=10;
			oos.writeObject(mygame);
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
}
class Game implements Serializable{
	public int level=0;
	transient public int internetConnection=10;
}

