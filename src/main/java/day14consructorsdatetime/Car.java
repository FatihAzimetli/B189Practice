package day14consructorsdatetime;

public class Car {
     /*
    Constructor nedir?
    classdan object üretmemize yarayan code blocklaridir.
    class olusturdugumuzda java bize otomatik olarak bir constructor verir.
    Ama bu constructor gozle görülmez, gözle görülmeyen otomatik olarak java tarafindan verilen
    bu constructor lara "default constructor" denir

    Siz kendi constructor inizi olusturdugunuzda java default constructor i siler
    default constrouctor ===>     Car(){   }

    Bir classda farkli parametereler kullanarak istedigimiz kadar constructor olusturabiliriz
    farkli constructorlar sayesinde bir classtan farkli farkli objectler olusturabiliriz

    Constructor nasil olusturulur?
    Access modifier + Class ismi + () + {}
    interview sorusu:
    Methodlar ile Constructorlar arasindaki fark nedir?
    1) Methodlar return type olur, Constructor larda olmaz
    2) Methodlar yaptiklari ise gore isimlendirilirler, Constructorlar ise her zaman class ismi ile isimlendirilirler
    3) Methodlar bir aksiyon yapmak icin olusturulurlar, Constructorlar ise object olusturmak icindir.
    4) Method isimleri kucuk harfle baslar, Constructor isimleri class ismi ile ayni oldugu icin buyuk harfle baslar

     */

    //variable lar olusturalim
    String make = "Honda";
    String model ="Accord";
    int year =2023;
    boolean hybrid=true;
    //Metodlar örnegin arabanin hareket etmesi

    public Car(String make, String model, int year, boolean hybrid ){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(int year) {
        this.year = year;
    }

    //Method lar olusturalim
    public void hareket(){
        System.out.println("Honda hizli hareket eder");
    }
    public void dur(){
        System.out.println("Honda guvenli bir sekilde durur");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
