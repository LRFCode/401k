package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Employee
{
    private String name;
    private int employeeId;
    private BigDecimal amountPerPayPeriod;

    private ArrayList<Fund> funds = new ArrayList<>();

    public Employee(String name, int employeeId, BigDecimal amountPerPayPeriod)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.amountPerPayPeriod = amountPerPayPeriod;

        funds.add(new Fund("End of World 2012"));
        funds.add(new Fund("End of Time 2038"));
        funds.add(new Fund("Y2K Survivors"));
        funds.add(new Fund("Super Risky Optimists"));
    }


}
