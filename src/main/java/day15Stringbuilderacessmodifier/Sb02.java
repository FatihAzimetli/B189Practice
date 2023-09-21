package day15Stringbuilderacessmodifier;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");

        System.out.println(sb1);//Java is easy
        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ
        //verilen indexteki characteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);
        //baslangic index dahil bitis index(haric) ine kadar olan characterleri sil
        sb1.delete(0, 3);
        System.out.println(sb1);
        //replace(0,2,"XXX"); 0 dahil 2 haricolmak üzere bu indexlere X koyar
        sb1.replace(0, 2, "XXX");
        System.out.println(sb1);

        sb1.insert(2, "777");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Jbva");
        StringBuilder sb3 = new StringBuilder("Java");

        int result = sb2.compareTo(sb3);
        System.out.println(result);

         /*
        compareTo() iki StringBuilder i bastan baslayarak harf harf karsilastirir
        ilk harf ayni ise ikincilere gecer, ikinciler ayni ise ücüncülere gecer....
        ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir

        eger hic farkli harf yoksa sonuc olarak 0 verir

       sonuc  0 ise alfabetik olarak ayni sirada demektir
       sonuc -1 ise sb2 sb3 den alfabetik olarak onde demektir
       sonuc 1 ise sb2 sb3 den alfabetik olarak sonra demektir
         */


        //StringBulider nasil string e cevrilir?
        //toString() methodu StringBuilder i string e cevirir
        //String class da var olan ama StringBuilder class icinde var olamyan mesela split() methodu gibi
        //methodlara ihtyac duydugumuzda bu method sayesinde string class icindeki methodlari kullanabilirz
        String str = sb2.toString().toUpperCase();

        //String nasil StringBulider a cevrilir?
        StringBuilder newSb1= new StringBuilder(str);
        System.out.println(newSb1);



        /*
        1) StringBuffer Java da string ureten bir diger classdir
            StringBuffer javanin string üretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder a cok benzer, yani ikiside mutable string üretir
        3) StringBuffer "multi-thread" dir ama StringBuilder  "multi-thread" degildir.
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir
        5) multi-thread yapilirken yapilan islemlerin siralamasi önem arzeder.
            Yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
            StringBuffer multi-thread oldugu icin ayni zamanda synchronized dir
            3 tane String olusturam klas ögrendik

            1)immutable string lazimsa ==> String class
            2) mutable string lazimsa . StringBuildir veya StringBuffer

                a) immutable string lazimsa : String class
                b) mutable string lazimsa : StringBuilder veya StringBuffer
                        i) StringBuilder i multi-thread gerekmezse kullaniriz
                        ii) StringBuffer i multi-thread gerekirse kullaniriz
         */
        //StringBuffer nasil olusturulur?
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);



    }
}
