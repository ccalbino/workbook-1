package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        // Question 1:
        System.out.println("1. Determine whose salary is greater using Math.max() and store the answer in highest Salary");
        double bobSalary = 70_000;
        double garySalary = 85_000;

        double highestSalary = Math.min(bobSalary, garySalary);

        System.out.println("The answer is" + " " + highestSalary);



        // Question 2:
        System.out.println("2. Find and display the smallest of two variables named carPrice and truckPrice");


        double carPrice = 53_000;
        double truckPrice = 73_000;

        double highest_Car_Price = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is" + " " + highest_Car_Price);


        //Question 3
        System.out.println("3. Find and display the area of a circle whose radius is 7.25 ");


        double radius = 7.25;
        double area = Math.pow(radius, 2) * Math.PI;

        System.out.println("The area is " + area);



        //Question 4
        System.out.println("4. Find and display the square root a variable after it is set to 5.0");


        double rootVariable = 5;

        System.out.println("The square root is " + Math.sqrt(rootVariable));


        //Question 5
        System.out.println("5. Find and display the distance between the points (5, 10) and (85, 50)");


        double x1 =5;
        double y1 =10;
        double x2 =85;
        double y2 =50;
        double distanceFormula = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println("The distance between points are " + distanceFormula);



        //Question 6
        System.out.println("6. Find and display the absolute (positive) value of a variable after it is set to -3.8");


        double var = -3.8;

        System.out.println("The absolute value is " + Math.abs(var));


        //Question 7
        //double randomNum;
        System.out.println("7. Find and display a random number between 0 and 1");



        System.out.println("The random number is " + Math.random());
// declare variables here
// then code solution

// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
    }
}
