package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double basicCarRental = 29.99;
        double eTagToll = 3.95;
        double GPSPrice = 2.95;
        double roadsidePrice = 3.95;
        double underageSurcharge = .3;
        double option = 0;
        double surcharge = 0;



        //Into

        System.out.println("Hello! Welcome to Bino's Rental Paradise." +
                "\n I will assist you with your pricing needs." +
                "\n I will now ask you a series of questions to determine your ideal price." +
                "\n What is your name?");
        String name = scanner.nextLine();

        //Pick up date

        System.out.println("Hi " + name + ", What day do you want to pick up your vehicle."
                + "\n Please enter as (MM/DD/YYYY)."
                + "\n Reminder: We are closed on Sundays, except for car drop-offs");
        String pickupDays = scanner.nextLine();

        //How many days do you need the rental

        System.out.println("Next step " + name + "!"
                + "\n How many days would you like to rent the vehicle for? "
                + "\n Reminder: If car is not returned before 5pm, you will be charged another full day.");
        double rentalDays = scanner.nextFloat();
        scanner.nextLine();



        System.out.println("Do you want to add an e-toll tag for $3.95 / day?"
                + "\n Answer Yes / No ");
        String eTag = scanner.nextLine();



        System.out.println("Do you want to add an GPS for $2.95 / day?" +
                "Answer Yes / No ");
        String GPS = scanner.nextLine();



        System.out.println("Do you want to add an roadside assistance for $3.95 / day?" +
                "Answer Yes / No ");
        String roadsideAssistance = scanner.nextLine();

        System.out.println("How old are you");
        int age = scanner.nextInt();

        //If statment to add surcharge for age
        if (age < 25){
            surcharge = basicCarRental * underageSurcharge;
            System.out.println("Underage surcharge added.");

        }

        if (eTag.equalsIgnoreCase("yes")){
            option += eTagToll * rentalDays;


        }
        if (GPS.equalsIgnoreCase("yes")){
            option += GPSPrice * rentalDays;

        }
        if (roadsideAssistance.equalsIgnoreCase("yes")){
            option += roadsidePrice * rentalDays;
        }


        double total = option + basicCarRental + surcharge ;
        System.out.println("Your total price is " + total);

        //surcharge
















    }
}