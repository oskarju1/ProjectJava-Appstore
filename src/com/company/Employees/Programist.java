package com.company.Employees;

import java.util.Random;

public class Programist extends Worker
{
    private boolean Frontend;
    private boolean Backend;
    private boolean Database;
    private boolean Mobile;
    private boolean Wordpress;
    private boolean Prestashop;

    public Programist()
    {
            Random TrueFalse    = new Random();
            this.Name           = Names[IntegerGenerate(10)];
            this.Surname        = Surnames[IntegerGenerate(6)];
            this.Age            = IntegerGenerate(100) + 1;
            this.Cash           = 0.0;
            this.Frontend       = TrueFalse.nextBoolean();
            this.Backend        = TrueFalse.nextBoolean();
            this.Database       = TrueFalse.nextBoolean();
            this.Mobile         = TrueFalse.nextBoolean();
            this.Wordpress      = TrueFalse.nextBoolean();
            this.Prestashop     = TrueFalse.nextBoolean();
    }
}
