package day05Tekrari;

import java.util.Scanner;

public class ifStatemens05senarzo {
    public static void main(String[] args) {

        /*
        * kullanicida 0 ile 120 yasi gecmeyecek sekilde bir deger aliniz
        * calisan kadin ise 60 yasindan büyük ise"Emekli Olabilir" Yazdirin
        * Calisan Erkek ise 65 yasaindan büyüks ise "Emekli olabilir" yazdirin*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        String gender =input.next();

        System.out.println("Lütfen bir yas Giriniz");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("Kadin")){
            if (age>60 && age<120){
                System.out.println("Emekli Olabilir");
            }else {
                System.out.println("Calismali");
            }


        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age>65 && age <121){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("Kesinlikle Calismali");
            }
        }else {
            System.out.println("Tanimli degil...");
        }


    }
}
