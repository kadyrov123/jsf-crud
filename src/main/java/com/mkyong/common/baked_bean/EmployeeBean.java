package com.mkyong.common.baked_bean;

import com.mkyong.common.model.Employee;
import com.mkyong.common.model.Organization;
import com.mkyong.common.repository.EmployeeRepository;
import com.sun.org.apache.xpath.internal.operations.Or;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class EmployeeBean {
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private Organization organization = new Organization();
    private Employee employee = new Employee();
    private List<Employee> employeeList = new ArrayList<>();

    public Employee getEmployee() {
        return employee;
    }

    public Organization getOrganization(){return organization;}

    public List<Employee> getEmployeeList() {
        employee = new Employee();
        return employeeRepository.getAllEmployeesByOrganizationId(organization.getId());
    }

    public String openEmployeesPage(Organization organization){
        this.organization = organization;
        return "employees";
    }
    public String openEmployeeEditPage(Employee employee){
        this.employee = employee;
        System.out.println("EmployeeBean :: openEmployeeEditPage employee => "+employee);
        return "employee_form";
    }

    public String saveEmployee(){
        System.out.println("Current organization => "+ organization);
        System.out.println("Save Employee => "+employee);
        employee.setOrgId(organization.getId());
        employeeRepository.save(employee);
        this.employee = new Employee();
        return "employees";
    }

    public String updateEmployee(){
        employeeRepository.update(employee);
        System.out.println("Updated =>  => " + this.employee.toString());
        this.employee = new Employee();
        return "employees";
    }

    public void deleteEmployee(Employee employee){
        System.out.println("Delete Employee => "+employee);
        employeeRepository.delete(employee);
        this.employee = new Employee();
    }


}
