package WrapleClassVeTypeCasting;

import java.util.Scanner;

public class C03_TypeCasting {
    public static void main(String[] args) {
        //Kullanicidan bir karakter ve aldiginiz karakterin sayisal degerini yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Sayisal degerini ögrenmek istediginiz kalekteri lütfen giriniz");

        char kalakter = input.next().charAt(0);
        int sayisalDeger = (int) kalakter;
        System.out.println("Girdiginiz Karekter" + kalakter);
        System.out.println("Kalekterin sayisal degeri"+ sayisalDeger);

        input.close();


    }



}
