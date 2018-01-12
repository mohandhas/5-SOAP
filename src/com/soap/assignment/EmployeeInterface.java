package com.soap.assignment;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface EmployeeInterface {
	
	@WebMethod void addEmployee(String eId,String name,String email, String phone);
	@WebMethod void deleteEmployee(String eId);
	@WebMethod Employee getEmployee(String eId);
	@WebMethod ArrayList<Employee> getAll();

}
