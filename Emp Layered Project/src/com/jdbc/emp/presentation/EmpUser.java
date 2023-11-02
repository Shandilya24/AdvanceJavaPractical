package com.jdbc.emp.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.emp.dao.EmpDao;
import com.jdbc.emp.entity.Emp;

public class EmpUser implements IEmpUser {
	Integer eno, salary;
	String ename, dept;
	
	Scanner sc=new Scanner(System.in);
	EmpDao empDao=new EmpDao();
	
	public void inputAddEmp() throws SQLException {
		System.out.print("Enter Employee's Number: ");
		eno=sc.nextInt();
		
		System.out.print("Enter Employee's Name: ");
		ename=sc.next();
		
		System.out.print("Enter Employee's Salary: ");
		salary=sc.nextInt();
		
		System.out.print("Enter Employee's Department: ");
		dept=sc.next();
		
		Emp emp=new Emp();
		emp.setEno(eno);
		emp.setEname(ename);
		emp.setSalary(salary);
		emp.setDept(dept);
		
		System.out.println(empDao.addEmp(emp));
	}
	
	public void inputDeleteEmp() throws SQLException{
		System.out.print("Enter Employee's Number: ");
		eno=sc.nextInt();
		
		System.out.println(empDao.deleteEmp(eno));
	}
	
	public void inputUpdateEmp() throws SQLException{
		System.out.print("Enter Employee's Number: ");
		eno=sc.nextInt();
		
		System.out.print("Enter Employee's Salary: ");
		salary=sc.nextInt();
		
		Emp emp=new Emp();
		emp.setEno(eno);
		emp.setEname(ename);
		emp.setSalary(salary);
		emp.setDept(dept);
		
		System.out.println(empDao.updateEmp(emp));
	}
	
	public void inputFindEmpbyID() throws SQLException{
		System.out.print("Enter Employee's Number: ");
		eno=sc.nextInt();
		
		Emp emp=empDao.findEmpbyID(eno);
		if(emp!=null) {
			System.out.println("Eno\tEname\tSalary\tDept");
			System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getSalary()+"\t"+emp.getDept());
		}
		else {
			System.out.println("Details Not Found....");
		}
	}
	
	public void inputFindAllEmp() throws SQLException{
		List<Emp> list=empDao.findAllEmp();
		if(list.size()>0) {
			System.out.println("Eno\tEname\tSalary\tDept");
			for(Emp emp:list) {
				System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getSalary()+"\t"+emp.getDept());
			}
		}
		else {
			System.out.println("No details found....");
		}
	}
}