package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class IfStatemens02 {
    public static void main(String[] args) {
        //Example : Kullanicidan alinan bir sayinin tekmi cift mi oldugunu yazdiran kodu yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Sayi cifttir");
        }if(num % 2 != 0){
            System.out.println("Sayi tektir");
        }


    }
}
