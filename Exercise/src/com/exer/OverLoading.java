package com.exer;

public class OverLoading {
	
	public void LargestNumber(int n1,int n2) {
	
		if(n1>n2) {
			System.out.println(n1 + "is Largest");
		}else {
			System.out.println(n2 + "is Largest");
		}
				
	}
	public void LargestNumber(int n1,int n2,int n3) {
		
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1 + "is Largest");
		}else if(n2>n1 && n2 >n3) {
			System.out.println(n2 + "is Largest");
		}else {
			System.out.println(n3 + "is Largest");
		}
		
	}
	public void LargestNumber(int n1,int n2,int n3,int n4) {
		
				if(n1>n2 && n1>n3 && n1>n4) {
					System.out.println(n1 + "is Largest");
				}else if(n2>n1 && n2>n3 && n2>n4) {
					System.out.println(n2 +"is Largest");
				}else if(n3>n1 && n3>n2 && n3>n4) {
					System.out.println(n3 +"is Largest");
				}else {
					System.out.println(n4 +"is Largest");
				}
		
	}
	
	public static void main(String[] args) {
		OverLoading ref = new OverLoading();
		ref.LargestNumber(12, 10);
		ref.LargestNumber(234, 7, 123);
		ref.LargestNumber(1121, 1211, 321, 421);
		
	}
	
}
