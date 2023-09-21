package PraktisDersi;

import java.util.Scanner;

public class C011AyakkabiSwich {
    public static void main(String[] args) {
        //ayakkabi boyutu kontrol eden program yaziniz
        //35'den- 50'ye kadar numaralari kullanarak small, medyum, large, exra large icin dagitim yapin
        // small = 35, 36, 37, 38
        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen bir ayakkabi numarasi giriniz");
        int ayakkabiNumarasi = input.nextInt();

        String  boyut= "";

        switch (ayakkabiNumarasi){
            case 35:
            case 36:
            case 37:
            case 38:
                boyut ="Small";
                break;
            case 39:
            case 40:
            case 41:
            case 42:
                boyut ="Medyum";
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                boyut ="large";
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                boyut ="Exra Large";
                break;
            default:
                boyut = "Gecersiz";
        }
        if (!boyut.equals("Gecersiz")){
            System.out.println("Ayakkabi boyutu = " + boyut);
        }else {
            System.out.println("Gecersiz ayakkabi boyutu girdiniz");
        }






    }
}
