package PraktisDersi;

import java.util.Scanner;

public class C09HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir islem sembolü swciniz (+, -, *, /, %)");
        char islem = input.next().charAt(0);

        System.out.println("Lütfen ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lütfen ikici sayiyi giriniz");
        double sayi2 = input.nextDouble();

        double sonuc = 0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası");
                    return;
                }
                break;
            case '%':
                if (sayi2 != 0) {
                    sonuc = sayi1 % sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem sembolü");
                return;
        }
        System.out.println("Sonuç = " + sonuc);

    }
}
