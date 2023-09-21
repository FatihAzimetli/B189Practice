package pratikSayfa01;

import java.util.Scanner;

public class Scannerdenemelr {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.println("Lütfen yasinizi giriniz");
        byte age = input.nextByte();
        System.out.println("age = " + age);


        System.out.println("Lütfen kilonuzu giriniz");
        int kilo = input.nextInt();
        System.out.println("kilo = " + kilo);

        System.out.println("Lütfen kimlik numaranizi giriniz");
        int kimlikNumarasi = input.nextInt();
        System.out.println("kimlikNumarasi = " + kimlikNumarasi);

        System.out.println("Lütfen Göz renginizi giriniz");
        String gozRengi = input.next();
        System.out.println("gozRengi = " + gozRengi);

        System.out.println("Lütfen medini durumunuzu giriniz");
        String medeniDurum = input.next();
        System.out.println("medeniDurum = " + medeniDurum);

        double num1 = 23.4;
        double num2 = 34.6;
        double num3 = 22.78;
        double num4 = 88.98;
        double total = num1+num2+num3+num4;
        double ortalama = total/4;
        System.out.println("total = " + total);
        System.out.println("ortalama = " + ortalama);


    }
}
