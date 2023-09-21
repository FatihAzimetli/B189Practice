package practice06.superthis;

import practice06.C01Encapsulation;

public class C02Encapsulation {


    public static void main(String[] args) {
        //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        C01Encapsulation obj1=new C01Encapsulation("ali","Can",-25);
        System.out.println(obj1.getIsim());
        System.out.println(obj1.getSoyisim());
        System.out.println(obj1.getYas());
        System.out.println(obj1);

        //objenin yasını 30 olarak guncelleyin
        obj1.setYas(30);
        System.out.println(obj1.getYas());

        //parametresiz cons kullanarak 2. bir obje olusturun
        C01Encapsulation obj2=new C01Encapsulation();
        System.out.println(obj2);

        //Ayse, Yilmaz, 40 degerlerini atayın
        obj2.setIsim("Ayse");
        obj2.setSoyisim("Yilmaz");
        obj2.setYas(40);

        System.out.println(obj2);


        //yas ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2.getYas());
        //yas negatif deger alamayacak sekilde set methodunu guncelleyin
        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        obj2.setIsim("ayse");
        System.out.println(obj2);
        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin


    }

}