package com.training.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputTest {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = null;
		System.out.println("Enter name");
		String name = s.nextLine();
		try {
			fos = new FileOutputStream("d:/Test1.txt",true);
			byte buffer[] = new byte[name.length()];
			buffer = name.getBytes();
			//fos.write(name);
			fos.write(buffer);
			System.out.println("data stored successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (fos!=null)
			fos.close();
			}
			catch(IOException e)
			{
				
			}
		}

	}

}
