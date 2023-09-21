package TernaryNestedClass;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*Verilen sayi 100'den büyük ise sayinin karesini alip yazdirin
        * sayi 100'den kücükse "Sayi 100'den büyük olmali yazdirian bir ternary olusturun*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int sayi = input.nextInt();

        String sonuc = (sayi > 100) ? "Sayının karesi: " + (sayi * sayi) : "Sayı 100'den büyük olmalı";

        System.out.println(sonuc);








    }
}
