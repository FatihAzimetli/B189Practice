package day05ifelse;

import java.util.Scanner;

public class ifStatemts01 {
    public static void main(String[] args) {
        /*
        * verilen bir sayinin pozitiv, negatif, veya notr oldugunu kontrol ediniz*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz...");
        int num = input.nextInt();

        if (num>0) {
            System.out.println("Pozitiv ....");
        }else if(num<0){
            System.out.println("Negativ....");
        }else {
            System.out.println("Notr..");
        }



    }
}
