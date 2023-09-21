package day05Tekrari;

import java.util.Scanner;

public class ifStamente05tek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyet Giriniz");
        String gender = input.next();

        System.out.println("Lütfen yas giriniz");
        int age = input.nextInt();


        if(gender.equalsIgnoreCase("Kadin")){
           if (age>60){
               System.out.println("Emekli olabilir");

           }else{
               System.out.println("Calismaya devam etmeli");
           }

        } else if (gender.equalsIgnoreCase("Erkek")) {
            if (age>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Calismaya devam etmeli");
            }

        }else {
            System.out.println("Tanimli degil");
        }


    }
}
