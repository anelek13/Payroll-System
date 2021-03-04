package com.example.anelya.dao;

import com.example.anelya.Employee;
import com.example.anelya.event.SalaryChangeEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeDao implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    public void create(Employee employee) {
        System.out.println("EmployeeDao.create");
        System.out.println("employee = " + employee);

        //TODO create user in db

        this.eventPublisher.publishEvent(new SalaryChangeEvent(this, employee));
    }

    public void update(Long id, Employee employee) {
        System.out.println("EmployeeDao.update");
    }

    public void delete(Long id) {
        System.out.println("EmployeeDao.delete id: " + id);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}


