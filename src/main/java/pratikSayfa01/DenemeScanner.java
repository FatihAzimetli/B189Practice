package pratikSayfa01;

import java.util.Scanner;

public class DenemeScanner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Kullanicidan bir dikdörgenin iki kenar uzunlugunu aliniz
        //alanini hesaplayin
        //cevresini hesaplayin
        System.out.println("Lütfen  Konteynerin kisa kenar uzunlugunu giriniz");
       float sortSide = input.nextFloat();

        System.out.println("Lütfen konteynerin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();

        System.out.println("Lütfen konteynerin Yüksekligini Giriniz");
        float heightSide = input.nextFloat();

        System.out.println("Konteynerin alani ="+ (sortSide*longSide) +" m² 'dir");
        System.out.println("Konteynerin hacmi ="+(sortSide*longSide*heightSide)+" m³ 'dir");

    }
}
