package com.codewithme;

public class Program25 {
    public static void main(String[] args) {

//        25) Evaluate the following expression on paper and on program and understand the
//        difference
//        What is the value of x1 if x=5 ?
//                x1=++x – x++ + –x
      //          x1=++x – x++ + –x
        int x1, x =5;

        x1 = ++x - x++ + -x;
        //6 -  6 + -7
        System.out.println(x1);
    }
}
