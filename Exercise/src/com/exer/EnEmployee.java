package com.exer;
class employee{
	private int EmployeeId;
	private String EmployeeName;
	private char EmployeeInitial;
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public char getEmployeeInitial() {
		return EmployeeInitial;
	}
	public void setEmployeeInitial(char employeeInitial) {
		EmployeeInitial = employeeInitial;
	}
	
}
public class EnEmployee {
	public static void main(String[] args) {
		employee emp = new employee();
		emp.setEmployeeId(21);
		emp.setEmployeeName("Siva");
		emp.setEmployeeInitial('M');
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getEmployeeName());
		System.out.println(emp.getEmployeeInitial());
	}

}
