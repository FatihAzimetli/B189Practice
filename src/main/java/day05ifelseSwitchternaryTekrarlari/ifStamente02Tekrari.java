package day05ifelseSwitchternaryTekrarlari;

import java.util.Scanner;

public class ifStamente02Tekrari {
    public static void main(String[] args) {
        //Örnek :Gün sayisini verdidigimizde gün ismini yazan kodu yaziniz
        // 1 ==> Pazar , 2==> Pazartesi

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ögernmek istediginiz Gün icin Bir Rakam giriniz");

        byte rakam = input.nextByte();

        if(rakam ==1 ){
            System.out.println("Pazar");
        } else if (rakam==2) {
            System.out.println("Pazartesi");
        } else if (rakam ==3) {
            System.out.println("Sali");
        } else if (rakam==4) {
            System.out.println("Carsaba");
        } else if (rakam==5) {
            System.out.println("Persembe");
        } else if (rakam==6) {
            System.out.println("Cuma");
        } else if (rakam==7) {
            System.out.println("Cumartesi");
        }else {
            System.out.println("Lütfen 1 ile 7 arasinda bir rakam giriniz");
        }


    }
}
