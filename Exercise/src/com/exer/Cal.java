package com.exer;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		SimpleDateFormat d = new SimpleDateFormat();
		Calendar ref= Calendar.getInstance();
		System.out.println(ref.get(Calendar.YEAR));
		System.out.println(ref.get(Calendar.MONTH));
		System.out.println(ref.get(Calendar.DATE));
		
		System.out.println(d.format(ref.getTime()));
	}

}
