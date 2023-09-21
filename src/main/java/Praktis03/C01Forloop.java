package Praktis03;

import java.util.Scanner;

public class C01Forloop {
    public static void main(String[] args) {

/*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = input.next();
//Char(index) metodu kelimeleri tek tek getirir
        //merhaba
        int sayac =0;
        for (int i = 0; i <kelime.length() ; i++) {
            if(kelime.charAt(i)=='C'){
                break;
            } else if (kelime.charAt(i)=='a') {
                sayac++;
            }

        }
        System.out.println("Ilk c harfine kadar olan a harflerinin sayisi : "+sayac);







    }
}
