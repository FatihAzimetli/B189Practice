package day09tekrari;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        /*
        Bir CNC makinasi yetkili kullanici tesbiti yapilmasi istendiginde ve 15 saniye süre verildiginde
        ilgili kodu olusturma
        */
        Scanner input = new Scanner(System.in);

        int counter = 0; //Deneme sayaci
        long startTime= System.currentTimeMillis();//zaman sayaci



        do {
            if(counter ==2){
                System.out.println("Hesabiniz bloke olmustur..");
                break;
        } else if (System.currentTimeMillis()-startTime>15000) {
                System.out.println("Süre asildi islem sonlandirildi");
                break;
            }
            System.out.println("Kullanici adini giriniz");
            String kullaniciAdi = input.next();

            System.out.println("Kullanici sifrenizi giriniz");
            String sifre = input.next();
            if (kullaniciAdi.equals("admin") && sifre.equals("pwd123")){
                System.out.println("Lütfen Takim kontrollerini gerceklestirin");
                break;
            }
              counter++;



        }while (true); //


















    }
}
