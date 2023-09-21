package IfStatements01;

import java.util.Scanner;

public class C05_ifElse {
    //Kullanicidan bir sayi isteyin ve sayi tekmi ciftmi odugunu yazdiaran kodu yazdirin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lüutfen bir sayi giriniz");
        Integer sayi = input.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cifttir");
        } else if (sayi%2!=0) {
            System.out.println("Girilen Sayi tektir");
        }else {
            System.out.println("Hata! Lütfen düzgün bir sayi giriniz");
        }

    }
}
