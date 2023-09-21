package day05Tekrari;

import java.util.Scanner;

public class ifStatemens02x {
    public static void main(String[] args) {

        /*
        * gün sayisi verdigimizde gün ismini yazan kodu yazin
        * 1==> Pazar  2==> pazartesi*/

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        byte num = input.nextByte();



        if(num==1){
            System.out.println("Pazar");
        } else if (num==2) {
            System.out.println("Pazartesi");
        } else if (num==3) {
            System.out.println("Sali");
        } else if (num==4) {
            System.out.println("Carsamba");
        } else if (num==5) {
            System.out.println("Persembe");
        } else if (num==6) {
            System.out.println("Cuma");
        } else if (num==7) {
            System.out.println("Cuma ertesi");
        }else{
            System.out.println("Lütfen gecerli bir gün ismi giriniz...");
        }


    }
}
