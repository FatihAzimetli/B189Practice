package Day10loopsArrayOgledenSonra;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Array nasil olusturulur?
        String stdNames [] = new String[5];
        System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]

        //toString() methodunu kullanmadan sadece array ismini yazdirirsaniz java size o Array in adresini verir

        //Array e eleman ekleme nasil yapilir?
        stdNames [2] ="Ali";
        stdNames [1] ="Enes";
        stdNames [3] ="Azize";
        stdNames [4] ="Zafer";
        stdNames [0] ="Fatma";
        // stdNames [5] ="Bilgin";

        System.out.println(Arrays.toString(stdNames));//[Fatma, Enes, Ali, Azize, Zafer]

        //Array den specific bir eleman nasil alinir?
        System.out.println(stdNames[1]);//Enes

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String cities[] = new String[5];

        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";
        System.out.println(Arrays.toString(cities));
        //Note : length string lerde parantezli (method) , arraylerde ise parantezsiz (method degil) kullanilir
        //1. yol
        int totalChar = 0;

        for (int i = 0; i < cities.length; i++) {
            totalChar = totalChar + cities[i].length();
        }
        System.out.println(totalChar);

        //2.yol : for - each loop (enhanced loop)

        int sum = 0;

        //[Bayburt, Sivas, Denizli, Adana, Ankara]
        for (String w : cities) {
            sum = sum + w.length();

        }
        System.out.println(sum);

















    }
}
