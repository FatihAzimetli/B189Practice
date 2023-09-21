package day07sabah;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98


        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$", "");
        String newLaptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println(totalPrice);//1332.98

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "   ali cAN   " ==> AC
        String name = "   ali cAN   ";

        //trim()methodu bir Stringin bas ve sonundaki space leri siler, ortadakilere karismaz

        char first = name.trim().toUpperCase().charAt(0);
        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("" + first + last);

        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        //karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail

        //indexOf() methodu parantezi icerisine yazilan karakterin index ini verir

        //1. yol hard coding tavsiye edilmez
        String a = "abcde@gmail.com";
        System.out.println(a.substring(4, 9));//gmail

        //2.yol
        int startingIndex = a.indexOf("@") + 1;
        int endingIndex = a.indexOf(".");
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName);




    }
}
