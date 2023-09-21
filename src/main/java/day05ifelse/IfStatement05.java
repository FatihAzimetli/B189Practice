package day05ifelse;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        /*Kullanican 0'dan kücük 120 den büyük deget giremiyecek sekilde detaylari aldiktan sonra
        * Eger calisan kadin is
        * 60 yasindan büyük ise Emekli olabilir yazdirin
        * Eger calisan Erkek ise
        * 65 yasindan büyük ise "Emekli olabilir " yazdiran kodu olusturun*/
        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz");
        String gender = input.next();
        System.out.println("Yasinizi Giriniz");
        short age = input.nextByte();

        if(gender.equalsIgnoreCase("Kadin")){
            if(age>60){
                System.out.println("Emekli Olabilir");
            }else{
                System.out.println("Calismali");
            }

        }else if(age>65){
            System.out.println("Emekli olabilir");
        }else{
            System.out.println("Kesinlikle Calismali");
        }




    }
}
