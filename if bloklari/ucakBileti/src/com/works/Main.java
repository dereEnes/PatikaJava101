package com.works;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Totalprice = 0.0d,yasIndirimOrani = 0.0d;
        System.out.print("Mesafeyi giriniz(km) = ");
        double km = scan.nextDouble();

        System.out.print("Yaşınızı giriniz = ");
        double age = scan.nextDouble();

        System.out.print("sadece gidiş için(1),gidiş-geliş için(2) = ");
        byte tip = scan.nextByte();

        if(tip != 1 && tip !=2){
            System.out.print("Hatalı veri girdiniz!");
            return;
        }

        if (age < 12){
            yasIndirimOrani = 0.5;
        }else if(age >= 12 && age <= 24){
            yasIndirimOrani = 0.1;
        }else{
            yasIndirimOrani = 0.3;
        }
        double yolTutari = 0.10 * km;
        double yasIndirimi = yolTutari * yasIndirimOrani;
        double indirimliTutar = yolTutari - yasIndirimi;

        if(tip == 2){
            indirimliTutar *= 0.8;
        }
        System.out.println("Ödenecek miktar = "+indirimliTutar);

    }
}
