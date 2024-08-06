package com.designpatterns.behavioral.strategy;

import com.designpatterns.behavioral.strategy.strategies.LowercaseStrategy;
import com.designpatterns.behavioral.strategy.strategies.RandomCaseStrategy;
import com.designpatterns.behavioral.strategy.strategies.UppercaseStrategy;

public class Client {
  public static void main(String[] args) {
    LowercaseStrategy str1 = new LowercaseStrategy();
    UppercaseStrategy str2 = new UppercaseStrategy();
    RandomCaseStrategy str3 = new RandomCaseStrategy();
    String input = "LOREM ipsum DOLOR sit amet";

    Executor executor = new Executor(str1);
    executor.printString(input);

    executor.strategy = str2;
    executor.printString(input);

    executor.strategy = str3;
    executor.printString(input);
  }
}

/*
lorem ipsum dolor sit amet
LOREM IPSUM DOLOR SIT AMET
LOrEm ipSUM doLoR sit AMET
*/