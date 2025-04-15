package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Ask name

        System.out.println("Hello! What is your name?");
        String name;
        name = scanner.nextLine();

        //Ask hours worked

        System.out.println("Hi " + name + ", how many hours did you work this week?");
        double hoursWorked;
        hoursWorked = scanner.nextDouble();

        System.out.println("Enter your pay rate");
        double payRate;
        payRate = scanner.nextDouble();


        double product = hoursWorked * payRate;
        System.out.printf( name + " worked %f hours and made %f per hour to gross %f per week", hoursWorked ,payRate, product);




    }
}