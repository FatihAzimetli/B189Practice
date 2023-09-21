package Dey08loopsOgledenSonra;

public class ForLoops01 {
    public static void main(String[] args) {
        //Ornek : Ekrana 5 kre "Hi.." yazdirin


        //1.yol
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi.."); //asla tavsiye edilmez
        //2.Yol
        //1-  for loop

        //for ( Baslangic degeri ; loop calisma sarti ; Artirma / Azaltma ) { burayada tekrarlanmasi gereken kodlar yazilir}
        for (int    i=1           ;  i<6               ;      i++        ){
            System.out.println("Hi........");
        }

        //Example:  11'den 14'e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for (int i = 11; i <15 ; i++) {
            System.out.println(i);

        }


        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 41; i >22 ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }


    }
}
