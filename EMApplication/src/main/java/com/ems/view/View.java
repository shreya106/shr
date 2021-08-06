package com.ems.view;

import com.ems.dao.EmployeeDAO;
import com.ems.model.Employee;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class View implements EmployeeDAO {
	
	Configuration cfg=new Configuration();
    SessionFactory sFac=cfg.addAnnotatedClass(Employee.class).configure().buildSessionFactory();
 
      Session s=sFac.openSession();
      Transaction tx=s.beginTransaction();
	@Override
	public void addEmployee(Employee e) {
	s.save(e);
	 tx.commit();
   //  s.close();
    // sFac.close();
     System.out.println("Data saved successfully!!");
		
	}

	@Override
	public boolean updateEmployee(int empId,String name,int age,String city) {
		
 Employee emp=s.get(Employee.class, empId);
  if(emp!=null) {
	  emp.setName(name);
	 emp.setAge(age);
	 emp.setCity(city);
	 return true;
	 
  }
 return false;
//	     dep.setDeptname("Fashion");
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		Configuration cfg=new Configuration();
	    SessionFactory sFac=cfg.addAnnotatedClass(Employee.class).configure().buildSessionFactory();
	 
	      Session s=sFac.openSession();
	      Transaction tx=s.beginTransaction();
		Employee emp=null;
				emp=s.get(Employee.class, empId);
		if(emp!=null) {
			s.delete(emp);
			 tx.commit();
		    // s.close();
		    // sFac.close();
		     return true;
		}
		return false;
	}

	@Override
	public void viewAll() {
		List<Employee> deps=s.createQuery("from Employee").list();
    for(Employee e1:deps) {
	    	 System.out.println(e1);
	     }
		
	}

}
