package com.example.anelya.event;

import com.example.anelya.Employee;
import com.example.anelya.EmployeeType;
import com.example.anelya.SpringConfig;
import com.example.anelya.dao.EmployeeDao;
import com.example.anelya.service.SalaryCalculatorService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        SalaryCalculatorService salaryCalculatorService = new SalaryCalculatorService();context.start();
        context.stop();
        context.close();
        EmployeeDao employeeDao = context.getBean("EmployeeDao", EmployeeDao.class);
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Anelya Zhumabek");
        employee.setEmployeeType(EmployeeType.SALARIED);
        employeeDao.create(employee);
        salaryCalculatorService.calc(employee.getWorkHours(), employee.getSalary(), EmployeeType.HOURLY, employee.getSales());
    }
}
