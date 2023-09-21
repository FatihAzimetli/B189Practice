package Scanner;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        //Kullanicidan iki tam sayi alip bu sayilari Toplam, Fark ve Carpanlarini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen islem yapmak icin ilk sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int toplam = sayi1+sayi2;
        System.out.println("toplam = " + toplam);
        int cikarma = sayi1-sayi2;
        System.out.println("cikarma = " + cikarma);
        int carpim = sayi1*sayi2;
        System.out.println("carpim = " + carpim);

    }
}
