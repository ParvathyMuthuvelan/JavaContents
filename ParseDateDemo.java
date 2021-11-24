//Read date in dd/MM/yyyy format and convert it to MM-dd-yyyy format
package com.training.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;

public class ParseDateDemo {

	public static void main(String[] args) {
		String inputDate;
		Scanner scanner = new Scanner(System.in);
		try
		{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//sdf.setLenient(false);
		SimpleDateFormat sdf1= new SimpleDateFormat("MM-dd-yyyy");
		System.out.println("Enter date in dd/MM/yyyy format");
		inputDate = scanner.next();
		//converting string date to Date object
		Date d = sdf.parse(inputDate);
		System.out.println("Converted date="+d);
		//convert Date object to required format
		String formattedDate=sdf1.format(d);
		System.out.println("Formatted date="+formattedDate);
		sdf1=new SimpleDateFormat("EEEE");
		System.out.println("Day name="+sdf1.format(d));
		}
		catch(ParseException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
	//System.out.println("Invalid date");
		}

	}

}
