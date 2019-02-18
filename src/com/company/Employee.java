package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Employee
{
    private String name;
    private int employeeId;
    private BigDecimal amountPerPayPeriod;

    public Employee(String name, int employeeId, BigDecimal amountPerPayPeriod)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.amountPerPayPeriod = amountPerPayPeriod;
    }
}
