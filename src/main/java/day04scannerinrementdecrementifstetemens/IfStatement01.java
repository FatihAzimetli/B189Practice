package day04scannerinrementdecrementifstetemens;

public class IfStatement01 {
    public static void main(String[] args) {
        /*
        * if statements
        * bazi kodlarin bazi sartlara göre aktive edebilmek icin if statemens kullanilir
        * örne e-mail giris sifresi bu kod ile calisir
        * if ingilizcede eger demektir
        * statements ifade, hüküm bildiren cümle demektir
        * örnek sayi -1 ile 10 arasinda ise ekrana rakam yazdirin*/

        int number = 3;


        if(number>-1 && number<10) {

            System.out.println("Rakam..");
        }
        /*
        * örnek sayi 3 basamakli ise "Sayi üc basmaklidir !" yazdirin*/

        int n = 767;

        if (n>99 && n<1000){

            System.out.println("Sayi üc Basmaklidir..");
        }


    }
}
