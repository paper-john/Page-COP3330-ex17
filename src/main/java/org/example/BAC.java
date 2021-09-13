package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class BAC
{
    public static void main( String[] args )
    {
        //declare variables
        Scanner input = new Scanner(System.in);
        int total, weight, hours, gender;
        float ratio;
        double bac;

        //get inputs from user
        System.out.print("Enter a 1 if you are male or 2 if you are female: ");
        gender = input.nextInt();

        System.out.print("How many ounces of alcohol did you have?" );
        total = input.nextInt();

        System.out.print("What is your weight, in pounds? ");
        weight = input.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        hours = input.nextInt();

        //Calculate BAC
        if (gender == 1)
        {
            ratio = (float)0.73;
        }
        else
        {
            ratio = (float)0.66;
        }
        bac = (total * 5.14 / weight * ratio) - (.015 * hours);
        System.out.println("\n" + "Your BAC is " +String.format("%.6f", bac));

        //Calculates if your BAC is above the legal limit
        if (bac<0.08)
        {
            System.out.println("It is legal for you to drive.");
        }
        else
        {
            System.out.println("It is not legal for you to drive.");
        }
    }
}
