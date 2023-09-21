package day06Swicternarystring;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int a = -313;

        a = Math.abs(a);
        String result = a > 99 && a < 1000 ? "uc basamaklidir" : "uc basamakli degildir";
        System.out.println(result);


        //interview question
        /*    Example : Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

        int year = 2005;
        String result2 = year % 100 == 0 ? year % 400 == 0 ? "Leap" : "Not Leap" : year % 4 == 0 ? "Leap" : "Not leap";
        System.out.println(result2);

        //verilen bir sayinin alti basamakli olup olmadigini kontrol edin.

        int b = - 234567;

        b = Math.abs(b);

        String result3 = b>9999 && b<999999 ? "bes basamaklidir" : "Bes basamakli degildir" ;
        System.out.println(result3);

        //bir sayiyi 10, 20, 30, a bölündügünde sonucun sifir  yada degil kontrol eden kodu yazin

        int Sayi = 140;

        String result4 = Sayi %10==0 ? Sayi%20 ==0? "1sonuc=0" : "2sonuc !=0" :
                Sayi%40==0? "3sonuc=0": "4sonuc !=0";
        System.out.println(result4);

        //bir sayi 200`'e bölünüyorsa 50 ye bölünmeli ayni sayi 200'e bölünüyorsa 40'a da bölünmeli

        int sayi5 = 300;

        String result5 = sayi5%100==0 ? sayi5%500==0? "Tam" : "Artik" : sayi5%5==0? "tam" :"artik";
        System.out.println(result5);

        //verlen bir sayinin negatif, pozitif yada nötür oldugunu gösteren kodu yazin

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi8 = input.nextInt();


        if (sayi8<0){
            System.out.println("Girilen sayi negatiftir");
        } else if (sayi8>0) {
            System.out.println("Girilen sayi pozitiftir");
        }else {
            System.out.println("Girilen sayi nötürdür");
        }


    }
}
