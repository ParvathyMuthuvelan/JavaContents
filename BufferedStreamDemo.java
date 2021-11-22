package com.training.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream("Test2.txt");
			bis = new BufferedInputStream(fis);
			// bis=new BufferedInputStream(new FileInputStream("Test.txt"));
			byte[] contents = new byte[1024];
			int byteread = 0;
			String strcontents;
			while ((byteread = bis.read(contents)) != -1) {
				strcontents = new String(contents, 0, byteread);
				System.out.println("The file contents " + strcontents);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fis!=null)
			fis.close();
				if(bis!=null)
					bis.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
