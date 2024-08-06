package com.designpatterns.behavioral.strategy.strategies;

import com.designpatterns.behavioral.strategy.PrintStrategy;

public class UppercaseStrategy implements PrintStrategy {

  @Override
  public String formatString(String input) {
    return input.toUpperCase();
  }
  
}
