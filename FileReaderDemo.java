package com.training.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("fwriter.txt");
			int ch;
			
				while((ch=fr.read())!=-1)
				{
					System.out.print((char)ch);
				}
				System.out.println();
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File does not exist");
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

		
	}

}
