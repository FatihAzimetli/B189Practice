package day05Tekrari;

import java.util.Scanner;

public class ifStatementx1 {
    public static void main(String[] args) {
        //Bir sayinin pozitif, negatif veya nötür oldugunu belirten kodu yazin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        short num = input.nextShort();


        if(num>0){
            System.out.println("Pozitif sayi");
        } else if (num<0) {
            System.out.println("Negatif sayi");

        }else{
            System.out.println("Nötür");
        }


    }
}
