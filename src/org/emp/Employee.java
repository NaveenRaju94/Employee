package org.emp;

public class Employee {
	
	public void empId()
	{
		System.out.println("15875");
		
	}
	
	public void empName()
	{
		System.out.println("Naveen");
		
	}
	public void empDob() {
		System.out.println("26-sep-1994");
		
	}
	
	public void empPhone() {
		
		System.out.println("9965250726");
		
	}

	
	public void empEmail() {
		
		System.out.println("rajunaveen94@gmail.com");
		
	}
	
	public void empAddress() {
		
		System.out.println("Dharapuram");
	}


	public static void main(String[] args) {
		
Employee e = new Employee();
e.empId();
e.empName();
e.empDob();
e.empPhone();
e.empEmail();
e.empAddress();
	}}
