package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Ask name

        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();

        //Ask hours worked

        System.out.println("Hi " + name + ", how many hours did you work this week?");
        float hoursWorked;
        hoursWorked = scanner.nextFloat();


        // Ask Payrate
        System.out.println("Enter your pay rate");
        double payRate;
        payRate = scanner.nextDouble();

        //If statment for OT



        double grossPay; //= hoursWorked * payRate;

        if (hoursWorked <= 40){
            grossPay = hoursWorked * payRate;
        }
        else{

            float overtimeHours = hoursWorked - 40;
            double basePay = 40 * payRate;
            double overtimeRate = payRate * 1.5;
            double overtimePay = overtimeHours * overtimeRate;

            grossPay = basePay + overtimePay;
        }



        System.out.printf( name + " worked %f hours and made %f per hour to gross %f per week", hoursWorked ,payRate, grossPay);

        //If statement for ot





        /*
        double totalPay;
        double payRate;

        if (hoursWorked > 40) {
            double payRate = 40 * hoursWorked;
            double overTime = (hoursWorked - 40) + (payRate * 1.5);

            totalPay = normalPay + overTime;
            System.out.printf( name + " worked %f hours and made %f per hour to gross %f per week", hoursWorked ,payRate, totalPay);




            if (hoursWorked > 40) {
                double otRate = (hoursWorked - 40) * (payRate * 1.5);
                System.out.printf( name + " worked %f hours and made %f per hour to gross %f per week", hoursWorked ,payRate, otRate);

            }



//
//        } else {
//           double totalPay = double hoursWorked * double payRate; */

    // }




    }
}