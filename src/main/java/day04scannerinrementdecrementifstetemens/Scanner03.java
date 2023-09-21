package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        /*
        * kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
        * alanini hesaplayiniz ===>kisa kenar*uzun kenar
        * cevresini hesaplayiniz ===> 2*kisa kenar+2* uzun kenar
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin Kisa kenar uzunlugunu giriniz");
         float shortSide = input.nextFloat();
        System.out.println("lütfen uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();
        System.out.println("Alan  :" + (shortSide * longSide) +" m2 'dir");
        System.out.println("Cevre  :" + (2*shortSide + 2*longSide) +" m 'dir");



    }

}
