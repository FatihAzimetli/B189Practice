package TekrarC01_ifElse;

import java.util.Scanner;

public class forLoop04 {
    public static void main(String[] args) {

// Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");

        int sayi= scan.nextInt();//baslangıc degeri

        while ( sayi%10!=0 ){//sayı 10un katı oldugu anda loop bitecek, yani 10un katı olmadıgı muddetce calısacak

            System.out.print(sayi+" ");

            sayi++;
        }











    }
}
