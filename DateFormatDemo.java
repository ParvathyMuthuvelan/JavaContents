package com.training.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Default date format="+d);
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.UK);
		System.out.println("UK short style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.UK);
		System.out.println("UK full style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		System.out.println("US short style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
		System.out.println("US medium style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMAN);
		System.out.println("German short style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
		System.out.println("German full style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINESE);
		System.out.println("China short style=" + df.format(d));
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
		System.out.println(""
				+ "italy short style=" + df.format(d));

	}

}
