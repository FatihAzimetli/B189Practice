package IfStatements01;

import java.util.Scanner;

public class C03_ifStaments2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String günIsmi = input.next().toLowerCase();


       // String haftaIci = "Pazartesi sali carsamba persebe cuma";
       // String haftaSonu = "cumartesi pazar";

       // if(haftaIci.contains(günIsmi)){
          //  System.out.println("Hafta ici bir gün");
       // }
       // if (haftaSonu.contains(günIsmi)) {
         //   System.out.println("Hafta sonudur");
        //}
        //if (!haftaIci.contains(günIsmi)&&!haftaSonu.contains(günIsmi) ) {
        //    System.out.println("Lütfen gecerli bir gün adi giriniz");
       // }
        boolean haftaIci= günIsmi.equals("Pazartesi")
                || günIsmi.equals("Sali")
                || günIsmi.equals("Carsamba")
                ||günIsmi.equals("Persembe")
                || günIsmi.equals("Cuma");
        boolean haftaSonu = günIsmi.equals("cumartesi")
                ||günIsmi.equals("Pazar");

        if (haftaIci) {
            System.out.println("Girilen gün hafta icidir");
        }
        if (haftaSonu) {
            System.out.println("Girlen gün hatasonudur");
        }
        if (!haftaIci||!haftaSonu){
            System.out.println("Hatali giris");
        }


    }
}
