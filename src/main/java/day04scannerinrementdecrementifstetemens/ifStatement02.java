package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class ifStatement02 {
    public static void main(String[] args) {
        /*
        * Kullanicidan alinan sayinin tekmi ciftmi oldugunu teyit ediniz*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();

        //1.yol
        if(num % 2 == 0){
            System.out.println("Cift sayi...");

        }
        if (num % 2 != 0) {
            System.out.println("Tek sayi...");

        }
        //ikinci yol.
        // if else statements

        if (num%2 == 0) {
            System.out.println("Cift sayi..");
        }else{
            System.out.println("tek sayi..");
        }//Javanin daha az calismasi icin en kisa olan yollar tercih edilmelidir
        //birinci yol uzundur bu nedenle daha az tercih edilmelidir.



    }
}
