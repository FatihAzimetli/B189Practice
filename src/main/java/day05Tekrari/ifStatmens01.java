package day05Tekrari;

import java.util.Scanner;

public class ifStatmens01 {
    public static void main(String[] args) {

        //verilen bir sayinin pozitif vey negatif yada nötür oldugunu belirtiniz
        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();

        if(num>0 && num%2 ==0){
            System.out.println("Pozitif ve Cift sayi");
        } else if (num>0 && num%2 !=0) {
            System.out.println("Negatif ve Tek sayi");
        } else if (num<0 && num%2 ==0) {
            System.out.println("Negatif ve cift sayi");

        } else if (num<0 && num%2 !=0) {
            System.out.println("Negatif ve Teksayi");
        }else {
            System.out.println("Nötür bir sayi");
        }


    }



}
