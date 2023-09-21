package day04scannerinrementdecrementifstetemens;

import java.util.Scanner;

public class Scanner01 {
    public static <fload> void main(String[] args) {
        /*
        * kullanicidan 1 adini ve soyadini 2- yaini 3- boyunu 4- kilosunu 5- medeni durumunu girmesini isteyiniz
        * ardindan bunlari farkli etiket ile konsolda yazdirin*/

        //Java bu cözümler icin Util libare'de disardan yani kullanicidan fiziksel ortamdan java kodlarimizin icine bazi
        //datalari dahil edebilmek icin hazir bir klas olusturmustur bu klasin adi Scannerdir
        //Scanner essayment operatorden sonra tekrar yazilinca buna Consracter denir
        //consracter yapici demektir

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi ve Soyadinizi Giriniz : ");
        String fullName = input.nextLine();
        //kullanicidan birden fazla kelime istiyorsak nextline kullanacaig
        System.out.println("Yasinizi Giriniz");
        byte age = input.nextByte();
        System.out.println("Boyunuzu Giriniz");
        float heigt = input.nextFloat();
        System.out.println("kilonuzu giriniz");
        float wight = input.nextFloat();
        System.out.println("Medeni Durumunuzu Giriniz");
        String MaritalStatus = input.next();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("heigt = " + heigt);
        System.out.println("wight = " + wight);
        System.out.println("MaritalStatus = " + MaritalStatus);


    }
}
