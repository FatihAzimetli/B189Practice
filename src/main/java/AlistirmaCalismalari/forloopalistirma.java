package AlistirmaCalismalari;

import java.util.Scanner;

public class forloopalistirma {
    public static void main(String[] args) {
        /*
        Soru 1) Ekrana 10 kez "Java guzeldir" yazdirin
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("Java Güzeldir");

        }
        //Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
        //virgul olarak ayni satirda yazdirin

        int start = 10;
        int stop = 30;
        for (int k = start; k <stop ; k++) {
            if (k<stop) {
                System.out.print(k+" , ");
            }else System.out.println(k);
        }
        System.out.println();

        /*
        0'dan 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
         */

        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                System.out.print(i+ " , ");
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i%2 !=0){
                System.out.print(i+ " , ");
            }
        }

         /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi<100&&sayi>0) {
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i+ " ");
                }
            }
        }else System.out.println("Lütfen gecerli bir tam sayi giriniz");





    }
}
