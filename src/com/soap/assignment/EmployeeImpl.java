package com.soap.assignment;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface="com.soap.assignment.EmployeeInterface")

public class EmployeeImpl implements EmployeeInterface
{

	@Override
	public void addEmployee(String eId, String name, String email, String phone) {

		Main.empList.add(new Employee(eId,name,email,phone));
	}

	@Override
	public void deleteEmployee(String eId) {
		for(int i=0;i<Main.empList.size();i++)
		{
			if((Main.empList.get(i).id).equals(eId)) {
					Main.empList.remove(i);
			}
		}
	}

	@Override
	public Employee getEmployee(String eId) {
		for(int i=0;i<Main.empList.size();i++)
		{
			if((Main.empList.get(i).id).equals(eId)) 
			{
				return Main.empList.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAll() {
		
		return Main.empList;
	}
	
}