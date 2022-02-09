package com.codewithme;

public class Program24 {
    public static void main(String[] args) {
        // 24) Evaluate the following expression on paper and on program and understand the
//        difference
//        If int y = 10 then find int z = (++y * (y++ + 5));

        int y = 10; int z;
//        if (y == 10){
            z=  (++y * (y++ + 5));

            // 11 * ( 11 + 5 )
            //176
//        }
        System.out.println(z);

    }
}
