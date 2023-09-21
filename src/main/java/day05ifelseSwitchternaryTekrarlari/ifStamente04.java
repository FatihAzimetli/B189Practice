package day05ifelseSwitchternaryTekrarlari;

import java.util.Scanner;

public class ifStamente04 {
    public static void main(String[] args) {
        //Kullanicinin vermis oldugu gün isimlerine bakarak hafta sonu veya hafta ici oldugunu karar veren kosu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Ögrenmek istediginiz gün adini giriniz");

        String günAdi = input.next();

        boolean haftaSonumu = günAdi.equalsIgnoreCase("Cumartesi") ||günAdi.equalsIgnoreCase("Pazar");
        boolean haftaIcimi =günAdi.equalsIgnoreCase("Pazartesi") || günAdi.equalsIgnoreCase("Sali")
                || günAdi.equalsIgnoreCase("Carsamba") || günAdi.equalsIgnoreCase("Persembe")
                || günAdi.equalsIgnoreCase("Cuma");

        if(haftaSonumu){
            System.out.println("Hafta sonu");
        } else if (haftaIcimi) {
            System.out.println("Hafta ici");
        }else{
            System.out.println("Geceli bir gün ismi giriniz");
        }

        // Aylara göre mevsimleri yazdiran kodu yazdirin

        System.out.println("Lütfen bir ay Adi giriniz");
        String ayAdi = input.next();

        boolean ilkBaharmi = ayAdi.equalsIgnoreCase("Ocak") || ayAdi.equalsIgnoreCase("Subat")
                || ayAdi.equalsIgnoreCase("Mart") ;
        boolean yazAyimi = ayAdi.equalsIgnoreCase("Nisan") || ayAdi.equalsIgnoreCase("Mayis")
                || ayAdi.equalsIgnoreCase("Haziran") ;
        boolean sonBaharmi =ayAdi.equalsIgnoreCase("Temmuz") || ayAdi.equalsIgnoreCase("Agustos")
                || ayAdi.equalsIgnoreCase("Eylül") ;
        boolean kisAyimi = ayAdi.equalsIgnoreCase("Ekim") || ayAdi.equalsIgnoreCase("Kasim")
                || ayAdi.equalsIgnoreCase("Aralik") ;

        if(ilkBaharmi){
            System.out.println("Ilk bahar ayi..");
        } else if (yazAyimi) {
            System.out.println("Yaz ayi");
        } else if (sonBaharmi) {
            System.out.println("Son Bahar ayi");
        } else if (kisAyimi) {
            System.out.println("Kisayi");
        }else{
            System.out.println("Lütfen gecerli bir ay adi giriniz");
        }

        // Beden büyüklügünü*15


    }
}
