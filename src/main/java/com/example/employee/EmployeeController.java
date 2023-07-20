package com.example.employee;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.EmployeeService;
import java.util.List;

@RestController
class EmployeeController {
    EmployeeService employeeService=new EmployeeService();
    
    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public void updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee updatedEmployee) {
         employeeService.updateEmployee(employeeId, updatedEmployee.getEmployeeName(), updatedEmployee.getEmail(),updatedEmployee.getDepartment());
      return employeeService.getEmployeeById(employeeId);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
