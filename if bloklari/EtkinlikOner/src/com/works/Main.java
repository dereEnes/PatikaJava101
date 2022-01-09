package com.works;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz(Celsius).");
        int derece = scan.nextInt();
        if(derece <= 5){
            System.out.println("Kayak yapabilirsiniz");
        }else if(derece <=15){
            System.out.println("Sinemaya gidebilirsiniz");
        }else if(derece <=25){
            System.out.println("Piknik yapabilirsiniz.");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
