package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        /*
        * Kullanicidan alacaginiz 5 basamakli sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdirin
        * örnek 45678 ===> 45+ 78 ===> 123 gibi*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bes basamakli bir sayi giriniz");
        int fiveNumber = input.nextInt();
        int fistTwo = fiveNumber/1000; //bu sayi 1000 bölününce son 3 rakami sileriz
        int lastTwo = fiveNumber%100; //sayinin 100'e bölümünden kalani alan bir özel durum yani son iki rakam (Modulus operatör) macjilis
        System.out.println(fistTwo+lastTwo);

    }
}
