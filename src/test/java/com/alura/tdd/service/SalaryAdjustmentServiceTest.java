package com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.alura.tdd.model.Employee;
import com.alura.tdd.model.Performance;

public class SalaryAdjustmentServiceTest {
  
  private SalaryAdjustmentService salaryAdjustmentService;
  private Employee employee;
  
  @BeforeEach
  public void initializerSalaryAdjustmentServiceAndEmployee() {
    System.out.println("initializer");
    this.salaryAdjustmentService = new SalaryAdjustmentService();
    this.employee = new Employee("Bruna", LocalDate.now(), new BigDecimal("1000.00"));
  }

  @Test
  public void salaryAdjustmentShouldBeThreePercentForUnsatisfactoryEmployee() {
    salaryAdjustmentService.grantSalaryAdjustment(employee, Performance.UNSATISFACTORY);
    assertEquals(new BigDecimal("1030.00"), employee.getSalary());
  }
  
  @Test
  public void salaryAdjustmentShouldBeFifteenPercentForEffectiveEmployee() {
    salaryAdjustmentService.grantSalaryAdjustment(employee, Performance.EFFECTIVE);
    assertEquals(new BigDecimal("1150.00"), employee.getSalary());
  }
  
  @Test
  public void salaryAdjustmentShouldBeTwentyPercentForExceptionalEmployee() {
    salaryAdjustmentService.grantSalaryAdjustment(employee, Performance.EXCEPTIONAL);
    assertEquals(new BigDecimal("1200.00"), employee.getSalary());
  }
}
