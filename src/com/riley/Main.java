package com.riley;

import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) {
        StringTokenizer stp1,stp2;
        String quote1 = "GOOG 604.43 -0.42";
        stp1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + stp1.nextToken());
        System.out.println("Token 2:" + stp1.nextToken());
        System.out.println("Token 3:" + stp1.nextToken());


        String quote2 = "GOOG 604.43 -0.42";
        stp2 = new StringTokenizer(quote2);
        System.out.println("\nToken 1: " + stp2.nextToken());
        System.out.println("Token 2:" + stp2.nextToken());
        System.out.println("Token 3:" + stp2.nextToken());
    }
}
