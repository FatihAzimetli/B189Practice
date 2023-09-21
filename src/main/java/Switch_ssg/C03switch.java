package Switch_ssg;

import java.util.Scanner;

public class C03switch {
    public static void main(String[] args) {
        // kullanicidan bir 1-12 arasi rakam alip rakam alip mevsimleri olusturan kodu yazin
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir ay numarasi girin (1 ile 12 arasi)");
        int ay= input.nextInt();

        String mevsim = "";

        if (ay>=1 && ay <=12){
            switch (ay){
                case 12 :
                case 1:
                case 2:

                    mevsim = "Kis";
                    break;
                case 3:
                case 4:
                case 5:
                    mevsim = "Ilkbahar";
                    break;
                case 6 :
                case 7 :
                case 8 :
                    mevsim = "Yaz";
                    break;
                case 9 :
                case 10 :
                case 11 :
                    mevsim = "Sonbahar";
                    break;
            }
            System.out.println("Girdiginiz sayi "+ mevsim + "mevsimine denk geliyor");


        }else {
            System.out.println("Hata! gecersiz ay numarasi");
        }




    }


}
