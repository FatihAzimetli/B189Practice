package Switch_ssg;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {
       // toplama, çıkarma, bölme, çarpma ve kalan hesaplaması yapan bir hesap makinesi

        Scanner input = new Scanner(System.in);

        System.out.println("Hesap Makinesine Hosgeldiniz");
        System.out.println("Toplama yapmak icin 1 seciniz");
        System.out.println("Cikarma yapmak icin 2 seciniz");
        System.out.println("Carpma yapmak icin 3 seciniz");
        System.out.println("Bölme yapmak icin 4 seciniz");
        System.out.println("Kalan hesaplamak icin 5 seciniz");
        System.out.println("Yapmak istediginiz islem icin 1 ile 5 arasinda secim yapiniz");


        int secim = input.nextInt();


        double sayi1, sayi2, sonuc;


        switch (secim){
            case 1 :
                System.out.println("Toplama islemi icin ilk sayiyi giriniz");
                sayi1 = input.nextDouble();
                System.out.println("Toplama islemi icin ikinci sayiyi giriniz");
                sayi2 = input.nextDouble();
                sonuc = sayi1+sayi2;
                System.out.println("sonuc = " + sonuc);
                break;
            case 2:
                System.out.println("Cikarma islemi icin ilk sayiyi giriniz");
                sayi1 = input.nextDouble();
                System.out.println("Cikarma islemi icin ikinci sayiyi giriniz");
                sayi2 = input.nextDouble();
                sonuc = sayi1-sayi2;
                System.out.println("sonuc = " + sonuc);
                break;
            case 3:
                System.out.println("Carpma islemi icin ilk sayiyi giriniz");
                sayi1 = input.nextDouble();
                System.out.println("Carpma islemi icin ikinci sayiyi giriniz");
                sayi2 = input.nextDouble();
                sonuc = sayi1*sayi2;
                System.out.println("sonuc = " + sonuc);
                break;
            case 4:
                System.out.println("Bölme islemi icin ilk sayiyi giriniz");
                sayi1 = input.nextDouble();
                System.out.println("Bölme islemi icin ikinci sayiyi giriniz");
                sayi2 = input.nextDouble();

               if (sayi2 != 0){
                   sonuc = sayi1/sayi2;
                   System.out.println("sonuc = " + sonuc);
               }else {
                   System.out.println("Sifira bölme hatasi");
               }
               break;
            case 5 :
                System.out.println("Kalan hesaplamak icin ilk sayiyi giriniz");
                sayi1 = input.nextDouble();
                System.out.println("Kalan hesaplamak icin ikinci sayi giriniz");
                sayi2 = input.nextDouble();

                if (sayi2 != 0){
                    sonuc = sayi1 % sayi2;
                    System.out.println("sonuc = " + sonuc);
                }else {
                    System.out.println("Sifira bölme hatasi");
                }
                break;
            default:
                System.out.println("Gecesiz islem secimi !");

        }








    }
}
