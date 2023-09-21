package day06Swicternarystring;

public class StringManipulations01 {
    public static void main(String[] args) {
        String s= "Java is easy";
        //Example 1: "s" String'inde kullanilan character sayisini bulunuz.
        int sLength = s.length();
        System.out.println(sLength);

        //Example 2: "s" String'indeki ilk indexte bulunan character'i ve son indexte bulunan karakteri aliniz.

        char firstChar= s.charAt(0);
        System.out.println(firstChar);//J

        char lastChar= s.charAt(11);
        System.out.println(lastChar);//y

        char lastChar2= s.charAt( s.length()-1 );
        System.out.println(lastChar2);//y

        //note : s.charAt(0) kodu bize herzaman ilk karakteri verir cunku index 0 dan baslar
        //note : s.charAt( s.length()-1 ) charAt method parantezine almak istedigimiz indexi vermemiz gerekiyor
        // s.length()-1 ile her zaman son index i alabilmeyi saglamis olduk

        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)
        String s1 = s.substring(0, 4);
        System.out.println(s1);//Java

        //Example 4: "s" String'indeki "is" kelimesini aliniz.
        String s2 = s.substring(5, 7);
        System.out.println(s2);//is

        //Example 5: "s" String'indeki "easy" kelimesini aliniz.
        //1.yol
        String s3 = s.substring(8, 12);
        System.out.println(s3);//easy

        //2.yol
        //Bir characterden baslayarak sonuna kadar almak isterseiz o zaman tek parametreli methodu kullanabilirsiniz
        String s4 = s.substring(8);
        System.out.println(s4);

        //Example 6:  "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        boolean isExist = s.contains("easy");
        System.out.println(isExist);//true


        //Example 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Example 8: "s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);//true

    }
}
