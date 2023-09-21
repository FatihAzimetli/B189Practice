package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class elseIf01tekrar {
    public static void main(String[] args) {
        //Kullanicin verdigi bir sayinin cift, tek veya nötür , pozitif ve negatif oldugunu belirten kodu yazin
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();
        
        
        if(num%2 ==0){
            System.out.println(" Cift sayi ....");

                

        }else{
            System.out.println("Tek sayi sayi");
        }
        
        
        
        
        
    }
}
