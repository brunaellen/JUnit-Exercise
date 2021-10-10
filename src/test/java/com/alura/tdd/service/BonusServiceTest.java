package com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.alura.tdd.model.Employee;

class BonusServiceTest {

  @Test
  void bonusShouldBeZeroIfEmployeeSalaryIsGreaterThanTenThousand() {
    BonusService bonusService = new BonusService();
    Employee employee = new Employee("Bruna", LocalDate.now(), new BigDecimal("20000.00"));
    assertThrows(IllegalArgumentException.class, () -> bonusService.calculateBonus(employee));
  }
  
  @Test
  void bonusShouldBeTenPercentIfEmployeeSalaryIsLessThanTenThousands() {
    BonusService bonusService = new BonusService();
    Employee employee = new Employee("Bruna", LocalDate.now(), new BigDecimal("2500.00"));
    BigDecimal bonusValue = bonusService.calculateBonus(employee);
    
    assertEquals(new BigDecimal("250.00"), bonusValue);
  }
  
  @Test
  void employeeShouldGetABonusOfTenPercentIfSalaryEqualsToTenThousand() {
    BonusService bonusService = new BonusService();
    Employee employee = new Employee("Bruna", LocalDate.now(), new BigDecimal("10000.00"));
    BigDecimal bonusValue = bonusService.calculateBonus(employee);
    
    assertEquals(new BigDecimal("1000.00"), bonusValue);
  }
}
