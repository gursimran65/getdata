package com.employee.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.employee.model.EmployeeData;

@Repository
public interface EmployeeService {
	public List<EmployeeData> getEmployeeData();
}
