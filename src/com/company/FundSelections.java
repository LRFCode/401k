package com.company;

import java.util.ArrayList;

public class FundSelections
{
    private ArrayList<Fund> funds = new ArrayList<>();

    public FundSelections()
    {
        funds.add(new Fund("End of World 2012"));
        funds.add(new Fund("End of Time 2038"));
        funds.add(new Fund("Y2K Survivors"));
        funds.add(new Fund("Super Risky Optimists"));
    }

    public void displayFunds()
    {
        int selectionNumber = 1;

        for (Fund fund:this.funds)
        {
            System.out.println("(" + selectionNumber + ") " + fund.getName() + " " + fund.getPercentage() + "%");
            selectionNumber++;
        }
    }

    public void setPercentage(int fundNumber, int percentage)
    {
        Fund fund = this.funds.get(fundNumber - 1);
        fund.setPercentage(percentage);
    }
}
