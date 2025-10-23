package com.yuvraj.test;

import java.util.Scanner;

import com.yuvraj.service.EmployeeService;
import com.yuvraj.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 EmployeeService eservice=new EmployeeServiceImpl();
		 
		 
		 int choice=0;
		do {
			System.out.println("1.Add Employee to list\n2.Remove Employee list\n3.Show all Employee");
			System.out.println("4.Show all Employee in sorted order\n5.Find Employee with empName\n6.Save all Employees into file");
			System.out.println("7.Quit");
			System.out.println("Enter Choice: ");
			choice=sc.nextInt();
			 switch(choice) {
			 case 1->{
				 boolean status=eservice.AddNewEmployee();
				 if(status) {
					 System.out.println("New Employee Add successfully!..");
				 }else {
					 System.out.println("Not Added ......");
				 }
				 System.out.println("Add Employee to list");
			 }
			 case 2->{
				 System.out.println("Remove Employee list");
			 }
			 case 3->{
				 System.out.println("Show all Employee");
			 }
			 case 4->{
				 System.out.println("Show all Employee in sorted order");
			 }
			 case 5->{
				 System.out.println("Find Employee with empName");
			 }
			 case 6->{
				 System.out.println("Save all Employees into file");
			 }
			 case 7->{
				 System.out.println("Think you For Visiting.......");
			 }
			
			 
			 }
		}while(choice!=7);

	}

}
