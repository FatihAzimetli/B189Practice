package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class Scanner02 {
    public static void main (String[] args) {
        /*
        * Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yazdirin*/
        //Carpma, bölme,cikarma, toplama

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz......");
        double fistNumber = input.nextDouble();
        double secontNumber = input.nextDouble();
        System.out.println("Toplama =" + (fistNumber+secontNumber));
        System.out.println("Cikarma =" + (fistNumber-secontNumber));
        System.out.println("Bölme =" + (fistNumber/secontNumber));
        System.out.println("Carpma =" + (fistNumber*secontNumber));


    }
}
