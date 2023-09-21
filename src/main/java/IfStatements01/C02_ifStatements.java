package IfStatements01;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi isteyin ve tek yada cift oldugunu kontrol eden dogruluyan kodu yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi= input.nextInt();

        if(sayi%2==0){
            System.out.println("Sayi cifttir");
        }else{
            System.out.println("Sayi tektir");

        }
    }
}
