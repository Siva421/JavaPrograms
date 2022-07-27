package com.exer;
abstract class CarDetails{
	public abstract String names(String a,String b,String c);
}

public class Acar extends CarDetails{
	
	@Override
	public String names(String a, String b, String c) {
		
		return a+b+c;
	}
	public static void main(String[] args) {
		Acar c = new Acar();
		System.out.println(c.names("Drive"+" ","Sound"+" ","Colors"));
		
	}

}
