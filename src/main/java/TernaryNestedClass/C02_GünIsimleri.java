package TernaryNestedClass;

import java.util.Scanner;

public class C02_GünIsimleri {
    public static void main(String[] args) {
       // kullanicidan alinan gün ismi ile hafta icim yada hafta sonumu oldugunu yazdiran kodu if else if ile yazdiran kodu yazdir
        Scanner input = new Scanner(System.in);

        System.out.print("Bir gün ismi girin: ");
        String gunIsmi = input.next(); // Küçük harfe çeviriyoruz

        boolean haftaIcimi = gunIsmi.equalsIgnoreCase("pazartesi")
                || gunIsmi.equalsIgnoreCase("salı")
                || gunIsmi.equalsIgnoreCase("çarşamba")
                || gunIsmi.equalsIgnoreCase("perşembe")
                || gunIsmi.equalsIgnoreCase("cuma");

        boolean haftaSonumu = gunIsmi.equalsIgnoreCase("cumartesi")
                || gunIsmi.equalsIgnoreCase("pazar");

        if (haftaIcimi) {
            System.out.println(gunIsmi + " bir hafta içi günüdür.");
        } else if (haftaSonumu) {
            System.out.println(gunIsmi + " bir hafta sonu günüdür.");
        } else {
            System.out.println("Geçersiz gün ismi girdiniz.");
        }


    }

}