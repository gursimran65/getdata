package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeData;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/getemployeeinfo")
	public List<EmployeeData> getEmployees(){
		return this.empService.getEmployeeData();
	}
}
