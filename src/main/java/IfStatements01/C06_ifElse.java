package IfStatements01;

import java.util.Scanner;

public class C06_ifElse {
    //Kullanicidan 100 üzerinden sayi isteyin 20'den kücükse a 40 kücükse b 60 den kücse d 80 kücükse e 100 küc f cevirin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");


        Integer sayi = input.nextInt();

        if (sayi<21){
            System.out.println("a");
        } else if (sayi<41) {
            System.out.println("b");
        } else if (sayi<61) {
            System.out.println("c");
        } else if (sayi<81) {
            System.out.println("d");
        } else if (sayi<101) {
            System.out.println("e");
        } else {
            System.out.println("Lütfen tam sayi giriniz");
        }


    }





}
