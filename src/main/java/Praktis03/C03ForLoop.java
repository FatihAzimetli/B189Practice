package Praktis03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {

          /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz");
        int satirSayisi = input.nextInt();

        for (int i = 0; i < satirSayisi; i++) { //satir yazdirma
            for (int j = 0; j <= i; j++) {//* yazdirma islemi icin
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
