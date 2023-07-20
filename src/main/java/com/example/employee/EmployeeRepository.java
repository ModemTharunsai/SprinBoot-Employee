package com.example.employee;
import java.util.ArrayList;

public interface EmployeeRepository {
    ArrayList<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    Employee createEmployee(Employee employee);

    void updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
