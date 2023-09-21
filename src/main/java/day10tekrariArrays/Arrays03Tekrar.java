package day10tekrariArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays03Tekrar {
    public static void main(String[] args) {
        //bir intiger array olusturun ve 5'ten kucuk olan elemanlari yazdirin
        // [12, 3, -3 , 5, 23,] ===> 3, -3

        int numbers [] ={12, 3, -3 , 5, 23};
        for (int w:numbers) {
            if (w<5){
                System.out.print(w + " ");

            }

        }
        System.out.println();

        //Spesifik bir elemanin array'de olup olmadigini kontrol ediniz

        String names [] ={"K","R","M","X","F","S"};
         Arrays.sort(names);
        int result = Arrays.binarySearch(names,"X");
        System.out.println(result);
        System.out.println();

        //size verilen cümlede kac eleman oldugunu gösteren kodu yaziniz
        String s = "Java is easy. Learn Java earn money.";

        String word [] = s.split(" "); // buradaki space split ile parcalama kac adet parca kelime
        System.out.println(Arrays.toString(word));// kelimeleri tek tek ayrilmasini gösterdi
        int totalCharacters = s.length();
        System.out.println("totalCharacters = " + totalCharacters);
        System.out.println("word = " + word.length);

        System.out.println(word.length);// kac adet kelime oldugunu gösterdi

        int uniqueCharacters = (int) s.replaceAll("\\s","").chars().distinct().count();
        System.out.println("uniqueCharacters = " + uniqueCharacters);


    }
}
