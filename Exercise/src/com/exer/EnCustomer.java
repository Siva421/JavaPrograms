package com.exer;

class Customer {
	private int customerId;
	private String customerName;
	private char customerInitial;

	public char getCustomerInitial() {
		return customerInitial;
	}

	public void setCustomerInitial(char customerInitial) {
		this.customerInitial = customerInitial;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}

public class EnCustomer {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerId(21);
		c.setCustomerName("Siva");
		c.setCustomerInitial('M');
		System.out.println("Customer Id:" + c.getCustomerId());
		System.out.println("Customer Name:" + c.getCustomerName());
		System.out.println("Customer Initial:"+ c.getCustomerInitial());
	}

}
