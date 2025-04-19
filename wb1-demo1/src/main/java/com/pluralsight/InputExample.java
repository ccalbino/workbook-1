package com.pluralsight;


//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class InputExample {
//
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name;
//        name = scanner.nextLine();
//
//        System.out.println("Hi " + name + " lets do some math!" );
//
//
//        System.out.println("What is the first number?");
//
//        System.out.println("What is the second number?");
//
//
//
//        double number1 = scanner.nextDouble();
//
//        double number2 = scanner.nextDouble();
//
//
//        double product = number1 * number2;
//
//       // System.out.printf("The produt of %f and %f is %f", number1, product);
//
//
//    }
//
//}

public class SkillsBuilding {
    public static void main(String[] args) {
        // create a StringBuillder object
        StringBuilder skills = new StringBuilder();
        // append strings to the StringBuilder object
        skills.append("Git, ");
        skills.append("HTML, ");
        skills.append("CSS, ");
        skills.append("and Bootstrap\n");
        skills.append("JavaScript, ");
        skills.append("ES6, ");
        skills.append("jQuery, ");
        skills.append("REST APIs, ");
        skills.append("and Express\n");
        skills.append("Angular\n");
        skills.append("Java\n");
        // retrieve the underlying characters from
        // the StringBuilder
        String mySkills = skills.toString();
        System.out.println(mySkills);
    }
}