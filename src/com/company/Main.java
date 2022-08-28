package com.company;

public class Main {

    public static void main(String[] args) {
        int A = 12;
        int B = 2;
        int C = 11;
        int RESULT = A;

        if (B>RESULT)
        {
            RESULT=B;
        }
        if(C>RESULT)
        {
            RESULT=C;
        }
        System.out.println(RESULT);
    }
}
