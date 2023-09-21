package IfStatements01;

import java.util.Scanner;

public class C08_makIfStatements {
    //kullanicidan 2 sayi isteyip  sonra yapmak istedigi islemi sectirip bir hesap makinesi yaptirin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lütfen ikici sayiyi giriniz");
        double sayi2 = input.nextDouble();

        System.out.println("Lütfen yapmak istediginiz islemi seciniz + , - , *, /");
        String operatör = input.next();

        if(operatör.equals("+")){
            System.out.println("Sayilarin Toplami : "+ (sayi1+sayi2));
        } else if (operatör.equals("-")) {
            System.out.println("Sayilarin farki : "+ (sayi1-sayi2));
        } else if (operatör.equals("*")) {
            System.out.println("Sayilarin Carpimi : "+ (sayi1*sayi2));
        } else if (operatör.equals("/")) {
            System.out.println("Sayilarin Bölümü : "+ (sayi1+sayi2));
        }else{
            System.out.println("Lütfen düzgün operatör girin");
        }


    }







}
