package day06Swicternarystring;

public class StringManupulation2Tekrar {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        // "s" String'deki "money" kelimesini "dolar" kelimesine cevirin
        String s1 = s.replace("money","dolar");
        System.out.println(s1);

        // "s" Strindeki tum "e" harflerini siliniz

        String s2 = s.replace("e","");
        System.out.println(s2);

        // "s" Stringdeki tüm "a"  harflerini "i" ile degistir

        String s3 = s.replace("a", "i");
        System.out.println(s3);
















    }
}
