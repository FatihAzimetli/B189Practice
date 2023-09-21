package day07sabah;

import java.util.Locale;

public class StringManupilation01tekrar {
    public static void main(String[] args) {
        /*
        * Asagida fiyatlari verilen ürünlerin toplam fiyatlarini bulunuz
        * String Tv = "$456.99; String laptop = "$ 875.99 ==> 456.99+875.99 =  1332.98.....*/
        String tv = "$456.99";
        String laptop = "$ 875.99";
        //önce numerik datay ceviriiz , Strin ile sadec concation yapilir

        // dolari Strinden cikarmak icin Replace metodu kulllanilir

        //tv.replace("$",""); //sepete bak ve dolar isaretini sil
        String newTv=tv.replace("$","");

        // aynisini laptop icin yapriz
        String newLaptop = laptop.replace("$","");

        //Double veper klas bu ise uygun olur, double ondalikli sayi toplami icindir.
        // Valeuf (s,d) yani strin gir double cik
        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println("totalPrice = " + totalPrice);

        /*verilen ismin ilk harfini ve soy isimdeki ilk harfi ekrana yazdirin
        * ali can  ===> AC
        * trim () Bastaki ve sondaki space leri siler
        * toUpperCase() Harleri büyütür. tolowerCase() harfleri kücültür
        * charAt(0)Bastaki ilk kalekteri veri
        * split() metodu ile "ali" den kurtuluruz yani space ile bosluktan kesmis oluruz
        * Ortadan kestik ve elimizde iki adet kagit oldu
        * [1] yazarak Can al demis olduk */
        String name = " ali can ";
        char first = name.trim().toUpperCase().charAt(0); //ali
        char last = name.trim().split(" ")[1].toUpperCase().charAt(0); //can
        System.out.println(first);
        System.out.println(last);
        //Yanyana yazdirmak icin concation metodu uygulariz
        System.out.println(""+first+last);

        //Bir stringde bir karakteden basliyarak belirli bir karektere
        //kadar tüm karakterleri dinamik olarak aliniz
        //abc@gmail.com ==> gmail
        //subsitrin (4,9) Okunmasini istedigimiz araligi yazdirriz
        String a= "abc@gmail.com";
        System.out.println(a.substring(4,9));//kod clisir ancak dimak degil
        //indexOf () icine yazilan karekterin indeksini verir
        int starting = a.indexOf("@")+1;
        int endIng= a.indexOf("."); //burda . görmüyecegimiz icin artirma yapmadik
        String companiName= a.substring(starting, endIng);// ()parentez icinde end ve sab sitrin zaten gözüküyor
        System.out.println(companiName);

        /*bir strindeki tekrarsiz kaletterleri yan yana yazdirin
        * mehmet ===> ht
        * lastIndexOf() metodu parantezi icine yazilan karakterin son grönünüm indexsi verir */
        //indexOf("m") m'nin ilk görümüno






    }
}
