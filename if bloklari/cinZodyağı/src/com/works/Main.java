package com.works;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Soğrum yılınızı Giriniz : ");
        int year = scan.nextInt();
        if(year % 12 == 0){
            System.out.print("Maymun");
        }
        if(year % 12 == 1){
            System.out.print("Horoz");
        }
        if(year % 12 == 2){
            System.out.print("Köpek");
        }
        if(year % 12 == 3){
            System.out.print("Domuz");
        }
        if(year % 12 == 4){
            System.out.print("Fare");
        }
        if(year % 12 == 5){
            System.out.print("Öküz");
        }

    }
}
