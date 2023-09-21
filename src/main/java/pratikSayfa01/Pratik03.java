package pratikSayfa01;

import java.util.Scanner;

public class Pratik03 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");


        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Toplam ="+ (firstNumber+secondNumber));
        System.out.println("Cikarma ="+ (firstNumber-secondNumber));
        System.out.println("Carpma ="+ (firstNumber*secondNumber));
        System.out.println("Cikarma ="+ (firstNumber/secondNumber));
        System.out.println("Birinci sayinin Karesi ="+(firstNumber*firstNumber));
        System.out.println("Ikinci sayinin Karesi ="+(secondNumber*secondNumber));


    }

}
