package day11multiDimensionalArrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1. Step : iki boyutlu arrayde kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;
        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2. Step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturmaliyiz
        int newArr [] = new int[toplamElemanSayisi];

        //3. Step : iki boyutlu arraydeki elemanlari tek boyutlu arraye transfer etmeliyiz

        int idx=0;
        //{{5, 4}, {2, 3, 2}}
        for (int [] w : numbers ) {

            for ( int k :w) {
                newArr[idx]=k;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));















    }
}
