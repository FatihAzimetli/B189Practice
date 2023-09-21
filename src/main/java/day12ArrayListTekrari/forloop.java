package day12ArrayListTekrari;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        /*
        Soru 1) Ekrana 10 kez "Java guzeldir" yazdirin
        */
        for (int i = 0; i <10 ; i++) {
            System.out.println("Java güzeldir");
        }

        /*
    Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
    virgul olarak ayni satirda yazdirin
        */
        int bas = 10;
        int bitis =30;
        for (int i = bas; i <=bitis; i++) {
            if (i<bitis){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }

         /*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        int sayi = 7;

        for (int i = 1; i <11; i++) {
            System.out.println(sayi+ "X" + i + "=" + sayi*i);
        }

          /*
        Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100'den kücük bir tam sayi giriniz");

        int say= input.nextInt();
        if (sayi>0&&sayi<=100) {
            for (int i = 1; i <= sayi&&sayi<100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else System.out.println("lutfen gecerli bir tamsayi gir");




    }





}


