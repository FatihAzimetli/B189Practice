package PraktisDersi;

import java.util.Scanner;

public class C10AyyakabiKontrol {
    public static void main(String[] args) {
        //ayakkabi boyutu kontrol eden program yaziniz
        //35'den- 50'ye kadar numaralari kullanarak small, medyum, large, exra large icin dagitim yapin
        // small = 35, 36, 37, 38

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ayakkabi numaranizi giriniz");
        int ayakkabiNumarasi = input.nextInt();


        String boyut = "";

            if (ayakkabiNumarasi >= 35 && ayakkabiNumarasi <= 38) {
                boyut = "Small";
            } else if (ayakkabiNumarasi >= 39 && ayakkabiNumarasi <= 42) {
                boyut = "Medyum";
            } else if (ayakkabiNumarasi >= 43 && ayakkabiNumarasi <= 46) {
                boyut = "Large";
            } else if (ayakkabiNumarasi >= 47 && ayakkabiNumarasi <= 50) {
                boyut = "Exra Large";
            } else {
                boyut = "Gecersiz";
            }
        System.out.println("boyut = " + boyut);


    }

}
