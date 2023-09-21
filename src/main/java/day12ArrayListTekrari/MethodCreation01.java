package day12ArrayListTekrari;

public class MethodCreation01 {
    public static void main(String[] args) {
           /*
        Java da method nasil olusturulur?
        1 main methodun disinda classin icinde olusturulur
        2-Acces Modifier + return type + Method ismi + () + {}
        3- Olusturulan methot nasil kullanilir
             a) Methot olusturmak Metodu calistirmak icin yeterli degildir
             bunun icin metod kol olusturulur yani main metodun icine örnek toplamYap(3.5) gibi

         */
       // (Bu alan mein methot calisma alanidir.)
        int sonuc = toplamaYap(3,5);// bu islemin adi methot koldur
        System.out.println("sonuc = " + sonuc);


    } //main metod sonu
    //ornek 1 :toplama islemi yapan bir method olusturunuz
    public static int toplamaYap (int a, int b) {
        return a+b;
    }


}
