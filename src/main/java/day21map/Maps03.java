package day21map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s="I like you, like like!";

        //String imizi tum noktalama isaretlerinden temizlemeliyiz
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);//I like you like like

        //Tek parca olan stringimizi kelimelere ayirmak icin split(" ") kullanmaliyiz
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]



        //words arrayindeki kelimeler birer birer mapde var mi yokmu diye kontrol edilecek
        //words arrayindeki kelimeler Map de yoksa Map e value su 1 olarak yerlestirilecek
        //words arrayindeki kelimeler Map de varsa Map e varolan value u 1 artirilarak yerlesitrilecek
        HashMap<String, Integer> occ = new HashMap<>();


        for (String w : words) {

            Integer numOfOccurance = occ.get(w);
            if(numOfOccurance==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurance+1);
            }
        }
        System.out.println(occ);




         /*
        HashMap ile HashTable arasindaki fark nedir?
        1) HashMap threadSafe ve synchronized degildir, HashTable threadSafe ve synchronized dir
        2) HashMap hizlidir, HashTable HashMap e gore yavastir
        3) HashMap lere bir tane null key ve istediginiz kadar null value koyabilirsiniz
            HashTable lara keylerde ve valua larda null kullanilmasina musaade etmez

        Note= HashMap ve HashTable ikiside entry leri ratgele siralar

        Ne zaman HashTable kullanmaliyiz?
        1) threadSafe ve synchronized kullanmamiz gerekirse
        2) key ve value larda null kullanmak yasak ise HashTable kullanmaliyiz

         */
        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Ali", 77);
        ogrenciNotlari.put("Veli", 38);
        ogrenciNotlari.put("Tom", 76);
        ogrenciNotlari.put("Brad", 58);
        ogrenciNotlari.put("Can", 58);
        // ogrenciNotlari.put("ahmet", null);Hashtable larda value null olamaz
        // ogrenciNotlari.put(null, 58);Hashtable larda keyler null olamaz

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", null);
        stdAges.put("Veli", null);
        stdAges.put("Tom", null);
        stdAges.put(null, 18);
        stdAges.put(null, 33);
        System.out.println(stdAges);

        /*
        1)TreeMap entryleri keylerine gore natural order a gore siraya koyar, Bu yuzden coooooook yavastir
        2)Treemap threadSafe ve synchronized degildir.
        3)TreeMaplerin keylerinde null kullanilamaz, ama value larinda istedigimiz kadar null kullanabiliriz
         */


        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Italy", 40000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        countryPopulation.put("France", null);
        //  countryPopulation.put(null, 18000000);
        System.out.println(countryPopulation);


        //Ev ödevi
//Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String input = "Hello Henry!";
        HashMap<Character, Integer> result = countCharacterOccurrences(input);
        System.out.println(result);
    }

    public static HashMap<Character, Integer> countCharacterOccurrences(String input) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        input = input.replaceAll("[^a-zA-Z]", ""); // Sadece harf karakterlerini al
        input = input.toLowerCase(); // Harf büyüklüğünü göz ardı etmek için küçük harfe çevir

        for (char c : input.toCharArray()) {
            if (occurrences.containsKey(c)) {
                occurrences.put(c, occurrences.get(c) + 1);
            } else {
                occurrences.put(c, 1);
            }
        }


          return occurrences;






    }
}
