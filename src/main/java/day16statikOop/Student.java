package day16statikOop;

public class Student {

    /*
       1) static variable veya static methodlar (class member) tum object ler icin ortak elemandir.
       2) static class memberlar uzerinde yapilan degisiklikler tum objectleri etkiler
       3) static class memberlar class'a, non-static class memberlar objectlere monte edilir.
           Mesela bir classdan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
           ama static  olanlar object sayisindan bağimsiz olarak bir kere olusturulur.
       4) static class memberlara ulasmak icin object olusturmaya gerek duyulmaz, ama non-static class memberlara
            ulasmak icin object olusturmak sarttir.
       5) static variable larin diger adi class variabledir, non-static variable larin diger adi instance variable
           yada object variable dir
        */
    public static String stdName ="Ali Can";
    public int age =18;
    public static void staticMethod(){
        System.out.println("Ben static methodum");
    }
    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }


}
