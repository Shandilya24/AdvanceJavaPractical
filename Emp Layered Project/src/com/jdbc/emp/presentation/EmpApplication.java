package com.jdbc.emp.presentation;

import java.sql.SQLException;
import java.util.Scanner;

public class EmpApplication {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		EmpUser empUser=new EmpUser();
		int choice=0;
		System.out.println("---------Employee Operations------");
		System.out.println("-----------------------------------");
		System.out.println("1, Add Record");
		System.out.println("2, Delete Record");
		System.out.println("3, Update Record");
		System.out.println("4, Find Record by Id");
		System.out.println("5, Find All Record");
		System.out.println("6, Exit");
		
		while(choice!=6) {
			System.out.println("Enter Operation no: ");
			choice=sc.nextInt();
			try {
				switch(choice) {
					case 1:empUser.inputAddEmp();
						   break;
						   
					case 2:empUser.inputDeleteEmp();
					   break;
							
					case 3:empUser.inputUpdateEmp();
						   break;
						   
					case 4:empUser.inputFindEmpbyID();
					   
					case 5:empUser.inputFindAllEmp();
						   break;
						   
					case 6:System.out.println("Exit your operation");
					       System.exit(0);
					       
					default: System.out.println("Invalid choice...");
				}
			}
			catch(SQLException e) {
				System.out.println(e);
			}
		}
	}
}