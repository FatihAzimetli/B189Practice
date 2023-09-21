package day05Tekrari;

import java.util.Scanner;

public class RestorantDeneme {
    public static void main(String[] args) {
        //Restaurant yemeklerine göre masadan siparis edilebilen menü listesi olusturma

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen menü seciniz");
        String istek = input.next();

        boolean menuIcecek= istek.equalsIgnoreCase("Ayran") || istek.equalsIgnoreCase("Kola");
        boolean menuYemek = istek.equalsIgnoreCase("Yayla") || istek.equalsIgnoreCase("Ezogelin")
        ||istek.equalsIgnoreCase("Pizza") || istek.equalsIgnoreCase("Lahmacun")
                || istek.equalsIgnoreCase("Pide");


        if(menuIcecek){
            System.out.println("Icecek taleniz görüldü");
        } else if (menuYemek) {
            System.out.println("Yemek taleniz görüldü");
        }else{
            System.out.println("Yanlis bir menü sectiniz");
        }

        System.out.println("Lütfen siparis adedi giriniz");
        byte adet= input.nextByte();


        if (adet ==1){
            System.out.println("Bir adet siparis ettiniz");
        } else if (adet ==2) {
            System.out.println("Iki adet siparis ettiniz");
        }else {
            System.out.println("Yanlis giris yaptiniz Lütfe 1 vya 2 adet icin secim");
        }


    }
}
