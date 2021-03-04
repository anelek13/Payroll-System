package com.example.anelya.event;
import com.example.anelya.Employee;
import org.springframework.context.ApplicationEvent;
public class SalaryChangeEvent extends ApplicationEvent {

    private Employee employee;

    public SalaryChangeEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}