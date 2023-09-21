package day13tekrari;

public class methodCreation01 {
    public static void main(String[] args) {

        //Start 2.adim Buraya metod kol olustur (multiplay = Carp demektir)
        int carpmaSonucu = multiply (3,5);
        System.out.println("carpmaSonucu = " + carpmaSonucu);
//2 soru cözümü
        System.out.println("firstTwoMultiplyThirdAdd (2,3,4) = " + firstTwoMultiplyThirdAdd(2, 3, 4));
        // 3 soru cözümü
        print("Ali can");


    }//main methot kapanisi

    //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
    // Start 1.adim :Acces Modifier   +   retun type   +  Method ismi   +   ( burda lokal veriable tanimlanir)               +    {}
    // Uygulama baslangici { lokal veriable bu parentez icinde return koymaliyiz bu olusani calistiracak buna mini robot diyoruz}
    protected static int          multiply(int a, int b)                     {
                    return a*b;
    }
    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
      private static int firstTwoMultiplyThirdAdd (int a,int b,int c){
        return a*b+c;
    }

    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void print(String str ){

        System.out.println(str);
    }



    //Eger bir method yeni bir data üretmiyor ise return type i void olur
    //methodun return type i void ise method body icinde return keyword yazilmaz
    //Note : Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
    //      Method call da kullanilan degerlere Argumanlar "Arguments" denir




}//kalsa kapanis parantezi
