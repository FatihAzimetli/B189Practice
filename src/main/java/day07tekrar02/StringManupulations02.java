package day07tekrar02;

public class StringManupulations02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98



        String tv = "$456.99";
        String laptop = "$875.99";

        String newTw=  tv.replace("$",""); // replace: ($) sil ve yerine  ("") hiclik koy
        String newLaptop =  laptop.replace("$",""); //replace: ($) sil ve yerine  ("") hiclik koy

        Double toplamFiyat = Double.valueOf(newTw) + Double.valueOf(newLaptop);//valeOf Sitring gir ve Double olarak cik anlamindadir
        System.out.println("toplamFiyat = " + toplamFiyat);

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "    ali cAN   " ==> AC
        //trim() methodu bir string in bas ve sonundaki space characterlerini siler, aradaki space leri silmez
        //split() methodu bir string i istedigimiz characterden parcalamaya yarar.


    }
}
