package com.works;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = scan.nextInt();
        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = scan.nextInt();
        System.out.print("3.Sayıyı giriniz = ");
        int sayi3 = scan.nextInt();

        if(sayi1 < sayi2){
            if(sayi2 < sayi3){
                System.out.println(String.format("%d < %d < %d ",sayi1,sayi2,sayi3));
            }else if(sayi3 < sayi1){
                System.out.println(String.format("%d < %d < %d ",sayi3,sayi1,sayi2));
            }else{
                System.out.println(String.format("%d < %d < %d ",sayi1,sayi3,sayi2));
            }
        }else{
            if(sayi1 < sayi3){
                System.out.println(String.format("%d < %d < %d ",sayi2,sayi1,sayi3));
            }else if(sayi3 < sayi2){
                System.out.println(String.format("%d < %d < %d ",sayi3,sayi2,sayi1));
            }else{
                System.out.println(String.format("%d < %d < %d ",sayi2,sayi3,sayi1));
            }
        }
    }
}
