package day06swithtekrari;

public class StringManipulation02 {
    public static void main(String[] args) {

        String s ="Learn Java earn 4400$ money";

        //Örnek "s" Stringindeki "money" kelimesini "dollar" kelimesine ceviriniz
        String degistir1 = s.replace("money","dolar");
        System.out.println("degistir1 = " + degistir1);

        // "s" Stringindeki tüm "e" harflerini siliniz
        String sil1 = s.replace("e","");
        System.out.println("sil1 = " + sil1);

        //Stringte ki tüm rakamlari  (0,1,,,,,,9) "*" ceviriniz

       String s2 = s.replaceAll("[0-9]","*");
        System.out.println("s2 = " + s2);

        //"s" Stringindeki rakam sayisini bulun
        int s3 = s.replaceAll("[^0-9]","").length();
        System.out.println("s3 = " + s3);

    }
}
