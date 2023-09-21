package day12ArrayListTekrari;

import java.util.*;

public class ArrayList02 {
    public static void main(String[] args) {

        //Tekrari elemanlari olan bir listeden sadece tekrarsiz elemenleri olan bir liste elde edin
        // [ J , a , v , a , v] ==> [j, a , v]
        // Tekrarli olan elemanlari listele
        // ACESII tablosuna göre kücükten büyüge sirala
        // listeyi tersten yazdir
        //listedeki sesli harfleri yazdir
        // listedeki sesiz harfleri yazdir
        List<Character> a = new ArrayList<>();

        a.add('j');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println("a = " + a); //a = [j, a, v, a, v]

        List<Character> b = new ArrayList<>();
        //icermiyorsa ekle foreach ile olur

        for (Character w : a) {
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println("b = " + b); //b = [j, a, v]

        // Tekrarlı elemanları listeleme
        List<Character> tekrarliElemanlar = new ArrayList<>();
        for (Character w : a) {
            if (a.indexOf(w) != a.lastIndexOf(w) && !tekrarliElemanlar.contains(w)) {
                tekrarliElemanlar.add(w);
            }
        }
        System.out.println("Tekrarlı elemanlar: " + tekrarliElemanlar);//Tekrarlı elemanlar: [a, v]

        // ASCII tablosuna göre küçükten büyüğe sıralama
        b.sort(null);
        System.out.println("ASCII'ye göre sıralanmış liste: " + b); //ASCII'ye göre sıralanmış liste: [a, j, v]

        // Listeyi tersten yazdırma
        List<Character> tersListe = new ArrayList<>(b);
        java.util.Collections.reverse(tersListe);
        System.out.println("Liste tersten yazdırıldı: " + tersListe); //Liste tersten yazdırıldı: [v, j, a]

        // Sesli harfleri yazdırma
        List<Character> sesliHarfler = new ArrayList<>();
        for (Character harf : b) {
            if ("aeiouAEIOU".contains(String.valueOf(harf))) {
                sesliHarfler.add(harf);
            }
        }
        System.out.println("Sesli harfler: " + sesliHarfler); //Sesli harfler: [a]

        // Sesiz harfleri yazdırma
        List<Character> sesizHarfler = new ArrayList<>(b);
        sesizHarfler.removeAll(sesliHarfler);
        System.out.println("Sesiz harfler: " + sesizHarfler); //Sesiz harfler: [j, v]

        // Örnek : Bir String Arraylist olusturun ve "a" iceren elemanlari silin
        // Bu Stringin eleman sayisini bulunuz
        // bu Stringin elamanlarini listeleyiniz

        ArrayList<String> r = new ArrayList<>();

        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println("r = " + r); //r = [Manisa, Nigde, Tokat, Van]

        //foreach kullandigimizda eleman sayisini azaltamayiz

      //  for (String w : r) {
      //      if (w.contains("a")){
      //          r.remove(w);
       //     }
       // }
        //System.out.println("r = " + r); //at day12ArrayListTekrari.ArrayList02.main(ArrayList02.java:77)
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
                i--;     //Yazimadan alinan sonuc; //r = [Manisa, Nigde, Tokat, Van] //r = [Nigde, Van]
            }            // Silme islemi oldugunda indexlerde azalacagi icin i degerinide azalmaliyiz.
        }
        System.out.println("r = " + r); //r = [Manisa, Nigde, Tokat, Van] // r = [Nigde]
        // i--; // indexleri güncelle  anlamina gelir
        System.out.println();
        // Eleman sayısını hesaplamak için döngü kullanma
        ArrayList<String> s = new ArrayList<>();
        s.add("Manisa");
        s.add("Nigde");
        s.add("Tokat");
        s.add("Van");


        int elemanSayisi = 0;
        for (String eleman : s) {
            elemanSayisi++;
        }
        System.out.println("Eleman sayısı: " + elemanSayisi);

        // Elemanları listeleyebiliriz
        for (String eleman : s) {
            System.out.println("Eleman: " + eleman);
        }
        // s Stringindeki benzersiz harflri listele

        Set<Character> benzersizHarfler = new HashSet<>();
        for (String eleman : s) {
            char[] harfler = eleman.toCharArray();
            for (char harf : harfler) {
                benzersizHarfler.add(harf);
            }
        }
        System.out.println("Benzersiz harfler: " + benzersizHarfler); //Benzersiz harfler: [a, d, e, g, i, k, M, n, N, o, s, T, t, V]

        // s Stringindeki bu hafleri ACSII tablosuna göre kücükten büyüge sirala

        Set<Character> siraliBenzersizHarfler = new TreeSet<>(benzersizHarfler);
        System.out.println("Sıralı benzersiz harfler: " + siraliBenzersizHarfler); //Sıralı benzersiz harfler: [M, N, T, V, a, d, e, g, i, k, n, o, s, t]


    }
}
