package com.company;

import java.util.Random;

public class Worker extends Character implements GenerateRandomInteger, GenerateRandomDouble
{
    private Double Salary;

    @Override
    public Double DoubleGenerate() {
        Random rn = new Random();
        return rn.nextDouble() * 100;
    }

    @Override
    public Integer IntegerGenerate(Integer bound) {
        Random rn = new Random();
        return rn.nextInt(bound);
    }
}
