package day05ifelseSwitchternaryTekrarlari;

import java.util.Scanner;

public class ifStaments03tekrar {
    public static void main(String[] args) {
        /*
         * kullanicidan yas degerii alan ve yasin hangi evrede oldugunu asagidaki tabloza göre yaydiran kodu olusturun
         * 0-4 bebk
         * 5-12 cocuk
         * 13-20 genc
         * 21-30 yetiskin
         * 30 üstü ====> tamamlanamamis
         * hata mesji icin "Gecerli bir yas giriniz" yazdirin*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yas Giriniz");

        byte yasDegeri = input.nextByte();
        if (yasDegeri<0) {
            System.out.println("Lütfen gecerli bir yas Giriniz");
        }else if(yasDegeri>=0 && yasDegeri<5){
            System.out.println("Bebek");
        } else if (yasDegeri>4 && yasDegeri<13) {
            System.out.println("Cocuk");
        } else if (yasDegeri>12 && yasDegeri<21) {
            System.out.println("Genc");
        } else if (yasDegeri>20 && yasDegeri<31) {
            System.out.println("Yetiskin");
        } else if (yasDegeri>30 && yasDegeri<32 ) {
            System.out.println("Tanimlanmamis Yas grubu");
        }else {
            System.out.println("Hatali giris yaptiniz Lütfem gecerli bir rakam giriniz");
        }


    }
}
