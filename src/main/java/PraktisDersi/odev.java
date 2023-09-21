package PraktisDersi;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci dizisi kaç terim içersin? (47'den küçük olmalı): ");
        int n = scanner.nextInt();

        if (n >= 1 && n < 47) {
            System.out.println("Fibonacci dizisi (" + n + " terim):");
            printFibonacciSeries(n);
        } else {
            System.out.println("Geçersiz giriş. Lütfen 1 ile 46 arasında bir sayı girin.");
        }
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

    }
}
