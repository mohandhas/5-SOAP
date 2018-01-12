package com.soap.assignment;

import javax.xml.ws.Endpoint;
import java.util.ArrayList;


public class Main {
	
	static ArrayList<Employee> empList=new ArrayList<>();
	
	public static void main(String args[]) 
	{
		Endpoint.publish("http://localhost:3001/ws/employee",new EmployeeImpl());
	}
}
