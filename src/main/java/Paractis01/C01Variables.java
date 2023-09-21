package Paractis01;

public class C01Variables {
    public static void main(String[] args) {
        //(int) bir veriable (yas) olustur ve yazdir
        /*syntax:
        * data turu+ veriable ismi + atama operatörü +veriable + ;*/

        int yas = 35 ;
        System.out.println(yas);
        //(int) bir varible (sayi) olustur ve yazdir
        int sayi = 77 ;
        System.out.println(sayi);
        //konsola sayi = 50 seklinde yazdir
        byte rakam = 50;
        System.out.println("Sayi =" +rakam);
        //yeni bir Varaible olustur ve (benimYasim) ve yas variable'nen degerini benimYasima kopyala

        int benimYasim = yas;
        System.out.println("benimYasim =" + yas);
        //String bir variable olusturalim (isim)
        String isim = "Can";

        //Isim variableni etiketi ile yazdir
        System.out.println("isim =" +isim);
        //onunIsmi variable' olustur ve isim variable'nin degerini onunIsmi variable'ina kopyala
        String onunIsmi =  isim;
        //onunIsmi variable'ni etiketi ile yazdir
        System.out.println("onunIsmi " + onunIsmi);
        //isim variable'nin degerini güncelle
        isim ="Ali";
        //isim ve onunIsmi variable'lerine yazdir
        onunIsmi = "Leyla";

        System.out.println("onunIsmi =" +onunIsmi);

    }
}
