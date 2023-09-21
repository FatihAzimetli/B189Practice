package day07sabah;

public class StringManupilation04 {
    public static void main(String[] args) {

        /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.   */

        String pwd = " a ";

        // i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
        // pwd.isEmpty() bir string eger tamamen bos ise yani hic karakter icermiyor ise true verir, aksi halde false verir

        boolean first = pwd.isEmpty();
        // System.out.println("first = " + first);

        // ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
        //isBlank() methodu sadece space iceren Stringler icin true verir., space dısında bir character icerirse false verir.

        boolean second = pwd.isBlank();
        //   System.out.println("second = " + second);

        /*
         isBlank() methodu bos stringler icinde true verir
        isBlank() ==> sadece space var ise  ve hicbirsey yok ise true verir
        isEmpty() ==> sadece hicbirsey icin true verir.,
         */

        // iii) Başında ve sonunda boşluk olmamalıdır.

        boolean third = pwd.trim().equals(pwd);
        // System.out.println(third);



        if(first){
            System.out.println("Parola bos birakilamaz..!");
        }

        if(second){
            System.out.println("Parolada bosluk haricinde gorunur karakterler de bulunmalidir");
        }

        if(!third){
            System.out.println("Parola basinda yada sonunda bosluk birakilmamalidir");
        }


        //memory kullanimi

        /*
        String lerin esitliklerini kontrol ederken "==" yerine equals kullaniriz
        cunku == sembolu kullanirsaniz, iki string i karsilastirirken hem adresslerini hemde degerlerini kontrol eder
        eğer her ikiside esit ise esittir der.


        equals() methodu ise iki string i karsilastirirken sadece degerlerine bakar, degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der

         */






    }
}
