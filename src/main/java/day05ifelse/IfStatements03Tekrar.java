package day05ifelse;

import java.util.Scanner;

public class IfStatements03Tekrar {
    public static void main(String[] args) {
        //kullanicidan yas evreleri alan ve ve yasin hangi evrede oldugunu
        //asagidaki tabloya göre yazan kodu olusturun
        /*
        * 0-4 bebek
        * 5-12 cocuk
        * 13-20 genc
        * 21-30 yetiski
        * 30 ustu tanimlanmamis
        * hata mesaji olarak "Gecerli bir yas giriniz" Yazdirin*/
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        byte num =input.nextByte();


        if(num<0){
            System.out.println("Gecerli bir rakam giriniz");
        } else if (num<5) {
            System.out.println("Bebek");
        } else if (num<13) {
            System.out.println("Cocuk");
        } else if (num<21) {
            System.out.println("Genc");
        } else if (num<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlammamis");
        }
    }
}
