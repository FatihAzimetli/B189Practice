package day10tekrariArrays;

import java.util.Arrays;

public class Arrays01tekrari {
    public static void main(String[] args) {

        int a= 13;
        a=7;
        a=5;

        String stdNames [] = new String[6];
        System.out.println(Arrays.toString(stdNames));

        stdNames[0]="Fatih";
        stdNames[1]="Yalcin";
        stdNames[4]="Saygin";
        stdNames[2]="Aldi";
        stdNames[3]="Saygin";
        stdNames[5]="Aldi";

        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[2]);
        /*String array olusturun, icine 5 tane eleman yazin,
        * elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin*/

        String cities [] = new String[5];
        cities [0] = "Sivas";
        cities [1] = "Ankara";
        cities [2] = "Izmir";
        cities [3] = "Tokat";
        cities [4] = "Diyarbakir";

        int totalChar = 0;

        for (int i = 0; i < cities.length; i++) {
            totalChar=totalChar+cities[i].length();

        }
        System.out.println(totalChar);

        //ikinci yol for-eacch loop
        int sum=0;
        for (String w: cities){
            sum= sum+w.length();
        }
        System.out.println(sum);
        System.out.println();

        /*integer array olusturun, icine 6 tane eleman yerlestirin
        * bu elemanlarin en kücügü ile en büyügünpn toplamini ekrana yazdirin*/

        int ages [] = new int[6];

        ages [0] = 20;
        ages [1] = 23;
        ages [2] = 19;
        ages [3] = 44;
        ages [4] = 15;
        ages [5] = 32;

        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);//1nci yöl

        //2.nci yol

        int minimum = ages [0];
        int maximum = ages[0];

        for (int w : ages){
            minimum = Math.min(minimum,w);
            maximum=Math.max(minimum,w);
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(minimum+maximum);










    }
}
