package com.employee.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.DBUtil.DBUtil;
import com.employee.model.EmployeeData;
import com.employee.service.EmployeeService;

 @Service
public class EmployeeServiceImpl implements EmployeeService {
	
	 @Autowired
	static List<EmployeeData> employeeList = new ArrayList();
	 
	 Connection connection;
	 public EmployeeServiceImpl() throws SQLException {
		connection = DBUtil.getConnection();
	}

	@Override
	public List<EmployeeData> getEmployeeData() {
		
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM EMPLOYEE_DATA");
			ResultSet rs =stmt.executeQuery();
			while(rs.next()) {
				EmployeeData emp = new EmployeeData();
				emp.setEmpId(rs.getInt(1));
				emp.setEmployeeName(rs.getString(2));
				emp.setMailId(rs.getString(3));
				emp.setState(rs.getString(4));
				emp.setJobRole(rs.getString(5));
				
				employeeList.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employeeList;
	}

}
