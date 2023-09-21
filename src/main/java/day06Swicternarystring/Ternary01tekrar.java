package day06Swicternarystring;

public class Ternary01tekrar {
    public static void main(String[] args) {

        /* Bir sayinin mutlak degerini hesaplayan kodu yazin
        * -4 ==> -1x4    4==4     0==0*/

int c = 0 ;

int result = c < 0 ? -1 * c : c;
        System.out.println(result);

        /*
        * iki sayinin isareti ayni ise bu sayilari carpan
        * isaretleri farkli ise bu sayilari carpamiyorum
        * mesaji veren kodu yazdirin*/

        int a=3;
        int b = -5;
        Object result2 = (a>0 && b>0) || (a<0 && b<0) ? a*b : "Bu sayilari Carpamiyorum";
        System.out.println(result2);

        int a1 = -3 ;
        int b1 = -2 ;
        int c1 = -12;

        int result3 = (a1<0 && b1<0 && c1<0) || (a1>0 && b1>0 && c1>0) ? a1*b1*c1 : a1+b1+c1 ;
        System.out.println(result3);

        /*size verilin bir sayini üc basamakli olup olmadigini kontrol eden kodu yaziniz*/

        int d = 66;

        String result4 = d>99 && d<1000 ? "Üc bamaklidir" : "üc basamakli degildir";
        System.out.println(result4);

        int e =77;

        String result5 = (e>9 && e<100 ) || (e>99 && e<100 ) ? "Ikibasamakli sayi" : "Üc basamakli sayi";

        System.out.println(result5);
        /*
        * Verilen zilin @Artik yil (leap Year) olup olmadigini kontrol eden kodu yazin
        * yil 100'e bölünüyorsa 400'ede bölünmelidir
        * yil 100 bölünüyorsa 4'ede bölünmelidir
        *  c   ?  t   :    f ; || c ?   t  :  f  ; */

        int y= 1884;
        String reault6 = y%100==0 ? y%400==0 ? "Leap" : "not leap" : y%4==0 ? "Leap": "not leap";

        System.out.println(reault6);











    }
}
