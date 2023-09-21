package day05ifelse;

import java.util.Scanner;

public class ifStatemenequel {
    public static void main(String[] args) {
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
