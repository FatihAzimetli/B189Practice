package day05ifelse;

import java.util.Scanner;

public class IfStatements02Tekrar {
    public static void main(String[] args) {
        //gün sayisi verdiginizde gün ismini yazan kodu yaziniz
        // 1==> Pazar 2==>pazartesi 3==> Sali ............

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen gün sayisini giriniz");
        byte num = input.nextByte();

        if(num == 1){
            System.out.println("Pazar");
        } else if (num == 2) {
            System.out.println("Pazartesi");
        } else if (num==3) {
            System.out.println("Sali");
        } else if (num ==4) {
            System.out.println("Carsamba");
        } else if (num ==5) {
            System.out.println("Persembe");
        } else if (num ==6) {
            System.out.println("Cuma");
        } else if (num ==7) {
            System.out.println("Cumartesi");
        }else{
            System.out.println("Hatali giris yaptiniz..Lütfen 1 ile 7 arasinda bir rakam giriniz");
        }


    }
}
