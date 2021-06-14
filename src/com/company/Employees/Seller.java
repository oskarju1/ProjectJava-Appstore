package com.company.Employees;

public class Seller extends Worker
{
    public Seller()
    {
        this.Name           = Names[IntegerGenerate(10)];
        this.Surname        = Surnames[IntegerGenerate(6)];
        this.Age            = IntegerGenerate(100) + 1;
    }

}
