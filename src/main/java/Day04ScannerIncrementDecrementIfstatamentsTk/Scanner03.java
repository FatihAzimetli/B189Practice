package Day04ScannerIncrementDecrementIfstatamentsTk;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        /*
         * kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz
         * alanini hesaplayiniz ===>kisa kenar*uzun kenar
         * cevresini hesaplayiniz ===> 2*kisa kenar+2* uzun kenar
         * */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Dikdörtgenin alan hesabi ve Cevre uzunlugu icin iki sayi giriniz");

        double uzunluk1 = input.nextDouble();
        double uzunluk2 = input.nextDouble();

        double alanHesabi = uzunluk1*uzunluk2;
        double cevreHesabi = 2*uzunluk1+uzunluk2*2;

        System.out.println("Dikdörtgenin Alani : "+ alanHesabi+ "\nDikdörgenin Cevresi :" +cevreHesabi);





    }
}
