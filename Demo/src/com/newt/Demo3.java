package com.newt;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo3 {
	public static void main(String[]args) {
		String Filename="source.txt";
		String FileCopy="Copy.txt";
		try(FileReader freader= new FileReader(Filename);
				FileWriter fwriter= new FileWriter(FileCopy))
			{
				BufferedReader breader=new BufferedReader(freader);
				BufferedWriter bwriter=new BufferedWriter(fwriter);
			    String line;
				
			while( (line=breader.readLine())!=null){
				
		
					System.out.println("read the line:"+ line+"write it to new file");
					bwriter.write(line +"\n");
					bwriter.flush();
				
			}}catch(Exception e ) {
			System.out.println(e.getMessage());
					
				
	
}
	}
}
