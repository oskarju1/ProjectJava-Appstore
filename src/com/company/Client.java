package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Client extends Character implements GenerateRandomInteger
{
    private Integer RiskInPayment;
    private Integer RiskInPenalty;
    private Integer RiskAfterFuckup;
    public static ArrayList<Client> ClientsList = new ArrayList<>(10);

    @Override
    public Integer IntegerGenerate(Integer bound)
    {
        Random rn = new Random();
        return rn.nextInt(bound);
    }

    public enum ClientGroup
    {
        Chill,
        Strict,
        Skrwl
    }

    public Client (ClientGroup Group)
    {
        switch (Group)
        {
            case Chill:
                this.Name               = Names[IntegerGenerate(6)];
                this.Surname            = Surnames[IntegerGenerate(10)];
                this.Age                = IntegerGenerate(100)+1;
                this.RiskInPayment      = IntegerGenerate(14);
                this.RiskInPenalty      = IntegerGenerate(13);
                this.RiskAfterFuckup    = 1;
                break;
            case Strict:
                this.Name               = Names[IntegerGenerate(6)];
                this.Surname            = Surnames[IntegerGenerate(10)];
                this.Age                = IntegerGenerate(100)+1;
                this.RiskInPayment      = 11;
                this.RiskInPenalty      = 11;
                this.RiskAfterFuckup    = IntegerGenerate(15);
                break;
            case Skrwl:
                this.Name               = Names[IntegerGenerate(6)];
                this.Surname            = Surnames[IntegerGenerate(10)];
                this.Age                = IntegerGenerate(100)+1;
                this.RiskInPayment      = IntegerGenerate(13);
                this.RiskInPenalty      = 11;
                this.RiskAfterFuckup    = 11;
        }
        for(Integer i=0; i<10; i++)
        {
            Client y = null;
            Integer Rand = IntegerGenerate(2);
            if (Rand == 0)
            {
                y = new Client(ClientGroup.Chill);
            }
            else if (Rand == 1)
            {
                y = new Client(ClientGroup.Strict);
            }
            else if (Rand == 2)
            {
                y = new Client(ClientGroup.Skrwl);
            }
            ClientsList.add(y);
        }
    }

    public static void AvailableClients()
    {
        //System.out.println(ClientsList.size());
        for(Integer i=0; i<ClientsList.size(); i++)
        {
            System.out.println((i+1) + ". " + ClientsList.get(i) + "\n");
        }
    }

    public String toString()
    {
        return  "Name:\t"               + Name +
                "\nSurname:\t"          + Surname +
                "\nAge:\t"              + Age +
                "\nRiskInPayment:\t"    + RiskInPayment +
                "\nRiskInPenalty:\t"    + RiskInPenalty +
                "\nRiskAfterFuckup:\t"  + RiskAfterFuckup;
    }
}
