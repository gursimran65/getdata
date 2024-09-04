package com.employee.model;

public class EmployeeData {
	int empId;
	String employeeName;
	String mailId;
	String state;
	String jobRole;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public EmployeeData(int empId, String employeeName, String mailId, String state, String jobRole) {
		this.empId = empId;
		this.employeeName = employeeName;
		this.mailId = mailId;
		this.state = state;
		this.jobRole = jobRole;
	}
	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeData [empId=" + empId + ", employeeName=" + employeeName + ", mailId=" + mailId + ", state="
				+ state + ", jobRole=" + jobRole + "]";
	}
}
