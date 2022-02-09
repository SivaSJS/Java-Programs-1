package com.codewithme;


public class Main1to11 {

    public static void main(String[] args) {

//1)  Write a program to print the mobile number using primitive datatypes.
//            Input : 9876543210

        long mobileNumber = 9876543210L;
        System.out.println(mobileNumber);

        //    2) Write a program to print numbers from 1 -10. Use appropriate datatype for the
//    variables.

        for (byte i = 1; i < 11; i++) {
            System.out.println(i);
        }


        //3) Write a program to check if the following numbers are the same or different?
        //    Input: 6, 6L
        System.out.println(6 == 6L ? "same" : "different");

        //            4) Write a program to check the following numbers are the same or different?
//    Input: 6.02f, 6.02d

        System.out.println(6.02F == 6.02D ? "same" : "different");


        //   5) Write a program to print the value of byteNumber of the following statements.
        short shortNumber = 130;
        byte byteNumber = (byte) shortNumber;
        System.out.println(byteNumber);


        // 6) Write a program to print the value of intNumber of the following statements.
        float floatNumber = 150.9F;
        int intNumber = (int) floatNumber;
        System.out.println(intNumber);

//        7) Write a program to print the value of number7 of the following statements.
//        char character7 = '7';
//        int number7 = (int) character7;


        char character7 = '7';
        int number7 = (int) character7;
        System.out.println(number7);


//        8) Write a program to print the value of character55 of the following statements.
//        int number55 = 55;
//        char character55 = (char) number55;


        int number55 = 55;
        char character55 = (char) number55;
        System.out.println(character55);


//        9) Evaluate the following statements on paper and on program and understand the
//    difference
//    public static void main(String arg[]) {
//        System.out.println(7+7);
//        System.out.println(7+7.0);
//        System.out.println(7+'7');
        System.out.println(7 + 7);
        System.out.println(7 + 7.0);
        System.out.println(7 + '7');

//        10) Evaluate the following statements on paper and on program and understand the
//        difference
//        System.out.println(true);
//        System.out.println(false);
//        System.out.println(true&true);
//        System.out.println(true&false);

        System.out.println(true);
        System.out.println(false);
        System.out.println(true & true);
        System.out.println(true & false);

//        11) Write a program to print the number 7.50 without using String.

        float num = 7.50F;
        System.out.printf("%.02f" , num);


    }


}