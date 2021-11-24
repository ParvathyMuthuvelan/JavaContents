package com.training.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	System.out.println(calendar);
	System.out.println(calendar.get(Calendar.DATE) +" "+calendar.get(Calendar.MONTH));
	System.out.println(calendar.get(Calendar.DAY_OF_WEEK) );
	System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
	calendar.set(2020, 0, 12);
	Date d=new Date();
	calendar.setTime(d);
	Date d1=calendar.getTime();
	calendar.getTimeInMillis();
	}

}
