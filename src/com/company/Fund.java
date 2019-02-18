package com.company;

public class Fund
{
    private String name;
    private int percentage;

    public Fund(String name)
    {
        this.name = name;
        this.percentage = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getPercentage()
    {
        return percentage;
    }

    public void setPercentage(int percentage)
    {
        this.percentage = percentage;
    }
}
