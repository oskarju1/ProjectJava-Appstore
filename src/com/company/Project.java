package com.company;

import java.util.Random;

import static com.company.Project.DifficultyLevel.*;

public class Project implements GenerateRandomInteger, GenerateRandomDouble
{
    private String  Name;
    private Integer ManDays;
    private Client  Client;
    private Integer Deadline;
    private Double  Punishment;
    private Double  Price;
    private Integer Payday;
    private Boolean IsAvailable;
    private Boolean IsDone;
    private Integer SummarizedTime;
    private Boolean Easy = false;
    private Boolean Medium = false;
    private Boolean Hard = false;
    private Integer FrontEndTime=0;
    private Integer BackEndTime=0;
    private Integer DatabaseTime=0;
    private Integer MobileTime=0;
    private Integer WordPressTime=0;
    private Integer PrestaShopTime=0;
    Integer[]       WorkList = new Integer[]{FrontEndTime, BackEndTime, DatabaseTime, MobileTime, WordPressTime, PrestaShopTime};

    public void setProjectAvailable()
    {
        this.IsAvailable = true;
    }

    public void deleteDoneProject()
    {
        this.IsDone = true;
    }

    @Override
    public Double DoubleGenerate() {
        Random rn = new Random();
        return rn.nextDouble() * 100;
    }

    @Override
    public Integer IntegerGenerate(Integer bound) {
        Random rn = new Random();
        return rn.nextInt(bound);
    }

    public enum DifficultyLevel {
        Easy,
        Medium,
        High;
    }

    public Project(DifficultyLevel Difficulty) {
        int Left    = 0;
        int Part1   = 0;
        int Part2   = 0;
        int Part3   = 0;

        switch (Difficulty) {
            case Easy:
                this.Deadline       = IntegerGenerate(2) + 5;
                this.Punishment     = DoubleGenerate() * 10;
                this.Price          = 500 + DoubleGenerate() * 5;
                this.Payday         = IntegerGenerate(5) + 5;
                this.SummarizedTime = IntegerGenerate(5) + 5;
                Part1               = this.WorkList[IntegerGenerate(5)] = IntegerGenerate(this.SummarizedTime);
                Left                = SummarizedTime - Part1;
                Part2               = this.WorkList[IntegerGenerate(5)] = IntegerGenerate(Left) + 5;
                IsAvailable         = false;
                IsDone              = false;
                Easy                = true;
                break;

            case Medium:
                this.Deadline       = IntegerGenerate(4) + 10;
                this.Punishment     = DoubleGenerate() * 20;
                this.Price          = 1000 + DoubleGenerate() * 100;
                this.Payday         = IntegerGenerate(5) + 10;
                this.SummarizedTime = IntegerGenerate(5) + 10;
                Part1               = this.WorkList[IntegerGenerate(5)] = IntegerGenerate(this.SummarizedTime);
                Left                = this.SummarizedTime - Part1;
                Part2               = this.WorkList[IntegerGenerate(5)] = IntegerGenerate(Left) + 1;
                Left                = Left - Part2;
                IsAvailable         = false;
                IsDone              = false;
                Medium              = true;
                break;

            case High:
                this.Deadline       = IntegerGenerate(8) + 15;
                this.Punishment     = DoubleGenerate() * 50;
                this.Price          = 2000 + DoubleGenerate() * 100;
                this.Payday         = IntegerGenerate(5) + 20;
                this.SummarizedTime = IntegerGenerate(10) + 20;
                Part1               = this.WorkList[0] = IntegerGenerate(SummarizedTime);
                Left                = SummarizedTime - Part1;
                Part2               = this.WorkList[1] = IntegerGenerate(Left);
                Left                = Left - Part2;
                Part3               = this.WorkList[2] = IntegerGenerate(Left);
                Left                = Left - Part3;
                this.WorkList[3]    = Left;
                IsAvailable         = false;
                IsDone              = false;
                Hard                = true;
                break;
        }
    }
}

