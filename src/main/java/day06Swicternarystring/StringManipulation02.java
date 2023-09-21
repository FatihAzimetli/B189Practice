package day06Swicternarystring;

public class StringManipulation02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String s1 = s.replace("money", "dollar");
        System.out.println(s1);//Learn Java earn dollar

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz

        String s2 = s.replace("e", " ");
        System.out.println(s2);



/*
                        Meshur Regex'ler

    1) Tum rakamlar ==> [0-9]
    2) Tum kucuk harfler ==> [a-z]
    3) Tum buyuk harfler ==> [A-Z]
    4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
    5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
    6) Tum noktalama isaretleri ==> \\p{Punct}
    7) Tum sesli harfler ==> [aeiouAEIOU]
       x, q, w harfleri ==> [xqw]

    8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
    9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
    Sadece space karakteri : \\s
    Space karakteri haric  : \\S
    Sadece rakamlar        : \\d  (digit ten geliyor)
    Rakamlar haric         : \\D
*/

        //Ornek 3: s Stringindeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz
        String s3 =   s.replaceAll("[0-9]", "*");
        System.out.println(s3);

        //örnek 4: "s" String'indeki rakam sayisini bulunuz
        int num= s.replaceAll("[^0-9]","").length();

        System.out.println(num);
    }
}