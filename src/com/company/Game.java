package com.company;

import java.util.Random;

public class Game extends Character implements GenerateRandomInteger
{
    private boolean Frontend;
    private boolean Backend;
    private boolean Mobile;
    private boolean Database;
    private boolean Wordpress;
    private boolean Prestashop;
    public String[] WorkersList;
    public String[] ProjectsList;

    public Game(String Name, String Surname, Integer Age) {
        this.Name       = Name;
        this.Surname    = Surname;
        this.Age        = Age;
        this.Frontend   = true;
        this.Backend    = true;
        this.Mobile     = false;
        this.Database   = true;
        this.Prestashop = true;
        this.Wordpress  = true;
        this.Cash       = 5000.0;
    }

    @Override
    public Integer IntegerGenerate(Integer bound) {
        Random rn = new Random();
        return rn.nextInt(bound);
    }
}
