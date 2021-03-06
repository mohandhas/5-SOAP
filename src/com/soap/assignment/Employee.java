package com.soap.assignment;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="employee")
@XmlType(propOrder= {"id","name","email","phone"})
public class Employee {

	public String id;
	public String name;
	public String email;
	public String phone;
	
	public Employee() {
		super();
	}

	public Employee(String id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
