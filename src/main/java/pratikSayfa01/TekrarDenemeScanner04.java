package pratikSayfa01;

import java.util.Scanner;

public class TekrarDenemeScanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bes basmakli bir sayi giriniz");
        int rakam = input.nextInt();

        int forstTwo = rakam/1000;
        int lastTwo = rakam%100;

        System.out.println(forstTwo+lastTwo);


    }
}
