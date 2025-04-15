package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Input First number
        System.out.println("Enter the first number");
        double firstNumber;//leavs a CRLF next on the stream
        firstNumber = scanner.nextDouble();
        // also written as double firstNumber = scanner.nextDouble();

        //Input Second number
        System.out.println("Enter the second number");
        double secondNumber; //leaves a CRLF next on the stream
        secondNumber = scanner.nextDouble();
        // also written as double secondNumber = scanner.nextDouble();
        scanner.nextLine();
        //Do this to remove CRLF on stream to run string below

        //Choose Possible calculations
        System.out.println("Possible calculations:\n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\nPlease select an option:");
        String computation;
        computation = scanner.nextLine();


        double product = firstNumber * secondNumber;
        System.out.printf("The product of %f and %f is %f", firstNumber ,secondNumber, product);


    }
}