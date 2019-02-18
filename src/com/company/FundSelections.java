package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class FundSelections
{
    private ArrayList<Fund> funds = new ArrayList<>();
    private BigDecimal amountPerPayPeriod;

    public FundSelections(BigDecimal amountPerPayPeriod)
    {
        this.amountPerPayPeriod = amountPerPayPeriod;

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
            BigDecimal amount = amountPerPayPeriod.multiply(new BigDecimal(fund.getPercentage()));
            amount = amount.divide(new BigDecimal(100), RoundingMode.HALF_UP);

            System.out.println("(" + selectionNumber + ") " + fund.getName() + " " + fund.getPercentage() + "%  $" + amount);
            selectionNumber++;
        }
    }

    public void setPercentage(int fundNumber, int percentage)
    {
        Fund fund = this.funds.get(fundNumber - 1);
        fund.setPercentage(percentage);
    }

    public boolean fullyAllocated()
    {
        int totalPercent = 0;

        for (Fund fund:this.funds)
        {
            totalPercent += fund.getPercentage();
        }

        return totalPercent == 100;
    }
}
