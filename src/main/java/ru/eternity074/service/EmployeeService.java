package ru.eternity074.service;

import java.util.List;

import ru.eternity074.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeid);

	public Employee updateEmployee(Employee employee);
}
