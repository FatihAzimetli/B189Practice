package day12ArrayListTekrari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           Bu listedeki birbirine uzak iki tamsayiyi yazdirin
        //           Bu listedeki eleman sayilarini bulan kodu yazdirin
        //           bu listedeki elemanlarin toplamini yazdirin
        //           bu listedeki en kücük eleman ile en büyük elemanin toplamini yazdirin
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        Collections.sort(nums);
        System.out.println("nums = " + nums);//nums = [10, 12, 19, 23]

        int minDiff = nums.get(1)-nums.get(0);

        // en kücük farkin kac oldugunu bulan kodu yazalim
        for (int i = 1; i <nums.size() ; i++) {
             Math.min(minDiff,nums.get(i)-nums.get(i-1));
        }
        System.out.println("minDiff = " + minDiff);

        // Birbirine uzak iki tamsayıyı yazdırma
        System.out.println("Birbirine uzak iki tamsayı: " + nums.get(0) + " and " + nums.get(nums.size() - 1));

        // Eleman sayısını bulan kod
        int elemanSayisi = nums.size();
        System.out.println("Eleman sayısı: " + elemanSayisi);

        // Elemanların toplamını bulan kod
        int toplam = 0;
        for (int num : nums) {
            toplam += num;
        }
        System.out.println("Elemanların toplamı: " + toplam);

        // En küçük eleman ile en büyük elemanın toplamını bulan kod
        int enKucuk = nums.get(0);
        int enBuyuk = nums.get(nums.size() - 1);
        int enKucukEnBuyukToplam = enKucuk + enBuyuk;
        System.out.println("En küçük eleman: " + enKucuk);
        System.out.println("En büyük eleman: " + enBuyuk);
        System.out.println("En küçük ile en büyük elemanların toplamı: " + enKucukEnBuyukToplam);

    }
}
