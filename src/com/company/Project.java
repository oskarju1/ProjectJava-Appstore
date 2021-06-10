package com.company;

public class Project
{
    private String  Name;
    private Integer ManDays;
    private Client  Client;
    private Double  Deadline;
    private Double  Punishment;
    private Double  Price;
    private Double  Payday = Deadline + 10;
    private String  Difficulty;
    private Skills  Skills;

    public Project(String Name, Integer ManDays, Client Client, Double Deadline, Double Punishment, Double Price, Double Payday, String Difficulty)
    {
        this.Name       = Name;
        this.ManDays    = ManDays;
        this.Client     = Client;
        this.Deadline   = Deadline;
        this.Punishment = Price * 0.1;
        this.Price      = Price;
        this.Payday     = Payday;
        this.Difficulty = Difficulty;
    }

    public String toString()
    {
        return Name +
                "\nClient: "            + Client.toString() +
                "\nDifficulty: "        + Difficulty +
                "\nMan Days: "          + ManDays +
                "\nPrice: "             + Price + "zł" +
                "\nRequired skills: "   + Skills + "\n";
    }
}
