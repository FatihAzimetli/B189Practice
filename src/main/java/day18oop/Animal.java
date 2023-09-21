package day18oop;

public class Animal {
    //Overriding
     /*
    1) Parent class daki methodu child class icinde ozellestirerek kullanmaya overriding yapmak denir
    2) Overriding de methodun parantezine, methodun ismine dokunulmaz, yani methodun signature i degistirilmez
       methodun body si degistirilir
    3) Child class taki override eden eat() methoduna Overriding Method denir
       Parent calss taki override edilmis eat() methoduna Overriden Method denir
    4) private methodlar override edilemezler
    5) Child class daki methodun access modifieri parent class daki override edilmis (overriden) methodun
    access modifier indan dar olamaz. Aynisi olabilir, yada daha genis olabilir

    Overriden Method ==> protected -- Overriding Method ==> protected + public
    Overriden Method ==> default   -- Overriding Method ==> default + protected + public
    Overriden Method ==> private   -- Overriding Method ==> override olmazki access modifieri olsun
    (bakiniz 4. kural)

    6) Child class da override edilen methodun return type ile Parent class taki methodun return type i arasinda
    IS-A iliskisi varsa return type degistirilebilir

    7) Methodun return typei primitive ise Overriding yaparken return type degistirilemez. Cunku return type ya ayni olur
    veya parent tan secilir ama primitiveler arasinda parent - child iliskisi olmadigindan parent tan secmek
    soz konusu olamaz ve geriye tek secenek kalir oda ayni olmak

    8) Child da override edilen methodun return tyepi ile parent taki methodun return type i arasinda IS-A iliskisi
    yoksa return type degistirilemez, java bir wrapper classi digerinin childi yapmadigindan wrapper classlarda return type degistirilemez

    9) Methodun return type i void ise Overriding yaparken type degistirilemez
    yani void ise yine void olarak kalmak zorundadir

    10) static methodlar override edilemezler, Cunku static methodlar tum childlar icin ortak methodlardir
    Bir child bir ortak methodu degistirdiginde diger child lar bundan olumsuz etkilenebilir, bu nedenle
    java static methodlarin override edilmesine musaade etmez

    11) final methodlar override edilemezler, final methodlarin body si degistirilemez ama override ederken
    method body i degistiririz, bu bir celiski oldugundan java final methodlarin override edilmesine musaade etmez

           a) final keywordunu variable lar ile kullanabilirsiniz
                i) final variabllarda mutlaka deger atanmalidir
                ii) ilk atanan deger degistirilemez

           b)  final keywordunu Method lar ile kullanabilirsiniz
                i) method final ise methodun body si degistirilemez
                ii) method bodys degistirelemeyince override yapmak mumkün olmaz

           c)   final keywordunu class lar ile kullanabilirsiniz
                i) class final ise o classin childi olamaz

     12) Polymophism = Method Overriding + Method Overloading


     */

    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }
    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }

    public Integer multiply (Integer a, Integer b){
        return a*b;
    }

    public final double circleArea (double r){
        return 3.14*r*r;
    }


}
