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
        String name = input.nextLine();

        System.out.println("Please enter your employee id:");
        int employeeId = input.nextInt();

        System.out.println("How much would you like to invest per pay period? ");
        String amount = input.next();

        System.out.println("N: " + name);
        System.out.println("E: " + employeeId);
        System.out.println("N: " + amount);

        Employee employee = new Employee(name, employeeId, new BigDecimal(amount));
    }
}
