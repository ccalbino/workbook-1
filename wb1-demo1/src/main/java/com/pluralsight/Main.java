package com.pluralsight;

public class Main {


    public static void main(String[] args) {

        String word1 ="Hello"; //semi// -colon is like period

        String word2 = "World"; //"world" is expressed as a literal value

        String greeting; //define greeting but no literal value

        greeting = word1 + " " + word2 + "!";
        //we assign greeting an expression. word1 value + space + word2 value + !
        //concatenation is operators using PEMDAS signs


        float taxRate = 0.15f;

        long aLargeNumber = 222222L;

        //

        int aint;

        long blong;

        aint =7;

        blong = aint;

        //

        long aLong;
        int bint;

        aLong = 777777l;
        bint = (int) aLong;
        //This is type Casting. We tell the "long" we want it to read as an int


        double degrees = 90.0;

        double answer = Math.sin(degrees);






        System.out.println(answer);
    }
}