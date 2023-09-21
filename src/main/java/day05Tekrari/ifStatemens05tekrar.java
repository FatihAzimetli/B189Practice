package day05Tekrari;

import java.util.Scanner;

public class ifStatemens05tekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz");
        String gander = input.next();

        System.out.println("Yasinizi Giriniz");
        int age = input.nextInt();

        if (gander.equalsIgnoreCase("Kadin")){
            if (age>60){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Calismaya devam etmelisiniz");
            }






        }if (gander.equalsIgnoreCase("Erkek")){
            if (age>65){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Kesinlikle Calismaya devam etmelisiniz");
            }






        }






















    }
}

