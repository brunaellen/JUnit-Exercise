package com.alura.tdd.model;

import java.math.BigDecimal;

public enum Performance {
  UNSATISFACTORY {
    @Override
    public BigDecimal percentageOfSalaryAdjustment() {
      return new BigDecimal("0.03");
    }
  }, 
  EFFECTIVE {
    @Override
    public BigDecimal percentageOfSalaryAdjustment() {
      return new BigDecimal("0.15");
    }
  }, 
  EXCEPTIONAL {
    @Override
    public BigDecimal percentageOfSalaryAdjustment() {
      return new BigDecimal("0.20");
    }
  };
  
  
  public abstract BigDecimal percentageOfSalaryAdjustment();
}
