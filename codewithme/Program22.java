package com.codewithme;

public class Program22 {
    public static void main(String[] args) {
    //  22) Evaluate the following expression on paper and on program and understand the difference
     //   a+=a++ + ++a + –a + a–; when a=28

        int a =28;
        a+= a++ + ++a + -a + a;
        //(28  +28) + 30 + (-30 + 30) = 56 + 30 + 0 = 86
        System.out.println(a);
    }
}
