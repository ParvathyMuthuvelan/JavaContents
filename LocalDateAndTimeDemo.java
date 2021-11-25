package com.training.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateAndTimeDemo {

	public static void main(String args[]) {

		// the current date
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);

		// the current time
		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

		// to print in a particular format
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		String formatedDateTime = current.format(df);

		System.out.println("in foramatted manner " + formatedDateTime);

		// printing months days and seconds
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

		// printing some specified date
		LocalDate date2 = LocalDate.of(2002, 1, 26);
		System.out.println("date :" + date2);
  System.out.println("current date="+current);
		// printing date with current time.
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);

		System.out.println("specfic date with " + "current time : " + specificDate);
		LocalDate nextTuesday = date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
	      System.out.println("Next Tuesday on : " + nextTuesday);
	}

}
