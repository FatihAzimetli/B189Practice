package day05ifelseSwitchternaryTekrarlari;

import java.util.Scanner;

public class ifStament01 {
    public static void main(String[] args) {
        // verilen bir sayinin pozif, negetif vey nötür oldugunu kontrol eden kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int sayi = input.nextInt();

        if(sayi>0){
            System.out.println("Sayi pozitifdir");
        } else if (sayi<0) {
            System.out.println("Sayi degeri negatif");

        } else if (sayi ==0) {
            System.out.println("Sayi nötürdür");
        }

        // SAYININ TEK CIT YADA SONSUZ OLDUGUNU

        if (sayi%2==sayi){
            System.out.println("Sayi sonsuzdur");
        } else if (sayi%2==0) {
            System.out.println("Sayi ciftir");
        }else {
            System.out.println("Sayi tektir");
        }


    }
}
