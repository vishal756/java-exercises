package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {
	private String Name;
	private int empId;
	private long sal;
	

	public EmployeeException(String name, int empId, long sal) {
		super();
		Name = name;
		this.empId = empId;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "EmployeeException [Name=" + Name + ", empId=" + empId + ", sal=" + sal + "]";
	}



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME");
		String name=sc.next();
		System.out.println("ENTER YOUR ID");
		int empId=sc.nextInt();
		System.out.println("enter your salary");
		long sal=sc.nextLong();
		try {
			if(sal<3000) {
				throw new InsufficientAmountException("salary should be greater than 3000");
			}
			else {
				EmployeeException e1=new EmployeeException(name,empId,sal);
				System.out.println(e1);
			}
		}
			catch(InsufficientAmountException iae){
				System.out.println("all the best");
				
			}

	}

}
