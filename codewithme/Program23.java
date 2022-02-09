package com.codewithme;

public class Program23 {
    public static void main(String[] args) {
        //   23) Evaluate the following expression on paper and on program and understand the
//        difference
//                x = x++ * 2 + 3 * –x;

        int x=1;

        x = x++ * 2 + 3 * -x;

        System.out.println(x);
    }
}
