package com.company.Employees;

public class Tester extends Worker
{
    public Tester()
    {
        this.Name           = Names[IntegerGenerate(10)];
        this.Surname        = Surnames[IntegerGenerate(6)];
        this.Age            = IntegerGenerate(100) + 1;
    }
}
