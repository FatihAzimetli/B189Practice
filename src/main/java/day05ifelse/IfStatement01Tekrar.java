package day05ifelse;

import java.util.Scanner;

public class IfStatement01Tekrar {
    public static void main(String[] args) {
        //verilen bir sayinin pozitif vey negativ oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();

        if (num> 0) {
            System.out.println("Pozitif..");
        } else if (num<0) {
            System.out.println("Negatif");
        }else {
            System.out.println("Nötür");
        }

    }
}
