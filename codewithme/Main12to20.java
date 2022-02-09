package com.codewithme;

import java.util.Scanner;

public class Main12to20 {
    public static void main(String[] args) {

//           on operators

//        12) area of square

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = scanner.nextInt();
        int area = value * value;
        System.out.println("Area of Square " + area);

//        13) area of rectangle

        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        int rectangle = length * width;
        System.out.println("Area of rectangle " + rectangle);


//        14) area of cylinder

        System.out.print("Enter the value: ");
        int radius = scanner.nextInt();
        float pi = 3.14F;
        int height = scanner.nextInt();
        int cyX = (int) ((2 * pi) * (radius * height));
        int cyY = (int) ((2 * pi) * (radius * radius));
        System.out.println("area of cylinder is: " + (cyX + cyY));


//       16) area of radius between circle program

        System.out.println("enter the area: ");
        int x = scanner.nextInt();
        System.out.println("enter the second value: ");
        int y = scanner.nextInt();
        // Calculate area of outer circle
        double arX = pi * x * x;

        // Calculate area of inner circle
        double arY = pi * y * y;

        // Difference in areas
        System.out.println("final value is " + (arX - arY));

//    17) Write aA program with Unary operators

//     unary plus
        byte unaryPlus = 10;
        System.out.println(unaryPlus);
        byte unaryMinus = -10;
        System.out.println(unaryMinus);
        unaryPlus++;  // post increment
        System.out.println(unaryPlus);
        ++unaryPlus; // pre increment
        System.out.println(unaryPlus);
        --unaryPlus;  //pre decrement
        System.out.println(unaryPlus);
        unaryPlus--;  //post decrement
        System.out.println(unaryPlus);


//        18) Write aA program with Ternary Operator

        System.out.println(6 == 6.01 ? "Your answer is correct" : "your answer is wrong");

//        19) Write aA program with bitwise operators

        // Initial values
        byte bitA = 5;
        byte bitB = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("aA&bB = " + (bitA & bitB));

        // bitwise or
        // 0101 |
        // 0111
        // 0111 =>  7
        System.out.println("aA|bB = " + (bitA | bitB));

        // bitwise xor
        //    0101 ^
        //    0111
        // => 0010 =>  2
        System.out.println("aA^bB = " + (bitA ^ bitB));

        // bitwise not
        // ~0101
        // =1010
        // =>
        // will give 2's complement of 1010 = -6
        System.out.println("~aA = " + ~bitA);


//    20) Write aA program to find the difference between prefix and postfix operator

        int c = 0;
        int d = 1;
        if (++c == d-- && --c == d++) {
            System.out.println("value of aA is " + c);
            System.out.println("value of aA is " + d);
        } else {
            System.out.println("The statement is wrong");
        }


//


//

    }
}
