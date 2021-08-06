package com.ems;

import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;
import com.ems.view.View;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDAO empd=new View();
    	 Scanner sc=new Scanner(System.in);
    	 boolean res=true;
       while(res) {
       System.out.println("1.Add Employee\n2.Update Employee\n3.Delete Employee\n4.View Employees\n5.Exit");
      
       int empId;
       String name;
       String city;
       int age;
       int num=sc.nextInt();
       switch(num) {
       case 1:
    	   System.out.println("Enter empID,name,age, city of employee");
    	   empId=sc.nextInt();
    	   name=sc.next();
    	  age=sc.nextInt();
    	  city=sc.next();
    	   Employee emp=new Employee(empId,name,age,city);
    	   empd.addEmployee(emp);
    	   break;
       case 2:
    	   System.out.println("enter empid,name,age city");
    	   empId=sc.nextInt();
    	   name=sc.next();
    	   age=sc.nextInt();
    	   city=sc.next();
    	   boolean flag=empd.updateEmployee(empId, name, age, city);
    	   if(flag==true) {
    		   System.out.println("Data updated successfully!!");
    		   System.out.println(empId+" "+name+" "+age+" "+city);
    	   }else {
    		   System.out.println("No such empID");
    	   }
    	   break;
       case 3:
    	   System.out.println("Enter empID");
    	   empId=sc.nextInt();
    	   boolean flag1=empd.deleteEmployee(empId);
    	   if(flag1==true) {
    		   System.out.println("Employee Deleted successfully!!");
    	   }else {
    		   System.out.println("Wrong empId!");
    	   }
    	   break;
       case 4:
    	  empd.viewAll();
    	  break;
       case 5:
    	   System.exit(0);
       default:
    	   System.out.println("Invalid input");
       } 
       
    }}
}
