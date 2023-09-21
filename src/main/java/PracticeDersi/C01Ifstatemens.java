package PracticeDersi;

import java.util.Scanner;

public class C01Ifstatemens {
    public static void main(String[] args) {

//kullanicidan iki sayi isteyin sayilarin ikiside pozitif ise sayilarin toplamini yazdirin
        //ikiside negatif ise sayilarin carpimini yazdirin
        // sayilar farkli isaretlere sahipse bu sayilarla islem yapilmasin
        // sayilardan sifira esit olan varsa 0 carpmaya göre yutan eleman yazdirin

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        if(input.hasNextInt()){
            int sayi1= input.nextInt();

            System.out.println("Lütfen Ikinci sayiyi giriniz");
            if (input.hasNextInt()){
                int sayi2 = input.nextInt();

                if (sayi1>0 && sayi2 >0){
                    System.out.println("Sayilarin toplami ="+ (sayi1+sayi2));
                } else if (sayi1<0&&sayi2<0) {
                    System.out.println("Farkli isaretli Sayilarin carpimi :"+ (sayi1*sayi2));
                }else {
                    System.out.println("Sayılar farklı işaretlere sahip veya sıfır var.");
                }


            }else {
                System.out.println("Lütfen geçerli bir ikinci sayı girin.");
            }


        }else{
            System.out.println("Lütfen geçerli bir birinci sayı girin.");
        }






    }

}
