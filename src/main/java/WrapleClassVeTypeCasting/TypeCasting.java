package WrapleClassVeTypeCasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//Kullanicidan aldiginiz bir sayinin ASCII degerini yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        char karekter = input.next().charAt(0);
        int ASCIIdegeri = (int) karekter;

        System.out.println("ASCIIdegeri = " + ASCIIdegeri);
        System.out.println((char) ASCIIdegeri);


//Kullanicidan aldiginiz bir sayinin ASCII sembol yazdirin
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();
        char sembol =(char) sayi;
        System.out.println("sembol = " + sembol);
        System.out.println((char) sembol);
        System.out.println();
        char sayi1 = (char) input.nextInt();
        System.out.println("sayi1 = " + sayi1);

        input.close();

    }
}
