package day06Swicternarystring;

import java.util.Scanner;

public class Swic01Tekrar {
    public static void main(String[] args) {
        /*
        * ay numarasi verilince*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangic ay numarasini giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Subat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayis");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Agustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasim");
            case 12:
                System.out.println("Aralik");
                break;
            default:
            System.out.println("Lütfen gecerli bir rakam giriniz");

        }








    }
}
