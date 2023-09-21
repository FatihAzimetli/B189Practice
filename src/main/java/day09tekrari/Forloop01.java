package day09tekrari;

public class Forloop01 {
    public static void main(String[] args) {

         /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        for (int i = 1; i < 5; i++) {
            System.out.println("Week :" + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("Day :"+ j);

            }
        }
        System.out.println();
         /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */

        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" x ");
            }
            System.out.println();

        }
        System.out.println();
        /* Bir fabrikadaki 3 atölye olusturun ve her atölyeye 5 is istasyonu olusturun*/

        for (int i = 1; i < 4; i++) {
            System.out.println("Aölye :" +i);
            for (int j = 1; j < 6; j++) {
                System.out.println("Is istasyonu :" +j);
            }
        }
        System.out.println();
        /* Bir fabrlkada 4 calisma ekibi olustur her ekibe 5 kisi ata*/

        for (int i = 1; i < 5; i++) {
            System.out.println("Ekip lideri : " + i);
            for (int j = 1; j < 6; j++) {
                System.out.println("Ekip üyesi :"+j);
            }
        }
        System.out.println();
        /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X O X L X M
                X O X L X M
                X O X L X M

    */

        for (int i = 1; i < 2; i++) {
            for (int j = 1; j <4; j++) {
                for (int k = 1; k < 4; k++) {

                }
                System.out.print("X O ");
                System.out.print("X L ");
                System.out.println("X M");

            }
            System.out.println();
        }
        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20

        double sayi=  28.587;
        int ondalikKisim = (int) (sayi*1000)%1000;
        int toplam = 0;
        while (ondalikKisim>0){
            int rakam = ondalikKisim%10;
            toplam +=rakam;
            ondalikKisim /= 10;

        }
        System.out.println("Verilen sayinin ondaliklar toplami :" + toplam);
        System.out.println();
//ikinci yol
        double num = 28.587;
        String sNum = String.valueOf(num);
       String ondalikSayi = sNum.split("[.]")[1]; // hafizaya "587" aldik
        //string tipinde olan ondalikli sayi üzerinde matamatiksel islem yapabilmek icin int'e cevirmeliyiz
        int intOndalikliSayi = Integer.valueOf(ondalikSayi);// burada simdi 587 var.
        int sum = 0;
        for (int i = intOndalikliSayi; i > 0; i=i/10) {
            sum = sum + i%10;

        }
        System.out.println("Verilen sayinin ondaliklar toplami = " + sum);
        System.out.println();

        //3 yol
        double number = 28.587;

        int decimalDigitSum = 0;
        int numberOfDecimalPlaces = 3; // Ondalık kısmın basamak sayısı

        for (int i = 0; i < numberOfDecimalPlaces; i++) {
            number *= 10; // Ondalık kısmı bir basamak sola kaydır
            int digit = (int) number % 10; // Ondalık kısmın bir basamak değerini al
            decimalDigitSum += digit; // Basamağı toplama ekle
        }

        System.out.println("Ondalık kısım rakamlarının toplamı: " + decimalDigitSum);
        System.out.println();














    }



}
