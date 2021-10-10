package com.alura.tdd.service;

import java.math.BigDecimal;

import com.alura.tdd.model.Employee;
import com.alura.tdd.model.Performance;

public class SalaryAdjustmentService {

  public void grantSalaryAdjustment(Employee employee, Performance performance) {
    BigDecimal percentageOfsalaryAdjustment = performance.percentageOfSalaryAdjustment();
    BigDecimal valueOfsalaryAdjustment = employee.getSalary().multiply(percentageOfsalaryAdjustment);
    
    employee.adjustSalary(valueOfsalaryAdjustment);
  }
}
