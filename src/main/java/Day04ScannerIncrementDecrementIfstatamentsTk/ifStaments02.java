package Day04ScannerIncrementDecrementIfstatamentsTk;

import java.util.Scanner;

public class ifStaments02 {
    public static void main(String[] args) {

// kullanicidan alinan bir sayinin  tekmi ciftmi oldugunu kontrol eden kodu olusturun

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int rakam = input.nextInt();

        if(rakam%2 ==0){
            System.out.println("Bu bir cift sayidir");
        } else if (rakam%2 !=0) {
            System.out.println("Bu bir tekli rakamdir");

        }

        // ikinci yol

        if(rakam%2==0){
            System.out.println("Rakam cift sayidir...");
        }else{
            System.out.println("Rakam tek sayidir....");
        }


    }
}
