package com.works;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------Leap Year Calculation--------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir yıl giriniz:");
        int year = scan.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " artık yıldır.");
            } else
                System.out.println(year + " artık yıl değildir.");
        } else if (year % 4 == 0) {
            System.out.println(year + " artık yıldır.");
        } else
            System.out.println(year + " artık yıl değildir.");
    }
}
