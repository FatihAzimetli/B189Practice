package day05ifelse;

import java.util.Scanner;

public class IfStatemen02 {
    public static void main(String[] args) {
        /*
        * Gün sayisina verdiginizde gün ismini yazan kodu yaziniz
        * 1 ==>Pazar, 2==>Pazartesi, 3==>Sali, ........*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kacinci gün oldugunu giriniz");
        byte num = input.nextByte();
        if(num == 1){
            System.out.println("Sunday");
        }else if (num == 2){
            System.out.println("Monday");
        }else if (num == 3){
            System.out.println("Tuesday");
        }else if (num == 4){
            System.out.println("Wensday");
        }else if (num == 5){
            System.out.println("Trusday");
        }else if (num == 6){
            System.out.println("Friday");
        }else if (num == 7){
            System.out.println("Sturday");
        }else {
            System.out.println("Hatali gün sayisi girdiniz. Lütfen 1 ile 7 arasinda bir rakam giriniz");
        }

        //Türkce uygulama
        // Atölyedeki makinalara Üretim hatti boyunca sira numarasi atayin 1ila 35 arasinda
        System.out.println("Lütfen kacinci makina oldugunu giriniz");
        byte makinaNum = input.nextByte();
        if (makinaNum == 1) {
            System.out.println("makina1 :");

        } else if (makinaNum == 2) {
            System.out.println("Makina2");

        } else if (makinaNum == 3) {
            System.out.println("Makina3");


        }else {
            System.out.println("Hatali makina girdiniz");


            }


        }


    }

