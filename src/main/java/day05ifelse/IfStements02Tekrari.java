package day05ifelse;

import java.util.Scanner;

public class IfStements02Tekrari {
    public static void main(String[] args) {
        //bir kullanicidan alinan sayinin tekmi ciftmi oldugunu gösteren kodu olusturunuz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();

        //birinci yol

        if (num % 2== 0){
            System.out.println("Cift sayi..");
        }
        if (num % 2 != 0) {
            System.out.println("Tek sayi..");
        }
        //Ikinci yol (if else statemens ) else aksi takdirde demek
        if (num % 2 == 0 ){
            System.out.println("Cift");

        }else{
            System.out.println("Tek");
        }











    }
}
