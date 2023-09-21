package day22map_exception;

public class E01 {

    public static void main(String[] args) {
        /*
        Exception beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda exception class i devreye girer
        Exception class i bize karsilasilan sorunun cinsini ve bu sorunun nereden kaynaklandigini ve sebebiin bildirir
        Java exception firlattiginda kodun calismasini durdurur, ve bizden bir karar vermemizi ister.
        Kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodlarimizi try catch blogu icinde yazmaliyiz

        Exception i handle edebilmek icin iki temel yol vardir
            a) Exception icin gereksinimlere göre (FRD) uygun cozumler uretebilirisiniz. Buna Exceptin Handling denir
                bunu try catch kullanarak yapabiliriz,
                try block da yapilmasi gereken islemi javadan isteriz, java islemi problemsiz bir sekilde yaparsa catch block aktive olmaz
                try block da java yapilmasi istenen seyi yaparken exception ile karsilasirsa catch block devreye girer ve catch block icindeki kodlar calisir
                try block da islem yapilirken Exception olusursa try block icindeki exception dan sonraki kodlar calistirilamaz
            b) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada Throw Exception denir

            catch satirinda ki parantez icine karsilasilmasi muhtemel olan exception class isimini ve bir object (e) yazariz


        =>Yazdiginiz kod calismadiginda problemi bulmak icin loglara bakariz
         */
        divide(12, 3);
        divide(12, 0);

        divide2(5,1);

    }
    //ArithmeticException yazdiginiz code da matematiksel bir islem kullaniyorsaniz alinabilecek bir Exception dir
    public static void divide2(int a, int b) {
        try{

            System.out.println(a / b);
            System.out.println("try ici görev tamamlandi");

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }
        System.out.println("try-catch sonrasi görev tamamlandi");
    }


    //Kesinlikle tavsiye edilmez
    public static void divide(int a, int b) {

        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }


}
