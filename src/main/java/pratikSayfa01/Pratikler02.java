package pratikSayfa01;

import java.util.Scanner;

public class Pratikler02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi ve Soyadinizi giriniz");
        String fullName = input.nextLine();



        System.out.println("Yasinizi giriniz");
        byte age= input.nextByte();



        System.out.println("Boyunuzu giriniz");
        float heigth = input.nextFloat();



        System.out.println("Kilonuzu giriniz");
        short wieght = input.nextShort();



        System.out.println("Medeni durumunuzu giriniz");
        String gender = input.next();

        System.out.println("Cocuk sayinizi giriniz");
        byte cocukSayisi = input.nextByte();

        System.out.println("Sokak adinizi Giriniz");
        String roadName = input.nextLine();

        System.out.println("Kapi numaranizi giriniz");
        byte kapiNumarsi = input.nextByte();

        System.out.println("Dogum yerinizi giriniz");
        String siteName = input.nextLine();

        System.out.println("fullName = " + fullName);

        System.out.println("roadName = " + roadName);
        System.out.println("siteName = " + siteName);

        System.out.println("age = " + age);
        System.out.println("heigth = " + heigth);
        System.out.println("wieght = " + wieght);
        System.out.println("gender = " + gender);
        System.out.println("cocukSayisi = " + cocukSayisi);

        System.out.println("kapiNumarsi = " + kapiNumarsi);


    }
}
