package day05Tekrari;

import java.util.Scanner;

public class ifStatemens04Tekrar {
    public static void main(String[] args) {
        /*Kullanicinin vermis oldugu gün isimlerine bakarak hafta sonu veya hafta ici olduguna karar veren kodu yazin
        * monday ==> Week Day       Saturday==>weekend day*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi Giriniz");
        String dayName = input.next();

        boolean haftaSonu= dayName.equalsIgnoreCase("Pazar") || dayName.equalsIgnoreCase("Cumartesi");
        boolean haftaIci = dayName.equalsIgnoreCase("Pazartesi") || dayName.equalsIgnoreCase("Sali")
                || dayName.equalsIgnoreCase("Carsamba") || dayName.equalsIgnoreCase("Persembe")
                || dayName.equalsIgnoreCase("Cuma");
        if(haftaSonu){
            System.out.println("Hafta Sonu");
        } else if (haftaIci) {
            System.out.println("Hafta Ici");
        }else{
            System.out.println("Lütfen gecerli bir Gün adi griniz");

            // Türkiyenin bölgelerine göre sehir adlarinin bulunmasi
            Scanner scan = new Scanner(System.in);


            System.out.println("Lütfen bir sehir adi girin");
            String sehirAdi= scan.next();

            boolean karadeniz = sehirAdi.equalsIgnoreCase("Trabzon") || sehirAdi.equalsIgnoreCase("Samsun")
                    || sehirAdi.equalsIgnoreCase("Ordu") || sehirAdi.equalsIgnoreCase("Gümüshane");
            boolean akDeniz = sehirAdi.equalsIgnoreCase("Hatay") || sehirAdi.equalsIgnoreCase("Antalya");
            boolean marmaraBolgesi = sehirAdi.equalsIgnoreCase("Istanbul") || sehirAdi.equalsIgnoreCase("Yalova");
            boolean icAnadolu = sehirAdi.equalsIgnoreCase("Ankara") || sehirAdi.equalsIgnoreCase("Sivas");
            if (karadeniz){
                System.out.println("Karadeniz Bölgesi");
            } else if (akDeniz) {
                System.out.println("Ak Deniz Bölgesi");
            } else if (marmaraBolgesi) {
                System.out.println("Marmara Bölgesi");
            } else if (icAnadolu) {
                System.out.println("Ic Anadolu Bölgesi");
            }else{
                System.out.println("Lütfen gecerli bir ad giriniz..");
            }


        }
    }
}
