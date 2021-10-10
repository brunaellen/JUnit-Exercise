package com.alura.tdd.service;

import java.math.BigDecimal;

import com.alura.tdd.model.Employee;

public class BonusService {
  
  public BigDecimal calculateBonus(Employee employee) {
    BigDecimal employeeBonusValue = employee.getSalary().multiply(new BigDecimal("0.1"));
    BigDecimal maximumRangeValueOfBonus = new BigDecimal("1000");
    
    if (employeeBonusValue.compareTo(maximumRangeValueOfBonus) > 0) {
      throw new IllegalArgumentException("employee won't receive the bonus "
          + "as salary is greater than ten thousand!");
    }
    return employeeBonusValue.setScale(2);
  }
}
