package pratikSayfa01;

import java.util.Scanner;

public class VeriablesPratikler {
    public static void main(String[] args) {
        //bir string ve iki intiger veriable olusturun ve intigerlerin degerini konsola yazdirin

        String s= "Elma";
        int a =10;
        int b =25;
        System.out.println(s+a+b);
        System.out.println(a+s+b);
        System.out.println(s+(a+a+b));
        System.out.println(s+a*b);

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yasinizi Giriniz");
        System.out.println();
        byte age = input.nextByte();
        System.out.println("age = " + age);
    }
}
