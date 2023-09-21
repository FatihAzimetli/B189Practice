package TekrarC01_ifElse;

import java.util.Scanner;

public class ifElsetekrarlarinTekrarlari {
    public static void main(String[] args) {

/*
Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
Sesli harfler: a,e,i,o,u
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String harf = input.next().toLowerCase();
        harf = harf.replaceAll("[^a-zA-Z]","*");
        boolean sesliHarfMi = harf.equals("a") || harf.equals("e")
                || harf.equals("i") || harf.equals("o") || harf.equals("u");

        if(harf.contains("*") || harf.length()!=1){
            System.out.println("Lütfen gecerli bir harf giriniz");
        } else if (sesliHarfMi) {
            System.out.println("sesli harf");
        }else{
            System.out.println("sessiz harf");
        }



    }
}
