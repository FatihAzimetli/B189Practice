package day06Swicternarystring;

public class strinManuplation01tekrar {
    public static void main(String[] args) {


        String s = "Java is easy";

        // Örnek 1. : "s" String'inde Kullanilan character sayisini bulunuz.

        int sLeght = s.length();
        System.out.println(sLeght);
        // "s" ve "t" Stringinde ilk indexte bulunan  character'i ve son indexte bulunan karakteri aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar);
        char lastChar= s.charAt(11);
        System.out.println(lastChar);

        char lastChar2 = s.charAt(s.length()-1);
        System.out.println(lastChar2);

        // "s" Stringindeki ilk 4 characteri aliniz
        //substring (0-4) ==> "0" yani ilk indeex dahil, "4" yani ikinci index haric dir (0,4)
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //"s" Stringindeki "is" kelimesini aliniz

        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        // "s" String'deki "easy" kelimesini konsola gösterin

        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //tek parametreli kullanim icin ilk basladigimiz klakterin sira numarasini yazmamiz yeterli oluyor.
        // "a is easy" yazdirin
        String sub4 = s.substring(3);
        System.out.println(sub4);

        //"s" Stringinde easy kelimesinin var olup olmadigini kontrol ediniz

        boolean isExist = s.contains("easy");
        System.out.println(isExist);

        // "s" String'de " a is e " kelimesinin var olup olmadigini kontrol ediniz.

        boolean isExist1 = s.contains("a is e");
        System.out.println(isExist1);

        //"s" Stringinde belli bir harf ile baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //"s" String'de "money" ile bitip bitmedini kontrol ediniz.

        boolean isEnds = s.endsWith("money");
        System.out.println(isEnds);

        // "s" String'in "easy" ile bitip bitmedigini kontrol edin

        boolean isEnd1 = s.endsWith("easy");
        System.out.println(isEnd1);

        //örnek "t" sitringinge kullanilan character sayisini bulunuz

        String t= "Bugun hava cok sicakti";

       int tlength =t.length();
        System.out.println(tlength);

        // "t" Stringinde ilk indexte bulunan  character'i ve son indexte bulunan karakteri aliniz.











    }
}
