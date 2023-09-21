package day15Stringbuilderacessmodifier;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1) StringBuilder classi da string üreten bir classtir
        2) "String" class kullanarak string üretiriz, java nicin StringBuilder Classi da olusturdu?
            => String class "immutable" ( degistirilemez) string üretir
            => StringBuilder class "mutable"( degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir
         */

        //Immutable
        String s = "Java";
        String t = s + "x";
        String w = t + " ? ";

        /*
        String i degistirdikten sonra ayni string e assign ederseniz, java yine yeni bir container olusturur
        degisimis degeri bu container in icine koyar ve eski container i gosteren pointer artik yeni container a yönlendiriliir
        Dolayisiyla eski container adressiz kalir ve "Garbage collector" adressiz olan containerlari siler
         */
        String a = "money";
        a = a + " more ";


        //Mutable
        //StringBuilder kullanarak string üretmenin 1. yolu
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1);

        //StringBuilder kullanarak string üretmenin 2. yolu

        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("java");
        sb2.append("xxxxxxxxxxxxxxx");

        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34


        //capacitiy ve lentgh arasindaki fark nedir?
        /*
        capacity javanin size verdigi data depolama yer sayisidir,
        Length ise size verilen data depolama yerinin kullanilan kismidir

        java baslangic olarak size capacity i 16 olarak verir, siz verilen capacity i asarsaniz
        java yeni capacity i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
        16 ==> 16*2+2  -- 34 ==> 34*2+2
         */
        //StringBuilder kullanarak string üretmenin 3. yolu
        //Default capcityi nasil degistirebilirz?

        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");

    }
}
