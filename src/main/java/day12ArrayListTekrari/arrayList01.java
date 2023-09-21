package day12ArrayListTekrari;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> ages =new ArrayList<>();
        //ArrayListlere eleman nasil eklenir?
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);

        //ArrayListlere coklu eleman nasil eklenir
        ArrayList<Integer>newAges =new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        System.out.println(newAges);
        ages.addAll(newAges);
        ages.addAll(0,newAges);


        System.out.println(ages);

        int nunOfElement = ages.size();
        System.out.println("nunOfElement = " + nunOfElement);

        //spesifk bir elemani almak.
         int eleman =  ages.get(1);
        System.out.println("eleman = " + eleman);

        //spesifk bir elemani degistirmek

        ages.set(1,313);
        System.out.println(ages);

        //Örnek: Bir intiger Arraylist olusturun ve tek olanlari 11 olarak degistirin

        ArrayList<Integer> list =new ArrayList<>();

        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);

        System.out.println("list = " + list);

        for (Integer w : list) {
            if(w%2 !=0){
                list.set(list.indexOf(w),11);
            }

        }
        System.out.println("list degistirme = " + list);

        // ekrana cift sayilarin toplamini yazdir
        //ekrena en kücük ile en büyük elemanlarin toplamini yazdir
        //elemanlari büyükten kücüge sirala
        // elemanlari kücükten büyüge sirala
        //cift sayi olan elemanlari listele
        //tek sayi olan elemanlari listele

        System.out.println("Tekleri 11 ile değiştirilmiş liste: " + list);

        // Çift sayıların toplamını bulma
        int ciftToplam = 0;
        for (Integer num : list) {
            if (num % 2 == 0) {
                ciftToplam += num;
            }
        }
        System.out.println("Çift sayıların toplamı: " + ciftToplam);

        // En küçük ile en büyük elemanların toplamını bulma
        int min = Collections.min(list);
        int max = Collections.max(list);
        int minMaxToplam = min + max;
        System.out.println("En küçük eleman: " + min);
        System.out.println("En büyük eleman: " + max);
        System.out.println("En küçük ile en büyük elemanların toplamı: " + minMaxToplam);

        // Elemanları büyükten küçüğe sıralama
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Büyükten küçüğe sıralanmış liste: " + list);

        // Elemanları küçükten büyüğe sıralama
        Collections.sort(list);
        System.out.println("Küçükten büyüğe sıralanmış liste: " + list);

        // Çift sayıları listeleme
        ArrayList<Integer> ciftSayilar = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                ciftSayilar.add(num);
            }
        }
        System.out.println("Çift sayılar: " + ciftSayilar);

        // Tek sayıları listeleme
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 != 0) {
                tekSayilar.add(num);
            }
        }
        System.out.println("Tek sayılar: " + tekSayilar);


    }
}
