package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee1")
public class Employee {
	//empid,name,age,city
	@Id
	@Column(name="empid")
	private int empId;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="city")
	private String city;
	public Employee(int empId, String name, int age, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
