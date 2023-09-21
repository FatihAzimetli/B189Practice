package Day04ScannerIncrementDecrementIfstatamentsTk;

import java.util.Scanner;

public class Scanner01tekrar {
    public static void main(String[] args) {

        /*
         * kullanicidan 1 adini ve soyadini 2- yaini 3- boyunu 4- kilosunu 5- medeni durumunu girmesini isteyiniz
         * ardindan bunlari farkli etiket ile konsolda yazdirin*/

        //Java bu cözümler icin Util libare'de disardan yani kullanicidan fiziksel ortamdan java kodlarimizin icine bazi
        //datalari dahil edebilmek icin hazir bir klas olusturmustur bu klasin adi Scannerdir
        //Scanner essayment operatorden sonra tekrar yazilinca buna Consracter denir
        //consracter yapici demektir

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Adinizi ve Soyadinizi giriniz");
        String adiSoyadi = input.nextLine();

        System.out.println("Lütfen yasinizi Giriniz");
        byte yas = input.nextByte();

        System.out.println("Lütfen boyunuzu Giriniz");
        short boy = input.nextShort();

        System.out.println("Lütfen Kilonuzu Giriniz");
        byte kilo = input.nextByte();

        System.out.println("Lütfen Medini durumunuzu Giriniz");
        String medeniDurum = input.next();

        System.out.println("Adi ve Soyadi : "+ adiSoyadi +"\nYasi : " + yas +"\nBoyu : "+ boy +"\nKilosu : "+ kilo +"\nMedeni Hali : " + medeniDurum);













    }//main metod sonu


}//klas sonu
