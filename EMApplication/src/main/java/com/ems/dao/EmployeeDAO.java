package com.ems.dao;

import com.ems.model.Employee;

public interface EmployeeDAO {
   void addEmployee(Employee e);
   boolean updateEmployee(int empId,String name,int age,String city);
   boolean deleteEmployee(int empId);
   void viewAll();
}
