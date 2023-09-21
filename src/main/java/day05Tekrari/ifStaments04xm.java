package day05Tekrari;

import java.util.Scanner;

public class ifStaments04xm {
    public static void main(String[] args) {
        /*
        * Kullanicinin vermis oldugu gün isimlerne bakarak Hafta sonu veya Hafta ici olduguna karar veren kodu yazin
        * Pazartesi ,....Cuma==> calisma günleri
          cuma, cts, pzr Dini ibadet günleri
          * cts, Pazar tatil günleri*/
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir Gün ismi giriniz");
        String gunAdi = input.next();
        boolean haftaIci = gunAdi.equalsIgnoreCase("Pazartesi") || gunAdi.equalsIgnoreCase("Sali")
                || gunAdi.equalsIgnoreCase("Carsamba") || gunAdi.equalsIgnoreCase("Persembe")
                || gunAdi.equalsIgnoreCase("Cuma");
        boolean haftaSonu = gunAdi.equalsIgnoreCase("Cuma ertesi") || gunAdi.equalsIgnoreCase("Pazar");


        if(haftaIci){
            System.out.println("Hafta ici");
        } else if (haftaSonu) {
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Lütfen gecerli bir gün ismi giriniz");
        }


    }


}

