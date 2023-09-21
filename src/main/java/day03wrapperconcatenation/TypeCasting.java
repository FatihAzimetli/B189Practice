package day03wrapperconcatenation;

public class TypeCasting {
    public static void main(String[] args) {
        // numerik data typ'larin birbirine dönüstürülmesine Type Casting denir
        /* Sayi konulacak data tipleri
        * byte      short       int      long    float     double
        * sirasi ile büyükten kücüge kapasam yapar yani icine alir buna AUTO WIDENNIG denir
        *
        * Tam tersi yapilirsa buna aciktan daraltma yapmaktir buna  EXPLICIT NARROWING  denir*/


        //  Explicity Narrowing

        int sayi = 313;
        short sayi1 = (short) sayi ; // daratma icin essaymet opreratörden sonra paranteze ayni datayi yazmamiz yeterli
    }
}
