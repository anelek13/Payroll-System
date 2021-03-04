package com.example.anelya.service;

import com.example.anelya.EmployeeType;

public class SalaryCalculatorService {
    int commission = 10;
    public void calc(int hour, int salary, EmployeeType employeeType,int sales){
        if(employeeType == EmployeeType.HOURLY){
            if(hour > 40){
                System.out.println(((40*salary)+(hour-40)*salary*1.5));
            }
            else
                System.out.println(salary*hour);
            }
        if(employeeType == EmployeeType.SALARIED){
            System.out.println(salary);
        }
        if(employeeType == EmployeeType.COMMISSION){
            System.out.println(salary*(1-commission/100));
        }
        if(employeeType == EmployeeType.SALARIED_COMMISSION){
            System.out.println(salary+(sales*commission/100));
        }
    }
}
