package pratikSayfa01;

public class TekrarCozumler {
    public static void main(String[] args) {
        //yan yana yazma
        /*2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın
         */

        String str1 = "Güzel";
        String str2 = "Java";
        int sayi1=5;
        int sayi2=3;
        System.out.println(str2+sayi1+str1);
        System.out.println(sayi1+sayi2+str2);
        System.out.println(str2+(sayi1+sayi2)+str1);
        System.out.println((sayi1-sayi2)+str1+sayi1*sayi2);
        System.out.println(str2+(sayi1-sayi2)+(sayi1-sayi2));
        System.out.println((sayi1*sayi2)*sayi2+sayi1+str1);
        System.out.println(""+sayi1+sayi2+str2);

        int yas =50;
        System.out.println("yas = " + yas);

        int BenimYasim =yas ;
        System.out.println("BenimYasim = " + BenimYasim);

        String onunIsmi = "Isim";
        String Isim= "Can";
        System.out.println("Isim = " + Isim);


    }
}
