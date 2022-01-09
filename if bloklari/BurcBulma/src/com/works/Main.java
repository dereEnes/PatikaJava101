package com.works;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaçıncı ayda doğdunuz? : ");
        int month = scan.nextInt();
        System.out.print("Kaçıncı günde doğdunuz? : ");
        int day = scan.nextInt();

        if(month == 1){
            if (day <= 21){
                System.out.println("Oğlak");
            }else{
                System.out.println("Kova");
            }
        }else if(month == 2){
            if (day <= 19){
                System.out.println("Kova");
            }else{
                System.out.println("Balık");
            }
        }else if(month == 3){
            if (day <= 20){
                System.out.println("balık");
            }else{
                System.out.println("Koç");
            }
        }

    }
}
