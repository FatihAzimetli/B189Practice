package day07sabah;

import java.util.Locale;
import java.util.Scanner;

public class stringManupulationTekrar {
    public static void main(String[] args) {
        /*
        * asagidaki kurallara göre kullanicinin irdigi passwor'u kontrol edin
        * En az 8 kalakter olsun
        * Space kalekteri password'de olmasin
        * En az iki büyük harf olsun
        * En az iki kücük harf olsun
        * en az birtane rakam olsun
        * en az 1 tane özel kalekter olsun  //Yapamadim*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sifrenizi giriniz");
        String pwd = input.nextLine();

        //8 kalakter icin lenght () metodu uygulanir. kullanici karisik yazacagindam dogrulama boolen ile kontrol edilir

        boolean lengthControl = pwd.length()>7; //sekiz KALEKTER ICIn >7 yailir

        System.out.println("lengthControl = " + lengthControl);

        //Space kalekteri password'de olmasin

        boolean spacekontrol = !pwd.contains(" ");
        System.out.println("spacekontrol = " + spacekontrol);

        //En az bir büyük harf olsun

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        //En az bir kücük harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //en az birtane rakam olsun

        boolean nuberCaseControl = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("nuberCaseControl = " + nuberCaseControl);

        boolean isValidControl = nuberCaseControl && lowerCaseControl && upperCaseControl  && lengthControl && spacekontrol;
        if (isValidControl){
            System.out.println("Pasword Gecerlidir");
        }else{
            System.out.println("Pasword Gecersizdir");
        }





    }
}
