package prakice05.inhertance01;

public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım

    //1- Parent class'da isim, soyisim adında static variable olusturalım
    protected static String isim = "Ali";
    protected static String soyisim = "Can";

    // 2- method1 ve method2 adında static methodlar olusturalım
    protected static void method1(){
        System.out.println("Parent calas method1");
    }
    protected static void  method2(){
        System.out.println("Parent class static metdhod2");
    }

    //3- yas adında instance variable olusturalım

    protected  int yas =30;
    //4- method3 ve method4 adında instance methodlar olusturalım
    protected void method3(){
        System.out.println("Parent class intance methot3");
    }
    protected void method4(){
        System.out.println("Parent");
    }




}
