package Operation_Concatenation;

import java.util.Scanner;

public class C01_Operation {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyiniz ve bu sayilara arikmetik operatiyon yapiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();

        //Toplama islemi
        double ikiSayiToplami = sayi1+sayi2;
        System.out.println("ikiSayiToplami = " + ikiSayiToplami);


        //Cikarma islemi
        double ikiSayiCikarma = sayi1-sayi2;
        System.out.println("ikiSayiCikarma = " + ikiSayiCikarma);

        //Carpma islemi
        double ikiSayiCarpma = sayi1*sayi2;
        System.out.println("ikiSayiCarpma = " + ikiSayiCarpma);

        //Bölme islemi
        double ikiSayiBölümü = sayi1/sayi2;
        System.out.println("ikiSayiBölümü = " + ikiSayiBölümü);


    }
}
