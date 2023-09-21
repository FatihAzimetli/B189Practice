package day04scannerinrementdecrementifstetemens;

public class IfStatements01 {
    public static void main(String[] args) {

        //Ornek : Sayi -1 ile 10 arasinda ise ekrana "Rakam" Yazdirin

        int number = 3;



        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        //Örnek 2: Rakam degeri -66 ile 318 arasinda ise kirmiz elma yazdir

        int rakam = 92 ;



        if(rakam>-66 && rakam<318){
            System.out.println("Kirmizi Elma");
        }
        //sAYI üc basamakli ise ekrana üc basmakli yazdirin
        int n= 869;

        if(n>99 && n<999){
            System.out.println("Üc bamaklidir");
        }


    }
}
