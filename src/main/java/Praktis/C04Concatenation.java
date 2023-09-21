package Praktis;

public class C04Concatenation {
    public static void main(String[] args) {
        /*
         * 2 tane string, 2 tane int data türünde variable olusturun
         * String str1 = "Java"
         * String str2 = "Güzel"
         * int sayi1 = 5;
         * int sayi2 = 3;
         * Java5Güzel yazdirin
         * 8Java yazdirin
         * 2Güzel15 yazdirin
         * Java22 yazdirin
         * 53Güzel yazdirin*/


        String str1 = "Java" ;
        String str2 = "Güzel";
        int sayi1 = 5;
        int sayi2 = 3;

       // Java5Güzel yazdirin
        System.out.println(str1+sayi1+str2);

        //8Java yazdirin
        System.out.println(sayi1+sayi2+str1);

        //2Güzel15 yazdirin
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //Java22 yazdirin
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53Güzel yazdirin
        System.out.println(""+sayi1+sayi2+""+str2);
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(sayi1+""+sayi2+str2);




        //Java8Güzel yazdirin
        System.out.println(str1+(sayi1+sayi2)+str2);

        //java88güzel

        System.out.println(str1+(sayi1+sayi2)+""+(sayi1+sayi2)+str2);












    }//metod sonu
}//kalas sonu
