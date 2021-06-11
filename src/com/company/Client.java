package com.company;

import java.util.Random;

public class Client extends Character implements GenerateRandomInteger
{
    private String  ClientGroup;
    private Integer RiskInPayment;
    private Integer RiskInPenalty;
    private Integer RiskAfterFuckup;

    @Override
    public Integer IntegerGenerate(Integer bound) {
        Random rn = new Random();
        return rn.nextInt(bound);
    }

    public enum Type
    {
        Chill,
        Strict,
        Skrwl;
    }

    public Client (Type Type)
    {
        switch (Type)
        {
            case Chill:
                this.Name = Names[IntegerGenerate(6)];
                this.Surname = Surnames[IntegerGenerate(10)];
                this.Age = IntegerGenerate(100)+1;
                this.RiskInPayment = IntegerGenerate(14);
                this.RiskInPenalty = IntegerGenerate(13);
                this.RiskAfterFuckup = 1;
                break;
            case Strict:
                this.Name = Names[IntegerGenerate(6)];
                this.Surname = Surnames[IntegerGenerate(10)];
                this.Age = IntegerGenerate(100)+1;
                this.RiskInPayment = 11;
                this.RiskInPenalty = 11;
                this.RiskAfterFuckup = IntegerGenerate(15);
                break;
            case Skrwl:
                this.Name = Names[IntegerGenerate(6)];
                this.Surname = Surnames[IntegerGenerate(10)];
                this.Age = IntegerGenerate(100)+1;
                this.RiskInPayment = IntegerGenerate(13);
                this.RiskInPenalty = 11;
                this.RiskAfterFuckup = 11;
        }
    }

}
