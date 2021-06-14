package com.company;

import java.util.ArrayList;
import java.util.Random;

import static com.company.Game.Key;


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
    private static Boolean IsDone;
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
    public static ArrayList<Project> AvailableProjects = new ArrayList<>();
    public static ArrayList<Project> StartedProjects = new ArrayList<>();
    public ArrayList<Project> DeletedProjects = new ArrayList<>();

    public enum Difficulty {
        Easy,
        Medium,
        Hard
    }

    public Project(Difficulty Difficulty) {
        int Left    = 0;
        int Part1   = 0;
        int Part2   = 0;
        int Part3   = 0;

        switch (Difficulty) {
            case Easy:
                this.Deadline       = IntegerGenerate(2) + 5;
                this.Punishment     = Math.round(DoubleGenerate() * 100.0) / 100.0 * 10;
                this.Price          = 500 + Math.round(DoubleGenerate() * 100.0) / 100.0;
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
                this.Punishment     = Math.round(DoubleGenerate() * 100.0) / 100.0 * 20;
                this.Price          = 1000 + Math.round(DoubleGenerate() * 100.0) / 100.0;
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

            case Hard:
                this.Deadline       = IntegerGenerate(8) + 15;
                this.Punishment     = Math.round(DoubleGenerate() * 100.0) / 100.0 * 50;
                this.Price          = 2000 + Math.round(DoubleGenerate() * 100.0) / 100.0;
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

    public void setProjectAvailable()
    {
        this.IsAvailable = true;
    }

    public static void deleteDoneProject(Integer Index)
    {
        Project.IsDone = true;
        StartedProjects.remove(Index-1);
    }


    public static void openProjects(Game Game){
        for(int i=0; i<StartedProjects.size(); i++){
            System.out.println((i+1) + ". " + StartedProjects.get(i) + "\n");
        }
        if (StartedProjects.size() != 0) {
            System.out.println("Wanna return a project? Type number of project.");
            Game.x = Key.nextInt();
            deleteDoneProject(Game.x);
        }
        else System.out.println("U've got no projects.");
    }


    public static void newProject(Game Game){
        System.out.println("(1) Easy");
        System.out.println("(2) Medium");
        System.out.println("(3) Hard");
        switch (Key.nextInt())
        {
            case 1:
                StartedProjects.add(new Project(Difficulty.Easy));
            case 2:
                StartedProjects.add(new Project(Difficulty.Medium));
            case 3:
                StartedProjects.add(new Project(Difficulty.Hard));
        }
    }

    public String toString()
    {
        return  "Difficulty:\t"         + Difficulty.values() +
                "\nDeadline:\t"         + Deadline +
                "\nPunishment:\t"       + Punishment + "zł" +
                "\nPrice:\t"            + Price + "zł" +
                "\nPayday:\t"           + Payday +
                "\nSummarizedTime:\t"   + SummarizedTime;
    }
}

