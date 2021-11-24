package com.training.date;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		Date d1=new Date(2019,11,23);
		System.out.println("current date="+d);
		System.out.println(d1);
		System.out.println(d1.getYear());
		System.out.println(d.getDate() +" "+d.getMonth()+" "+d.getYear());

	}

}
