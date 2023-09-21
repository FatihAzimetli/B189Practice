package Praktis;

import java.util.Scanner;

public class C05Scanner01 {
    /*
     * kullanicidan aldiginiz sayinin karesini bulunuz
     * not bir sayinin karesi kendisi ile carpimina esittir*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Karesini bulmak istediginiz sayiyi lütfen girinz");

        float sayi = input.nextFloat();

        System.out.println("Girdiginiz sayinin karesi  ="+sayi*sayi+" olarak bulunmustur");

    }
}
