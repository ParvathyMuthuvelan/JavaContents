package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInputDemo {
	public static void main(String[] args) {
	
			FileInputStream fis=null;
			try
			{
				 fis=new FileInputStream("Sample.txt");
				int ch;
				StringBuffer sb=new StringBuffer();
//				ch=fis.read();
//				System.out.print((char)ch);
					while((ch=fis.read())!=-1)
					{
						System.out.print((char)ch);
					//	sb.append((char)ch);
					
					}
					System.out.println(sb);
				//	fis.close();
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File not found");
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			finally
			{
				try
				{
					if(fis!=null)
				fis.close();
				}
				catch(IOException e)
				{
					System.out.println(e.getMessage());
				}
			}
	}}
			
			
		


	


