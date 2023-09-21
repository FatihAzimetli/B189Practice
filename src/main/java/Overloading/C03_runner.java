package Overloading;

public class C03_runner {
    public static void main(String[] args) {
        C02_telefon telefon=new C02_telefon("Iphone","15","mavi",256);
        C02_telefon telefon1=new C02_telefon("Samsung");
        C02_telefon telefon2=new C02_telefon("Xioami","Redmi","Kırmızı");
        C02_telefon telefon3=new C02_telefon("Xioami","Redmi",128);
        System.out.println(telefon2);
        System.out.println(telefon3);
        System.out.println(telefon);
        System.out.println(telefon1);

    }
}
