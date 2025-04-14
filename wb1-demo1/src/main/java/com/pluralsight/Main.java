package com.pluralsight;

public class Main {


    public static void main(String[] args) {

        String word1 ="Hello"; //semi// -colon is like period

        String word2 = "World"; //"world" is expressed as a literal value

        String greeting; //define greeting but no literal value

        greeting = word1 + " " + word2 + "!";
        //we assign greeting an expression. word1 value + space + word2 value + !
        //concatenation is operators using PEMDAS signs



        System.out.println(greeting);
    }
}