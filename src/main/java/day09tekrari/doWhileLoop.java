package day09tekrari;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {

        /*5 (dahil) den 3 (dahil) e kadar tam sayilari consola yazdirin*/

        int i=5;
        do{
            System.out.print(i);
            i--;

        }while (i>2);
        //while loop
        int a = 1;
        while (a<1){
            System.out.println("Sen bir while loop'sun .....");
        }
        System.out.println();
        //do-while-loop
        int b= 1;
        do{
            System.out.println("Sen bir do while loopsun .....");
            b++;
        }while (b<1);
        System.out.println();
        //kullanicidan bir tam sayi aliniz.
        //sayi 100 ile 225 ve 415 ile 617 disinda ise kaybettiniz mesaji veiniz
        //sayi 100 ile 225  ve 415 ile 617 arsi ise Kazanmak icin tekrar sayi gir mesaji veriniz.
        //sayi 56, 316 ve 725 girince kazandiniz yazdirin


        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayi giriniz");
            int num = input.nextInt();
            if ((num>=100 && num <=226) || (num>=415 && num<=618)){
                System.out.println("Kazanmak icin tekrar sayi giriniz ! ..");
            } else if (num==56 || num==316 || num==725) {
                System.out.println("Kazandiniz");
                break;
            } else{
                System.out.println("Kaybettiniz !!..");
                break;
            }
        }while (true);
        System.out.println();








    }
}
