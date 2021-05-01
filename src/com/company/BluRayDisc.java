package com.company;
//Mashood Khan CSC 1322 Section 02
public class BluRayDisc {
    private String title;
    private String director;
    private int yearOfRelease;
    private double cost;
    BluRayDisc(String td,String dr, int year, double cost)
    {
        this.title = td;
        this.director = dr;
        this.yearOfRelease = year;
        this.cost = cost;

    }
    public String getTitle(){return this.title;}
    public double getcost()
    {
        return this.cost;
    }
    public String Tostring()
    {
        return "$"+cost+" "+yearOfRelease+" "+title+", "+director;
    }
}
