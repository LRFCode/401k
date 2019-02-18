package com.company;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        enrollEmployee();
    }

    private static void enrollEmployee()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        //String name = input.nextLine();
        String name = "Sally Saver";

        System.out.println("Please enter your employee id:");
        //int employeeId = input.nextInt();
        int employeeId = 1234;

        System.out.println("How much would you like to invest per pay period? ");
        //String amount = input.next();
        String amount = "100.10";

        System.out.println("N: " + name);
        System.out.println("E: " + employeeId);
        System.out.println("N: " + amount);

        Employee employee = new Employee(name, employeeId, new BigDecimal(amount));

        System.out.println();
        System.out.println("Please pick from the following funds");

        FundSelections fundSelections = new FundSelections();
        fundSelections.displayFunds();

        System.out.print("Enter fund number: ");
        int fundNumber = input.nextInt();

        System.out.print("Enter a percentage: ");
        int percentage = input.nextInt();

        fundSelections.setPercentage(fundNumber, percentage);
        fundSelections.displayFunds();


    }
}
