package AlistirmaCalismalari;

import java.util.Scanner;

public class forloopC01 {
    public static void main(String[] args) {
       /*
        Soru 1) Ekrana 10 kez "Java guzeldir" yazdirin
        */
        for (int i = 0; i<10 ; i++) {
            System.out.println("Java güzeldir");
        }
        /*
    Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
    virgul olarak ayni satirda yazdirin
        */
        int bas = 10;
        int bitis =30;
        for (int j = bas; j <bitis ; j++) {
            if (j<bitis){
                System.out.print(j +", ");
            }else System.out.println(j);
        }
 /*
        soru 3) 0'dan 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
        */
        for (int k = 0; k < 100; k++) {
            if (k%2 ==0){
                System.out.print(k+", ");
            }
        }
        System.out.println("\n---------------");
        for (int k = 0; k < 100; k++) {
            if (k%2 !=0){
                System.out.print(k+", ");
            }
        }
         /*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen carpmak istediginiz sayiyi giriniz");
        int sayi = input.nextInt();
        for (int l = 0; l <=10 ; l++) {
            System.out.println(sayi+" X "+l+" = "+ sayi*l);
        }



    }
}
