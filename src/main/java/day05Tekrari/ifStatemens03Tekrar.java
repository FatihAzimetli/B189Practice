package day05Tekrari;

import java.util.Scanner;

public class ifStatemens03Tekrar {
    public static void main(String[] args) {

        //KULLANICIDAN YAS DEGERI ALAN VE YAS DEGERINE GÖRE ASAGIDAKI TABLOYU YAZDIRIN



        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir rakam giriniz");
        byte num=input.nextByte();

        if (num<0){
            System.out.println("Hatali yas girdiniz");
        } else if (num<5) {
            System.out.println("Bebek");
        } else if (num<13) {
            System.out.println("Cocuk");
        } else if (num<21) {
            System.out.println("Genc");
        } else if (num<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis");
        }
        //Kullanicinin verdigi anapara ile 1 aylik, 3 aylik, 6 aylik, 12 aylik faiz verme ile anapara artisini gösteren tabloyu ciziniz.

    }




}
