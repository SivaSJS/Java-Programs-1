package com.codewithme;

public class Program21 {
    public static void main(String[] args) {


//        21) Evaluate the following expression on paper and on program and understand the
//        difference
//        i) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2

        int a = 1;
        int b  = 2;
        int x = 3;

       System.out.println("++a-b- " + (++a-b)); // (1+1) - 2 = 0
       System.out.println("+a%b++ " + (a&b++)); // 000 bits for a -- 001 bits for b => value is 0
       System.out.println("+a*=b+5 " + (a*=b+5)); // a = a *b + 5 => 7
       System.out.println("+x=69>>>2- " + (x=69>>>2));


    }
}
