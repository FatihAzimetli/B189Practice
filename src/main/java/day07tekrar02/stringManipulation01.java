package day07tekrar02;

import java.util.Scanner;

public class stringManipulation01 {
    public static void main(String[] args) {
         /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                         i)En az 8 character olsun
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwod'unuzu giriniz");

        String pwd = input.nextLine();

        //i)En az 8 character olsun

       boolean uzunlukKontrol = pwd.length()>7;
        System.out.println("uzunlukKontrol = " + uzunlukKontrol);

        //i)En az 8 character olsun
        boolean boslukKontrol = ! pwd.contains(" ");
        System.out.println("boslukKontrol = " + boslukKontrol);

       // iii)En az bir tane buyuk harf olsun

         boolean büyükHarfKontrolu = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("büyükHarfKontrolu = " + büyükHarfKontrolu);

        //iv)En az bir tane kucuk harf olsun

        boolean kucukHarfKontrolü = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("kucukHarfKontrolü = " + kucukHarfKontrolü);

        //v)En az bir tane rakam olsun
        boolean birTaneRakamOlsun = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("birTaneRakamOlsun = " + birTaneRakamOlsun);

        //birtane özel karakter
       boolean ozelKarekterOlsun = pwd.replaceAll("\\P{Punct}","").length()>0;

        System.out.println("ozelKarekterOlsun = " + ozelKarekterOlsun);

        boolean passwordGecerlimi = uzunlukKontrol && boslukKontrol && büyükHarfKontrolu && kucukHarfKontrolü && birTaneRakamOlsun &&ozelKarekterOlsun;

        if(passwordGecerlimi){
            System.out.println("Pasword Gecerlidir");
        }else System.out.println("Passwordünüz gecersizdir lütfen yeniden giris yapiniz"); {}


    }
}
