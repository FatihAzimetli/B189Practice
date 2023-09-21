package AlistirmaCalismalari;

import java.util.Scanner;

public class forloop04 {
    public static void main(String[] args) {
        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve
        // girilen sayinin carpanlarini bulun

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 0'dan büyük 10'dan kücük bir tam sayi giriniz");

        int sayi = input.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(sayi + " X " +i+ " = " + sayi*i);
            System.out.println();
            System.out.println(sayi + " / " +i+ " = " + sayi%i);
        }

    }
}
