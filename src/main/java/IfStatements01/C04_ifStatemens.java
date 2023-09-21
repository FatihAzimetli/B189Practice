package IfStatements01;

import java.util.Scanner;

public class C04_ifStatemens {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyiniz . Girilen harf sesliu ise sesli harf oldugunu degilse yaba bir
        // kalakterden fazla ise hata mesaji göstersin (test büyük yada kücük harf duyarlidir)
        // sesli harfler a,e,i,o,u

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String str = input.nextLine().toLowerCase();
        str = str.replaceAll("[^a-zA-Z]","*");

        boolean sesliHarfMi= str.equals("a") || str.equals("e") || str.equals("i") || str.equals("u");


       if(sesliHarfMi){
           System.out.println("Sesli harftir");
       }
       if (!sesliHarfMi && !str.contains("*") && str.length()==1){
           System.out.println("Sessiz harftir");
       }
        if(str.length()!=1 || str.contains("*")){
            System.out.println(" Hata li giris");
        }





    }
}
