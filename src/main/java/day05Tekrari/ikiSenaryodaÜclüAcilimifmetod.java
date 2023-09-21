package day05Tekrari;

import java.util.Scanner;

public class ikiSenaryodaÜclüAcilimifmetod {
    public static void main(String[] args) {

        /*kullanicinin c
         * bebek, cocok
         * yas
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen gün adi giriniz");
        String gunler = input.next();


        if(gunler.equalsIgnoreCase("Pazartesi")){
            System.out.println(1);
        } else if (gunler.equalsIgnoreCase("Sali")) {
            System.out.println(2);
        }else if (gunler.equalsIgnoreCase("carsamba")) {
            System.out.println(3);
        }else if (gunler.equalsIgnoreCase("persembe")) {
            System.out.println(4);
        }else if (gunler.equalsIgnoreCase("cuma")) {
            System.out.println(5);
        }else if (gunler.equalsIgnoreCase("cumartesi")) {
            System.out.println(6);
        }else if (gunler.equalsIgnoreCase("pazar")) {
            System.out.println(7);
        }else{
            System.out.println("Gecerli gün ismi giriniz");
        }

        System.out.println("Lütfen gün sira numarasi giriniz");
        byte dayNuma = input.nextByte();

        if(dayNuma == 1){
            System.out.println("Pazartesi");
        } else if (dayNuma ==2) {
            System.out.println("Sali");
        }else if (dayNuma ==3) {
            System.out.println("Carsamba");
        }else if (dayNuma ==4) {
            System.out.println("Persembe");
        }else if (dayNuma ==5) {
            System.out.println("cuma");
        }else if (dayNuma ==6) {
            System.out.println("cumartesi");
        }else if (dayNuma ==7) {
            System.out.println("Pazar");
        }else{
            System.out.println("Lütfen gecerli bir numara giriniz");
        }


        System.out.println("Bir gün adi giriniz");

        switch (gunler.toLowerCase()){
            case "pazartesi" :
                System.out.println(1);
                break;
            case "sali" :
                System.out.println(2);
                break;
            case  "carsamba" :
                System.out.println(3);
                break;
            case "persembe" :
                System.out.println(4);
                break;
            case "cuma" :
                System.out.println(5);
                break;
            case "cumartesi" :
                System.out.println(6);
                break;
            case "pazar" :
                System.out.println(7);
                break;
            default:
                System.out.println("Lüfengecerli bir gün ismi girin");
        }


    }
}

















