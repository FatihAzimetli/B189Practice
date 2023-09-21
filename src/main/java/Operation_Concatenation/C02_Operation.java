package Operation_Concatenation;

import java.util.Scanner;

public class C02_Operation {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin ve bunlara assigment operation islemleri yapiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        sayi1 += sayi2;

        System.out.println("Assagment ile toplama  = "+ (sayi1));

        sayi1 -= sayi2;
        System.out.println("Assagment ile Cikarma = " +(sayi1));

        sayi1  /= sayi2;
        System.out.println("Assigment ile bölme = "+ (sayi1));
        sayi1  %= sayi2;
        System.out.println("Assigment ile bölme = "+ (sayi1));

        sayi1 *= sayi2;
        System.out.println("Assigment ile carpma ="+ (sayi1));

        sayi2 += sayi1;

        System.out.println("Assagment ile toplama  = "+ (sayi2));

        sayi2 -= sayi1;
        System.out.println("Assagment ile Cikarma = " +(sayi2));

        sayi2  /= sayi1;
        System.out.println("Assigment ile bölme = "+ (sayi2));

        sayi2  %= sayi1;
        System.out.println("Assigment ile bölme = "+ (sayi2));

        sayi2 *= sayi1;
        System.out.println("Assigment ile carpma ="+ (sayi2));


    }

}
