package com.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employee1")
public class Employee {
	
	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="city")
	private String city;
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
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


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String name, int age, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	

}
