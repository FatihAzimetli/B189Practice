package Day04ScannerIncrementDecrementIfstatamentsTk;

import java.util.Scanner;

public class Scanner02 {
    /*
     * Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yazdirin*/
    //Carpma, bölme,cikarma, toplama

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int carpim = sayi1*sayi2;
        int toplam = sayi1+sayi2;
        float bolme = toplam/2;
        int cikarma = sayi1-sayi2;

        System.out.println("Iki sayinin Carpimi : "+ carpim+ "\nIkisayinin Cikarma sonucu : "+cikarma+
                "\nIki sayinin Toplami : "+toplam+ "\nIki Sayinin Ortalama bölümü : "+ bolme);



    }
}
