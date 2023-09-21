package Day04ScannerIncrementDecrementIfstatamentsTk;

public class ifStatements01 {
    public static void main(String[] args) {
        /*
         * if statements
         * bazi kodlarin bazi sartlara göre aktive edebilmek icin if statemens kullanilir
         * örne e-mail giris sifresi bu kod ile calisir
         * if ingilizcede eger demektir
         * statements ifade, hüküm bildiren cümle demektir
         * örnek sayi -1 ile 10 arasinda ise ekrana rakam yazdirin*/

        //if you study hard , you will learn java. ===> english

        //if (you study hard){
        //you will learn java  ===> Java'ca
        //}

        // Örnek sayi: -1 ile 10 arasinda [(rakam>-1 && rakam<10) Java dili]ise ekrana rakam yazdirin

        int rakam = 3 ; // senaryo girdisi




        if(rakam>-1 && rakam<10){
            System.out.println("Rakam");
        }

        //Örne sayi üc basamakli ise ekrana 3 basamaklidir yazdirin degilse hatali giris yazdirin
        int sayi = -125;
        if(sayi>99 && sayi<1000){
            System.out.println("Sayi Üc basamaklidir");
        }else{
            System.out.println("Hatali rakam");
        }








    }
}
