package Day12ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C05ArrayList {
    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk farklı pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
         */
        Random randomSayilar=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200) {
            sayi=randomSayilar.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }

        System.out.println(sayiListesi);

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz listede var olup olmadigini size dondurelim");
        sayi= scan.nextInt();
        if (sayiListesi.contains(sayi)){
            System.out.println("sayi listede var");
        }else System.out.println("sayi listede yok");


    }
}
