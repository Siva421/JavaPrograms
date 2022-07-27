package com.exer;

public interface Numbers {
	public abstract int addition(int n1,int n2);
	public abstract int adding(int n1,int n2,int n3);

}
class Values implements Numbers{
	@Override
	public int addition(int n1, int n2) {
		
		return n1+n2;
	}
	@Override
	public int adding(int n1, int n2, int n3) {
		
		return n1+n2+n3;
	}
	
}
class Main1{
	public static void main(String[] args) {
		Values v = new Values();
		System.out.println(v.addition(21, 421));
		System.out.println(v.adding(21, 121, 421));
	}
}
                                      