package com.company;

public class Friend
{
    private String Name;
    private String Type;
    private Double Price;
    private Double RiskInLate;
    private Double RiskInFuckup;
    private Skills Skill;

    public Friend (String Name, String Type, Double Price, Double RiskInLate, Double RiskInFuckup, Skills Skill)
    {
        this.Name           = Name;
        this.Type           = Type;
        this.Price          = Price;
        this.RiskInLate     = RiskInLate;
        this.RiskInFuckup   = RiskInFuckup;
        this.Skill          = Skill;
    }

    public String toString()
    {
        return  "Name: "                    + Name +
                "\nPrice: "                 + Price + "zł" +
                "\nRisk in being late: "    + RiskInLate +"%" +
                "\nRisk to repair: "        + RiskInFuckup +"%" +
                "\nSkills: "                + Skill;
    }
}

