package com.company;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Game extends Character implements GenerateRandomInteger
{
    public  LocalDate   StartDate = LocalDate.of(2020,1, 1);
    private boolean     Frontend;
    private boolean     Backend;
    private boolean     Mobile;
    private boolean     Database;
    private boolean     Wordpress;
    private boolean     Prestashop;
    public String[]     WorkersList;
    public String[]     ProjectsList;


    public Game(String Name, String Surname, Integer Age)
    {
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
    public Integer IntegerGenerate(Integer bound)
    {
        Random rn = new Random();
        return rn.nextInt(bound);
    }

    public static void CLS() //clear console
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void Round(Game Game)
    {
        Integer x = 0;
        Scanner Key = new Scanner(System.in);
        while (x != 23131) {
            System.out.println("Today is " + StartDate + " whatcha wanna do?");
            System.out.println("(1)");
            System.out.println("(2)");
            System.out.println("(3)");
            System.out.println("(4)");
            System.out.println("(5)");
            System.out.println("(6)");
            System.out.println("(7)");
            System.out.println("(8)");
            System.out.println("(9)");
            System.out.println("(10) Close app.");

            x = Key.nextInt();
            CLS();
            switch (x)
            {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    ////////////
                    break;
                case 4:
                    ////////////
                    break;
                case 5:
                    ///////////
                    break;
                case 6:
                    ///////////
                    break;
                case 7:
                    //////////
                    break;
                case 8:
                    //////////
                    break;
                case 9:
                    /////////
                    break;
                case 10:
                    System.exit(0);
                    break;
            }
        }
        StartDate = StartDate.plusDays(1);
    }


}
