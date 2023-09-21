package Praktis;

public class Practis01 {
    public static void main(String[] args) {

        // (Int) bir veriable (yas) olustur ve yasdir

        // (int) bir veriable (sayi) olustur ve yazdir
        //Konsola sayi = 50 seklinde yazdir
        // yeni bir veriable olustur (BenimYasim) ve yas veriablele'nin degerini benimYasim veriablesini kopyala
        //String bir veriable olusturalim
        //Isim veriable etiketi ile yazdir
        // onunIsmi verable'i olustur ve ismin variable'nin degerini onunIsmi variable'ina kopyala
        // onunIsmi variable'nin etiketi ile yazdir
        // isim variablenin degerini güncelle
        // isim ve onunIsmi variable'larini yazdir


        // (Int) bir veriable (yas) olustur ve yasdir
        // Syntax
        // Data turu + variable ismi  + atama operatörü  + veriable degeri +  ;
         int              yas             =                    50             ;
        System.out.println(yas);


        // yeni bir veriable olustur (BenimYasim) ve yas veriablele'nin degerini benimYasim veriablesini kopyala
        // Syntax
        // Data turu + variable ismi  + atama operatörü  + veriable degeri +  ;
        int sayi = 51 ;
        System.out.println(sayi);
        System.out.println("sayi = " + sayi);

        // yeni bir veriable olustur (BenimYasim) ve yas veriablele'nin degerini benimYasim veriablesini kopyala

        int benimYasim =  yas ;
        System.out.println("benimYasim = " + benimYasim);

        //String bir veriable olusturalim
        String isim = "Ali Can ";
        //Isim veriable etiketi ile yazdir
        System.out.println("isim = " + isim);

        // onunIsmi verable'i olustur ve ismin variable'nin degerini onunIsmi variable'ina kopyala

        String onunIsmi = isim ;

        // onunIsmi variable'nin etiketi ile yazdir
        System.out.println("onunIsmi = " + onunIsmi);

        // isim variablenin degerini güncelle

        isim = "Ali Can Yurtsever" ;

        System.out.println("isim = " + isim);

        // isim ve onunIsmi variable'larini yazdir
        System.out.println("onunIsmi = " + onunIsmi);

        onunIsmi = isim;

        System.out.println("onunIsmi = " + onunIsmi);


    }//mein metod sonu
}//class sonu
