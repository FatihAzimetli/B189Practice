package day03wrapperconcatenation;

public class WrapperClass {
    public static void main(String[] args) {

        /*
        *Wrapper Class :
        * Java primiti datalara faydali metodlar ekleyerek yeni yapi olusturmustur bunlara  bunlara wrapper clas denir*/

        // primitivler : byte    short     int        long   float   double  char        boolean //hepsi metodsuzdur
        // Wrapper Class: Byte   Short     Integer    Long   Floag   Double  Charekter   Boolean  // simirsiz metodlar icerirler

        int     n = 12;


        Integer m = n;

        // Örnek primitivi int' wrapper Integera cevirin otoboxing

        int num = 13;
        Integer wrapperNum = num ;

        // non primittv olan bir yapinin tersine cevrilmsi unboxing

        Byte num1 = 5;

        byte unBoxing = num1 ;




    }
}
