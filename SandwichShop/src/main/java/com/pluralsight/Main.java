//package com.pluralsight;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        double regularPrice = 5.45;
//        double largePrice = 8.95;
//
//        //sandwich upsize option
//        double loadedRegular = 1;
//        double loadedLarge = 1.75;
//
//        //Intoduction
//
//        System.out.println("Hello, welcome to Bino's Sandwich Shop! What is your name?");
//        String name = scanner.nextLine();
//
//        //Prompt for the sandwich size
//
//        System.out.println("Hi " + name + ", please select the size sandwich you would like."
//                + "\n 1. for our regular size sandwich: Priced $5.45 "
//                + "\n 2. for our large size sandwich: Priced $8.95");
//        double sandwichSize = scanner.nextFloat();
//        scanner.nextLine();
//
//        double price;
//        if( sandwichSize == 1){
//            price = regularPrice;
//        }
//        else{
//            price = largePrice;
//        }
//
//        //Loaded Sandwich
//
//        System.out.println("Thanks " + name + ", for choosing number " + sandwichSize + "."
//                + "\n Would you like that sandwich to be loaded? "
//                + "\n The loaded option on a regular sandwich is an additional $1.00"
//                + "\n The loaded option on a large sandwich is an additional $1.75 "
//                + "\n Type Yes or No to continue");
//        String loadedChoice = scanner.nextLine();
//
//
//        if (loadedChoice.equalsIgnoreCase("Yes")) {
//            if (sandwichSize == 1) {
//                price += loadedRegular;
//            } else if (sandwichSize == 2) {
//                price += loadedLarge;
//  //          }else{
//                System.out.println("Unknown size selected. Please select right size. N");
//
//
////
//////          } else if (loadedChoice.equalsIgnoreCase("No")) {
//////            if (sandwichSize == 1) {
//////                price = regularPrice;
//////            } else if (sandwichSize == 2) {
//////                price = largePrice;
//////            }
////        }
//
//
//
//
////        if (loadedChoice.equalsIgnoreCase(("Yes"))) {
////            if (sandwichSize == 1) {
////                price = price + loadedRegular;
////               // price += loadedRegular;
////            } else if (sandwichSize == 2) {
////                price += loadedLarge;
////
////            }else price = regularPrice;
////           } else if (loadedChoice.equalsIgnoreCase(("No"))) {
////                price = regularPrice;
//
//
//        }
//
//
//        //Prompt for age
//        System.out.println("Thanks " + name + ", for choosing your sandwich size.\n We are proud to offer a youth discount or a senior discount.\n Enter your age to see if you apply! ");
//        double age = scanner.nextFloat();
//
//        //if statment for discount
//
//        //double regularPrice = 5.45;
//        //double largePrice = 8.95;
//
//
//        if (age <= 17 && sandwichSize == 1){
//            double totalPrice = ( regularPrice - (regularPrice/100 * 10));
//            System.out.println( name + ", you are eligible for the 10% youth discount.\n Your price is now " + totalPrice);
//
//        } else if (age <= 17 && sandwichSize == 2) {
//            double totalPrice = (largePrice - (regularPrice / 100 * 10));
//            System.out.println(name + ", you are eligible for the 10% youth discount.\n Your price is now " + totalPrice);
//
//
//        }else if (age >= 65 && sandwichSize == 1) {
//            double totalPrice = (regularPrice - (regularPrice / 100 * 20));
//            System.out.println(name + ", you are eligible for the 20% senior discount.\n Your price is now " + totalPrice);
//
//        } else if (age >= 65 && sandwichSize == 2) {
//            double totalPrice = (regularPrice - (regularPrice / 100 * 20));
//            System.out.println(name + ", you are eligible for the 20% senior discount.\n Your price is now " + totalPrice);
//
//        }
//
//        else if (age > 17 && age < 65 && sandwichSize == 1 ){
//
//            double totalPrice = regularPrice;
//            System.out.println( name + ", you are not eligible for any discount.\n Your price is " + totalPrice);
//
//        } else if (age > 17 && age < 65 && sandwichSize == 2) {
//
//            double totalPrice = largePrice;
//            System.out.println( name + ", you are not eligible for any discount.\n Your price is " + totalPrice);
//
//
//        }
//
////        else{
////
////            float overtimeHours = hoursWorked - 40;
////            double basePay = 40 * payRate;
////            double overtimeRate = payRate * 1.5;
////            double overtimePay = overtimeHours * overtimeRate;
////
////            grossPay = basePay + overtimePay;
////
//    }
//
//}

package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double regularPrice = 5.45;
        double largePrice = 8.95;

        // Sandwich upsize option
        double loadedRegularPrice = 1;
        double loadedLargePrice = 1.75;

        // Introduction
        System.out.println("Hello, welcome to Bino's Sandwich Shop! What is your name?");
        String name = scanner.nextLine();

        // Prompt for the sandwich size
        System.out.println("Hi " + name + ", please select the size sandwich you would like."
                + "\n 1. for our regular size sandwich: Priced $5.45 "
                + "\n 2. for our large size sandwich: Priced $8.95");
        double sandwichSize = scanner.nextFloat();
        scanner.nextLine();

        double price;
        if (sandwichSize == 1) {
            price = regularPrice;
        } else {
            price = largePrice;
        }

        // Loaded Sandwich Option
        System.out.println("Thanks " + name + ", for choosing number " + sandwichSize + "."
                + "\nWould you like that sandwich to be loaded? "
                + "\nThe loaded option on a regular sandwich is an additional $1.00"
                + "\nThe loaded option on a large sandwich is an additional $1.75"
                + "\nType Yes or No to continue");
        String loadedChoice = scanner.nextLine();

        // price if customer chooses loaded option
        if (loadedChoice.equalsIgnoreCase("Yes")) {
            if (sandwichSize == 1) {
                price = regularPrice + loadedRegularPrice;
            } else if (sandwichSize == 2) {
                price = largePrice + loadedLargePrice;
            }
        } else if (loadedChoice.equalsIgnoreCase("No")) {
            if (sandwichSize == 1) {
                price = regularPrice;
            } else if (sandwichSize == 2) {
                price = largePrice;
            }
        }

        // Prompt for discount eligibility
        System.out.println("Thanks " + name + ", for choosing your sandwich size." +
                "\nWe are proud to offer a youth discount or a senior discount."+
                "\nEnter your age to see if you apply!");
        double age = scanner.nextFloat();

        // discount percentage
        double discountPercentage = 0;
\
        if (age <= 17) {
            discountPercentage = 10;
        } else if (age >= 65) {
            discountPercentage = 20;
        }

        // final total price calculations
        if (discountPercentage > 0) {
            double totalPrice = price - (price * (discountPercentage / 100.0));
            System.out.println("Yay! " + name + ", you are eligible for a " + discountPercentage + "% discount." +
                    "\nYour price is now " + totalPrice);
        } else {
            // No discount applied
            System.out.println("Sorry, " + name + ", you are not eligible for any discount." +
                    "\nYour price is " + price);
        }
    }
}