package com.company.Employees;

public class Friend extends Programist
{
    private Double  Price;
    private Integer RiskInLate;
    private Integer RiskInFuckup;
    private String  Type;


    public String toString()
    {
        return  "Name: "                    + Name +
                "\nSurname: "               + Surname +
                "\nPrice: "                 + Price + "zł" +
                "\nRisk in being late: "    + RiskInLate +"%" +
                "\nRisk to repair: "        + RiskInFuckup +"%";
    }


    public void SetType() {
        int Rand = IntegerGenerate(2);

        if (Rand == 0) {
            Type = "Best student";
            this.Price          = 150.0;
            this.RiskInLate     = 10;
            this.RiskInFuckup   = 10;
        }
        if (Rand == 1) {
            Type                = "Medium student";
            this.Price          = 100.0;
            this.RiskInLate     = 10;
            this.RiskInFuckup   = 9;
        }
        if (Rand == 2) {
            Type = "The guy, who thinks he's da best ;)";
            this.Price          = 50.0;
            this.RiskInLate     = 8;
            this.RiskInFuckup   = 8;
        }
    }
}

