package Day08Sabah;

public class ForLoops01 {
    public static void main(String[] args) {
        //Example 1: Ekrana 5 kere "Hi" yazdiriniz

        //1. yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        /*
              for( Baslangic degeri ; Loopun calisma sarti ; Artirma/Azaltma      ){
            tekrarli bir sekilde yazmak istedigimiz kodlar
        }
         */

        //Baslangic degeri ; Loopun calisma sarti ; Artirma/Azaltma

        for( int i=1       ;         i<6                          ; i++        ) {
            System.out.println("Hi...");
        }

        //Example 2: 11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for(int i=11;         i<15;                 i++ ){
            System.out.println(i);
        }

        //Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=40; i>22  ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }
    }
}
