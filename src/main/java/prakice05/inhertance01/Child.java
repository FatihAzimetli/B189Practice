package prakice05.inhertance01;
// 5-olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım
public class Child extends Parent{


    int yas =10;

    public static void main(String[] args) {
        Parent.method1();
        method1();
        method2();

        //statik verablere nasil ulasilir bular class adi ile oldugu icin geldiler
        System.out.println("Parent.isim = " + Parent.isim);
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim ="Veli";
        System.out.println("isim = " + isim);

        //intence datalara ulasmak icin obje olusturmak gerekiyor

        Child obj1= new Child();
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas);

        //prent objrsi olusturma prentten aldigimiz icin yas 30 geldi
        Parent obj2 = new Parent();
        System.out.println("obj2.yas = " + obj2.yas);
        obj2.method3();
        obj2.method4();


    }


}
