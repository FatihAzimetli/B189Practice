package prakice05.inhertance01;

public class Baby extends Child{
    int kilo=45;

    public static void main(String[] args) {
        method1();
        method2();
        System.out.println("soyisim = " + soyisim);
        System.out.println("isim = " + isim);
        Baby obj3 = new Baby();
        obj3.method3();
        System.out.println("obj3.yas = " + obj3.yas);
        System.out.println("obj3.kilo = " + obj3.kilo);

        Child obj4 = new Child();
        System.out.println("obj4.yas = " + obj4.yas);

    }
}
