package com.exer;
class Cricket{
	public void sachin() {
		System.out.println("sachin");
	}
}
class Child1 extends Cricket{
	public void sachin() {
		System.out.println("Kohli");
	}
}
class Child2 extends Cricket{
	public void sachin() {
		System.out.println("KL.Rahul");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		Cricket c1 = new Child1();
		c1.sachin();
		Cricket c2 = new Child2();
		c2.sachin();
	}

}
