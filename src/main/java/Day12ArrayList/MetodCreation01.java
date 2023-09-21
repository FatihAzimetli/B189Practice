package Day12ArrayList;

public class MetodCreation01 {
    public static void main(String[] args) {


         /*
        Java da method nasil olusturulur?
        ==>main methodun disinda classin icinde olusturulur
        1)Acces Modifier + return type + Method ismi + () + {}

         */


        //ornek 1 :toplama islemi yapan bir method olusturunuz

int sonuc = toplamaYap(13,12);
        System.out.println(sonuc);



    }//Mein metod kapanisi

public static int toplamaYap(int a, int b){
        return a+b;
}




}//Klas kapanisi




