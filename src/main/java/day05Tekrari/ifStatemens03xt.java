package day05Tekrari;

import java.util.Scanner;

public class ifStatemens03xt {
    public static void main(String[] args) {
        /*Kullanicidan yas degerini alan ve ve yasin hangi evrede oldugunu
        * asagidaki tabloya göre yazdiran kodu olusturun
        * 0-4 bebek
        * 5-12 cocuk
        * 13-20 genc
        * 21-30 yetiskin
        * 31-45 orta yas
        * 46-60 emekli adaylari
        * 61-100 emekli tayfa
        * 100-160 süper yaslilar*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yas giriniz");
        short num= input.nextShort();






        if(num<0){
            System.out.println("Gecersiz sayi girdiniz Lütfen 0 ile 160 arasi yasinizi giriniz");
        } else if (num<5) {
            System.out.println("Bebek");
        } else if (num<13) {
            System.out.println("Cocuk");
        } else if (num<21) {
            System.out.println("Genc");
        } else if (num<31) {
            System.out.println("Yetiskin");
        } else if (num<46) {
            System.out.println("Orta yas");
        } else if (num<61) {
            System.out.println("Emekli adayi");
        } else if (num<100) {
            System.out.println("Emekli tayfa");
        } else if (num<161) {
            System.out.println("Süpermen yaslilar");
        }else{
            System.out.println("Tanimlanamamis yas grubu");
        }


    }
}
