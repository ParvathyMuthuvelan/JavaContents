package com.training.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Default date format="+d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String result=sdf.format(d);
		System.out.println(result);
		sdf=new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("MMM, dd ,yyyy");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("EEE");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("MMM");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("MMMM-dd-yyyy hh:mm:ss a");
		System.out.println(sdf.format(d));
		sdf=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		System.out.println(sdf.format(d));
		
	}

}
