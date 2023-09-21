package Scanner;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz, Soyisminizi, memleketinizi, yasinizi Giriniz");
        String isim = scan.next();
        System.out.println(isim);
        String soyIsim = scan.next();
        System.out.println(soyIsim);
        String memleket = scan.next();
        System.out.println(memleket);
        Integer yas= scan.nextInt();
        System.out.println(yas);


    }
}
