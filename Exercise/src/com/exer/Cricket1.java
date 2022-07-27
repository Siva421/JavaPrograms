package com.exer;
abstract class Players{
	public abstract String names(String a,String b);
	public abstract String names1(String a,String b,String c);
}

public class Cricket1 extends Players{

	@Override
	public String names(String a, String b) {
		return a+b;
	}

	@Override
	public String names1(String a, String b, String c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Cricket1 c = new Cricket1();
		System.out.println(c.names("Sachin"+" ","Dhoni"));
		System.out.println(c.names1("Kohli"+" ","KL.rahul"+" ","Pant"));
	}

}
