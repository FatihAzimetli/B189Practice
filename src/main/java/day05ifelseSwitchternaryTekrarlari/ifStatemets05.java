package day05ifelseSwitchternaryTekrarlari;

import java.util.Scanner;

public class ifStatemets05 {
    public static void main(String[] args) {

        /*Kullanican 0'dan kücük 120 den büyük deget giremiyecek sekilde detaylari aldiktan sonra
         * Eger calisan kadin is
         * 60 yasindan büyük ise Emekli olabilir yazdirin
         * Eger calisan Erkek ise
         * 65 yasindan büyük ise "Emekli olabilir " yazdiran kodu olusturun*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        String cinsiyet = input.next();

        System.out.println("Lütfen yasinizi giriniz");
        byte yas = input.nextByte();

        if(yas<0 || yas>120 ){
            System.out.println("Lütfen gecerli bir yas giriniz");
        }else if (cinsiyet.equalsIgnoreCase("Kadin") || cinsiyet.equalsIgnoreCase("Bayan")){
            if(yas>60){
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Calismali..");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek") || cinsiyet.equalsIgnoreCase("Bay")) {
            if(yas>65){
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Calismali");
            }
        }else{
            System.out.println("Lütfen gecerli cinsiyet giriniz ...");
        }


    }
}
