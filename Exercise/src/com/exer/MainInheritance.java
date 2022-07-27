package com.exer;
class parent{
	String FirstName = "Raghu";
	String SurName = "Mallela";
	void parentinfo() {
		System.out.println("FirstName of parent:"+FirstName);
		System.out.println("SurName of parent:"+SurName);
	}
}
class child extends parent{
	String FirstName = "Siva";
	void childinfo() {
		System.out.println("FirstName of child:"+FirstName);
		System.out.println("SurName of child:"+SurName);
	}
}
public class MainInheritance {
	public static void main(String[] args) {
		child c = new child();
		c.parentinfo();
		c.childinfo();
	}

}
