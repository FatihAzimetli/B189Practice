package day05ifelse;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*
        * kullanicidan zas degerii alan ve zasin hangi evrede oldugunu asagidaki tabloza g;re zaydiran kodu olusturun
        * 0-4 bebk
        * 5-12 cocuk
        * 13-20 genc
        * 21-30 yetiskin
        * 30 üstü ====> tamamlanamamis
        * hata mesji icin "Gecerli bir yas giriniz" yazdirin*/

       Scanner input = new Scanner(System.in);
        System.out.println("Yas araligini giriniz");
        int age = input.nextInt();

        if(age<0){
            System.out.println("Gecerli bir yas Giriniz");
        } else if (age<5) {
            System.out.println("Cocuk");
        } else if (age<13) {
            System.out.println("Cocuk");
        } else if (age<21) {
            System.out.println("Genc");
        } else if (age<31) {
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas girdiniz");
        }

    }

    }

