package day05Tekrari;

import java.util.Scanner;

public class casekarsilastirma {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen gün adi giriniz");


        String dayNuma = "CuMa";







        switch (dayNuma.toLowerCase()){
            case "pazartesi" :
                System.out.println(1);
                break;
            case "sali" :
                System.out.println(2);
                break;
            case  "carsamba" :
                System.out.println(3);
                break;
            case "persembe" :
                System.out.println(4);
                break;
            case "cuma" :
                System.out.println(5);
                break;
            case "cumartesi" :
                System.out.println(6);
                break;
            case "pazar" :
                System.out.println(7);
                break;
            default:
                System.out.println("Lüfengecerli bir gün ismi girin");
        }
    }
}
