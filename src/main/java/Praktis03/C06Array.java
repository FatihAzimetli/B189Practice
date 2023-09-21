package Praktis03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Array {
    public static void main(String[] args) {
        /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */

        int [] array = new int[5]; //eleman sayisi

        System.out.println(Arrays.toString(array));

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Lütfen bir sayi giriniz");
            int sayi = input.nextInt();
            array[i] = sayi;
        }
        System.out.println(Arrays.toString(array));
        //Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        double toplam = 0;
        for (int each: array) {// (forich (ne gelecek:nereden gelecek)
            toplam+=each;

        }
        System.out.println("toplam = " + toplam);
        double ortalama = toplam / array.length;
        System.out.println("ortalama = " + ortalama);

        //Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int each:array) {
            if (each>ortalama)
                System.out.println(each+" ");
        }
        System.out.println();
        //Arrayin elemanlarının işaretlerini degistiren bir kod yazınız
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*-1;
        }
        System.out.println(Arrays.toString(array));


    }


}
