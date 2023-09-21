package day03wrapperconcatenation;

public class Operators {
    public static void main(String[] args) {
        /*
        * java matamatikse islem sirasi
        * */

        int kisiSayisi = 10;
        int paraMiktari = 25;
        System.out.println(paraMiktari/kisiSayisi); // 2

        int ögrenciSayisi = 10;
        double ucretMiktari = 25;
        System.out.println(ucretMiktari/ögrenciSayisi); // 2,5 sonuc büyük data tipi olur

        //logical operatör and (&&)
        /*  CAY         AND       KAHVE         SONUC
        *    true       &&        false          false
        *    false      &&         true          false
        *    false      &&         false         false
        *    true       &&         true          true       */ //mükemmeliyet


        //logical operatör   0r (||)
        /*    CAY      OR       KAHVE       SONUC
         *    true     ||       false     true
         *   false     ||       true     true
         *   false     ||       false    false
         *   true      ||       true      true    */ //Poliana


        //logical operatör   NOT (!) anlam olarak degil
        /*     NOT         SONUC
         *    !true    ==>   false
         *    !false   ==>    true
         *    !!true   ==>     true
         *    !!false  ==>     false   */

        // Comparison  (Karsilastirma
        /*     sebol          SONUC
         *       <            kücük
         *       >            büyük
         *     <=            kücük esit
         *     >=            büyük esit
         *     ==            esit
         *     !=            esit degil
         *       */

        // Karsilastirma operatörleri boolean sepetine konur

        boolean birinciSayi = 3<5 ; // true

        boolean ikinciSayi =  2+3  != 5 ; //false

        boolean ucuncuSayi = 2+3*5  >= 20; //false

        System.out.println(birinciSayi && ikinciSayi); //false
        System.out.println(birinciSayi || ikinciSayi || ucuncuSayi); // true
        System.out.println(birinciSayi && ikinciSayi || ucuncuSayi); //false
        System.out.println(birinciSayi && !ikinciSayi || ucuncuSayi); //true








    }
}
