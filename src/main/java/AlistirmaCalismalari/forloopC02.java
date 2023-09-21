package AlistirmaCalismalari;

import java.util.Scanner;

public class forloopC02 {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100'den kücük bir tam sayi giriniz");

        int sayi = input.nextInt();

        if (sayi>0 && sayi<=100) {
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i+" ");
                }
            }
        }

    }

}
