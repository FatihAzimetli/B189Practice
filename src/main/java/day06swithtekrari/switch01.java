package day06swithtekrari;

import java.util.Scanner;

public class switch01 {

    //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
    //           yazdiran kodu yaziniz.
    //           8 ==> August - September - October - November - December
    //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
    //           yazdiran kodu yaziniz.
    //           8 ==> August - September - October - November - December

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ögrenmek istediginiz gün numarsini giriniz");
        int günAdi = input.nextInt();

        switch (günAdi){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen gecerli bir gün numarasi girinit");
                 /*
        Note: switch condition parantezine 1) String, 2)int 3)byte 4) short 5) char kullanabiliriz
              switch condition parantezine 1) long 2)boolean 3) float 4) double kullanilmaz.
         */

                //Gün adini girerek gün numarasi alma
                System.out.println();

                System.out.println("Ögrenmek istediginiz gün adini girin");

                String günNumarasi = input.next();

                switch (günNumarasi.toLowerCase()){
                    case "Pazartesi" :
                        System.out.println(1);
                        break;
                    case "Sali" :
                        System.out.println(2);
                        break;
                    case "Carsamba" :
                        System.out.println(3);
                        break;
                    case "Persembe" :
                        System.out.println(4);
                        break;
                    case "Cuma" :
                        System.out.println(5);
                        break;
                    case "Cumartesi":
                        System.out.println(6);
                        break;
                    case "Pazar" :
                        System.out.println(7);
                        break;
                    default:
                        System.out.println("Lütfen gecerli bir gün numarasi giriniz");
                }
        }
    }
}
