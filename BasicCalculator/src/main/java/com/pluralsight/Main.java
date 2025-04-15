package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Input First number
        System.out.println("Enter the first number");
        double firstNumber;
        firstNumber = scanner.nextDouble();

        //Input Second number
        System.out.println("Enter the second number");
        double secondNumber;
        secondNumber = scanner.nextDouble();
        scanner.nextLine();

        //Choose Possible calculations
        System.out.println("Possible calculations:\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\nPlease select an option:");
        //use 'printf' with escape sequence?
        String computation;
        computation = scanner.nextLine();


        double product = firstNumber * secondNumber;
        System.out.printf("The produt of %f and %f is %f", firstNumber ,secondNumber, product);


    }
}