package day09tekrari;

import java.util.Scanner;

public class WhileLoop01Tekrar {
    public static void main(String[] args) {

        // for (int i = 0; i < ; i++) {


    //for (Baslangic degeri; loop calisma kurali; Artirma Azaltma ) {
    // calisacak kodlar}


    //While loop
    // Baslangic degeri

    //while ( loop calisma kurali) {
    //calisacak kodlar
    //      Artirma /Azaltma
    // }

        for (int i = 3; i < 7; i++) {
            System.out.print(i);
        }
        System.out.println();
      //ikinci yol
       // While : oldugu müddetce anlamina gelir.
        int i=3; //Baslangic degeri
        while ( i<7) { //loop calisma kurali
            System.out.print(i); //Calisacak kodlar
            i++; //Artirma azaltma
        }

        System.out.println();
        //23'den 12'ye kadar olan tüm sayilari konsola yazdirin

        int k= 23;
        while (k>11){
            if (k%2==0){
                System.out.println(k);
            }

            k--;
        }
        System.out.println();
       //Bir carpim tablosu olustur 3'ün 10 kadri olani örnek yazdir.Kullanicinin verdigi rakamlar
        Scanner input = new Scanner(System.in);
        System.out.println("Carpimini istediginiz sayiyi girin lütfen");
       int num = input.nextInt();

       int j = 1;
       while (j<11){
           System.out.println(num+ "x" + j+ "=" + num*j);


       j++;
       }
        System.out.println();

//belli bir sayinin polidrom olup olmadigini kontrol ediniz. Polidrome 121<===>121  123321<==>123321

        int t =414;
        String m = String.valueOf(t); //
        String reversed = "";

        int n = m.length() -1;

        while (n>=0){
            reversed = reversed + m.charAt(n);
            n--;
        }
        System.out.println(reversed);

        if(m.equals(reversed)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not Palindrom");
        }



}
}
