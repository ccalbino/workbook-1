package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentalPrice = 29.99;
        double youngDriver = .3;
        double etagPrice = 3.95;
        double GPSPrice = 2.95;
        double roadsidePrice = 3.95;
        double totalCost;
        double ageCost;



        System.out.println("what day do you want to pick up MM/dd/YYYY");
        String pickupDate = scanner.nextLine();

        //# of days for rental

        System.out.println("How many days do u want to rent");
        double rentalDays = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("do you want an e-toll tag for an extra 3.95/day. Yes/No ");
        String etag = scanner.nextLine();

        System.out.println("Do you want GPS for an extra $2.95/day: Yes/No");
        String GPS = scanner.nextLine();

        System.out.println("Do you want roadside assistance for an extra 3.95/day: Yes/No");
        String roadSide = scanner.nextLine();

        System.out.println("How old are you");
        double age = scanner.nextFloat();


        System.out.printf("The basic car rental is %f", rentalPrice);




        if (etag.equalsIgnoreCase("yes")) {
            double etagCost = etagPrice * rentalDays;
            System.out.println("Your total etag cost will be " + etagCost);


            if (GPS.equalsIgnoreCase("yes")) {
                double gpsCost = GPSPrice * rentalDays;
                System.out.println("Your total GPS cost will be " + gpsCost);

                if (roadSide.equalsIgnoreCase("yes")) {
                    double roadSideCost = roadsidePrice * rentalDays;
                    System.out.println("Your total roadside assistance cost will be " + roadSideCost);

                    if (age < 25){
                        ageCost = (rentalPrice * youngDriver) + rentalPrice;
                    }else {
                        ageCost = rentalPrice;
                    }


                    totalCost = etagCost + gpsCost + roadSideCost + ageCost;
                    System.out.println("your total cost is: " + totalCost);

                }

            }
        }

    }
}
