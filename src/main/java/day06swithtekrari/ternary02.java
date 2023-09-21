package day06swithtekrari;

public class ternary02 {
    //verilen bir sayinin 3 basamakli olup olmadigini kontrol eden kodu yazdirin

    public static void main(String[] args) {

        int a = -313;

       a= Math.abs(a);


        String result = (a>99 && a<1000) ? "Üc basmaklidir" : "Üc basamakli degildir";
        System.out.println("result = " + result);


        //verilen bir sayinin negatif veya pozitif olup olmadigini kontrol eden kodu yazdirin

        int b= -25;

        String result1 = (b<0 ) ? "Sayi negatiftir" : "Sayi pozitiftir";
        System.out.println("result1 = " + result1);


        //interview question
        /*    Example : Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */
        int yil= 2005;
        String yilTesbiti = yil%100==0? yil%400==0 ?"TamYil": "Artik yildir" : yil%4==0 ? "TamYil":"ArtikYil";
        System.out.println("yilTesbiti = " + yilTesbiti);


    }




}
