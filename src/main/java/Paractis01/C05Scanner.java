package Paractis01;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        /*
        * kullanicidan aldiginiz sayinin karesini bulunuz
        * not bir sayinin karesi kendisi ile carpimina esittir*/
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayi girin");
        int sayi = input.nextInt();
        System.out.println(sayi);
        System.out.println("Girdiginiz sayinin karesi :"+sayi*sayi + " 'dir");




    }
}
