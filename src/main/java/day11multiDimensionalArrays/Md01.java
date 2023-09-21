package day11multiDimensionalArrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Bir Arrayin elemanlari Array ise bu arrayler Multidimensional Array  olarak adlandirilir


        //Multidimensional Array nasil olusturulur?

        int a [][] = new int[3][2];//[[0,0],[0,0],[0,0]]

        //Multidimensional Array lere nasil eleman eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //Multidimensional arrayleri console a yazdirmak icin toString() methodu degil, deepToString() methodunu kullaniriz

        System.out.println(Arrays.toString(a));//[[I@511baa65, [I@340f438e, [I@30c7da1e]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(a[1][1]);//45

        //Multidimensional Array icindeki bir array nasil yazidirilir?
        System.out.println(Arrays.toString(a[2]));//[123, 0]

        //kisa yoldan Multidimensional Array nasil olusturulur?

        String students [][] = { {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"} };

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum =0;
        //{ {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"} }
        for ( String [] w : students ) {

            sum=sum+ w.length;

        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz


        //{ {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"} }
        for (String [] w : students ) {

            for ( String k : w) {
                if(k.contains("m")){
                    System.out.println(k);
                }
            }

        }





















    }
}
