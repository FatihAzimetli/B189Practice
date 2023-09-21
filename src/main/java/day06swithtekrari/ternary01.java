package day06swithtekrari;

public class ternary01 {
    public static void main(String[] args) {
        int y = 112;
        System.out.println((y>5)?(21):("Zebra"));

        System.out.println((y<91)?(9):"Horse");
        System.out.println();

        int a =11;
        int z =11;
        int result = a<10 ? a++:z++;
        System.out.println(result + "\n,"+a+"\n,"+z);

        // Bir sayinin mutlak degerini hesaplayan kodu yazdir
        // kullanicin verdigi deger negatif ise -1 ile carpilarak mutlak deger verir pozitif ise oldgu gibi alinir
        //condation ? true : false ;

        int c = 4;

        int sayi = c<0 ? -1*c : c ;
        System.out.println(sayi);

        //iki sayinin isaret ayni ise bu sayilari carpan
        //farkli isaretli ise farkli sayilari carpamiyorum mesaji vren kodu yazdirin

        int k= 3;
        int l = 4;
       Object resault = (k<0 && l<0) || (k>0 && l>0) ? k*l : "Farkli isaretleri carpamiyorum";
        System.out.println("resault = " + resault);


    }
}
