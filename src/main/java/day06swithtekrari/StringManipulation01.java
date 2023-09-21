package day06swithtekrari;

public class StringManipulation01 {
    public static void main(String[] args) {

        //"s" Stringde kullanilan character sayisini bulunuz.
        String s = "Java is easy";
        int sLength= s.length();
        System.out.println("sLength = " + sLength);//12
        // "s" Stringdeki ilk indexte bulunan charcteri ve son indexte bulunan karakteri aliniz
        char ilkKarekter = s.charAt(0);
        System.out.println("ilkKarekter = " + ilkKarekter);
        char sonKarekter = s.charAt(11);
        System.out.println("sonKarekter = " + sonKarekter);

        char sonKarekter2 = s.charAt(s.length()-1);
        System.out.println("sonKarekter2 = " + sonKarekter2);

        //Örnek "s" Stringindeki ilk 4 kalaekteri alainiz

        String aralik1 = s.substring(0,4);
        System.out.println("aralik1 = " + aralik1);

        //"s" sitringindeki "is" kelimesini aliniz
        String aralik2 = s.substring(5,7);
        System.out.println("aralik2 = " + aralik2);
        // konsolda easy yazdir

        String alalik3 = s.substring(8,s.length()-0);
        System.out.println("alalik3 = " + alalik3);

        // dger yolu s.substring(8,12) bu yapilir ayrica sona kadar gitmek istiyorsak s.sunsitring(8) yazdigimizda sona gider
        // basa tabiki strig terimi konmali char konursa sadece 8 alir
        String aralik4 = s.substring(8);
        System.out.println("aralik4 = " + aralik4);

        //"S" stringinde easy var olup olmadigini kontrol ediniz
        boolean varmi = s.contains("easy");
        System.out.println("varmi = " + varmi);

        // "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean baslarmi1 = s.startsWith("Java");
        System.out.println("baslarmi1 = " + baslarmi1);

        // "s" stringi:nin "money" ile bitip bitmedigini kontrol ediniz
       boolean bitermi2= s.endsWith("money");
        System.out.println("bitermi2 = " + bitermi2);


    }
}
