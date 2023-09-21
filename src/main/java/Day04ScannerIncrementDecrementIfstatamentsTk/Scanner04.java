package Day04ScannerIncrementDecrementIfstatamentsTk;

import java.util.Scanner;

public class Scanner04 {

    /*
     * Kullanicidan alacaginiz 5 basamakli sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdirin
     * örnek 45678 ===> 45+ 78 ===> 123 gibi*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bes basamakli bir sayi giriniz");

        int num = input.nextInt();

        int ilkIkiRakam = num/1000;
        int sonIkiBasamak =num%100;

        System.out.println(ilkIkiRakam+sonIkiBasamak);
        System.out.println();

        //Girilen 5 basamakli sayinin tek tek toplamini ekrana yazdir

        int sonBirinciRakam = num%10;
        int sonIkiciRakam = sonBirinciRakam%10;
        int sonUcuncuRakam = sonIkiciRakam%10;
        int sonDorduncuRakam = sonUcuncuRakam%10;
        int sonBesinciRakam = sonDorduncuRakam%10;

        System.out.println(sonIkiciRakam+sonUcuncuRakam+sonDorduncuRakam+sonBesinciRakam);



    }
}
