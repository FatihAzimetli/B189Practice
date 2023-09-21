package VariableDersTekrari;

import java.io.FileOutputStream;
import java.util.Scanner;

public class C03_Variable {
    public static <Workbook> void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // String isim, soyIsim, Memleket ;
        //double kilo, yas, boy ;

        System.out.println("Lütfen isminizi giriniz: ");
        String isim = input.nextLine();

        System.out.println("Lütfen Soyadinizi Giriniz :");
        String soyIsim= input.nextLine();

        System.out.println(" Lütfen memleketinizi Giriniz :");
        String memleket= input.nextLine();

        System.out.println("Lütfen kilonuzu Giriniz :");
        double kilo = input.nextDouble();

        System.out.println("Lütfen yasinizi Giriniz :");
        short yas = input.nextShort();

        System.out.println("Lütfen Boyunuzu Giriniz");
        short boy= input.nextShort();
//Ekrana yazdirma
        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);
        System.out.println("memleket = " + memleket);
        System.out.println("kilo = " + kilo);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);

        input.close();



    }
}
