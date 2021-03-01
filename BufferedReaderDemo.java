package com.training.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
	
		try
		{
			fr=new FileReader("Sample1.txt");
			br=new BufferedReader(fr);
			String str="";
			
				while((str=br.readLine())!=null)
				{
					System.out.println(str);
				}
			
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File does not exist");
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	}


