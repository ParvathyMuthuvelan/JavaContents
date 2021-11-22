package com.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		Scanner sc=new Scanner(System.in);
		String name,id;
		try
		{
		fw=new FileWriter("Sample1.txt");
		bw=new BufferedWriter(fw);
		System.out.println("enter name and id");
		name=sc.nextLine();
		id=sc.next();
		bw.write("Name :"+name);
		bw.newLine();
		bw.write("Id :"+id);
		bw.flush();
		System.out.println("data stored successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		


	}

}
