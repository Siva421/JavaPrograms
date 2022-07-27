package com.exer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
	public static void main(String[] args) {
		LocalDateTime myObj = LocalDateTime.now();
		LocalDate myObj1 = LocalDate.now();
		LocalTime myObj2 = LocalTime.now();
		System.out.println(myObj);
		System.out.println(myObj1);
		System.out.println(myObj2);
	}

}
