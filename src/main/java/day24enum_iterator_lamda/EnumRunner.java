package day24enum_iterator_lamda;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        Cities sivas =Cities.BALIKESİR;
        System.out.println(sivas.getPlateCode());

        //Enum daki bir sabite nasil ulasabiliriz?
        Cities hatay = Cities.HATAY;
        System.out.println(hatay);

        //Adana sabitinin ismine ulasalim
        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        //Ankara nin posta koduna ulasalim
        String ankaraPostalCode = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostalCode);

        //istanbulun plaka koduna ulasalim
        System.out.println(Cities.İSTANBUL.getPlateCode());

        //Kullanicidan bir ilin plaka kodunu alarak bunun hangi il
        // oldugunu console a yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz..");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icindez bize verir
        Cities cities [] = Cities.values();
        // System.out.println(Arrays.toString(cities));
       // System.out.println(Arrays.toString(cities));


        if(plaka>81 || plaka<1  ){
            System.out.println("Girmis oldugunuz plaka gecersizdir");
        }else {

            for (Cities  w :  cities ) {
                if(plaka == w.getPlateCode()) {
                    System.out.println("Girmis oldugunuz plaka "+ w.getCityName()+" iline aittir");
                    break;

                }
            }

        }


















    }
}