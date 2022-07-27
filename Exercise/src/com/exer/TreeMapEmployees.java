package com.exer;

import java.util.TreeMap;

public class TreeMapEmployees {
	public static void main(String[] args) {
		TreeMap<String,String> emp = new TreeMap<String,String>();
		emp.put("1998-02-10", "Rajesh");
		emp.put("1996-03-12", "Naveen");
		emp.put("1999-04-03", "Dev");
		emp.put("1995-05-14", "Raj");
		emp.put("1998-02-06", "Siva");
		emp.put("1998-02-16", "Chandu");
		emp.put("1999-04-27", "Pavan");
		
		System.out.println(emp);
		System.out.println(emp.get("1998-02-06"));
		System.out.println(emp.containsValue("Chandu"));
		emp.remove("1998-02-10");
		System.out.println(emp);
   }

}
