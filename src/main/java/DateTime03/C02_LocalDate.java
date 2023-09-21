package DateTime03;

import java.util.Scanner;

public class C02_LocalDate {
    /*Kullanicidan bir harf girmesni isteziniy. Girilen harf sesli ise sesli harf oldugunu, degilse sessiy harf oldugunu ekrana giriniy
    * diger girdikleri harf degilse hata mesaji zeriniy a, e, i , o. u*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen bir harf giriniz");

        String harf = input.next().toLowerCase();
        harf = harf.replaceAll("[^a-zA-Z]","*");

        boolean sesliHarfmi = harf.equals("a") ||
                harf.equals("e") || harf.equals("0")
                || harf.equals("u") || harf.equals("i");

        if (harf.contains("*")||harf.length()!=1){
            System.out.println("Hata");
        } else if (sesliHarfmi) {
            System.out.println("Sesli harftir");
        }else {
            System.out.println("Sessiz harf");
        }


    }


}


