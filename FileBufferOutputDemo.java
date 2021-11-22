package com.training.io;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class FileBufferOutputDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter id");
		int empid=s.nextInt();
		String contents="Emp Name :"+name + " Emp Id :" +empid;
		System.out.println(contents);
		try
		{
			fos=new FileOutputStream("Test2.txt");
		     bos=new BufferedOutputStream(fos);
		  	bos.write(contents.getBytes());
			System.out.println("data stored successfully");
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				//bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
	}

}
