package day21map;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 77);
        stdAges.put("Veli", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Can", 58);

        //key tekrarli kullandigimizda hata vermez, en son verilen entry nin degerini kabul eder
        stdAges.put("Can", 18);
        System.out.println(stdAges);

        //replace() methodu value lari keyleri kullanarak update etmeye yarar
        stdAges.replace("Can",19);
        System.out.println(stdAges);

        //replace("Can",19,41); methodu map icinde key olarak Can var ise ve value su 19 ise 41 e donusturur yoksa donusturmez
        stdAges.replace("Can",19,41);
        System.out.println(stdAges);

        //putIfAbsent("AliCan",63); methodu mapte AliCan key olarak yoksa ekler varsa eklemez
        stdAges.putIfAbsent("AliCan",63);
        System.out.println(stdAges);

        //get methodu aranan key eger mapte var ise value u verir, yok ise null verir
        System.out.println(stdAges.get("AliCan"));//63
        System.out.println(stdAges.get("Alican"));//null

        //getOrDefault() methodu aranan key eger mapte var ise valu u verir yok ise istedigimiz degeri verir
        System.out.println(stdAges.getOrDefault("AliCan", 0));//63
        System.out.println(stdAges.getOrDefault("Alican", 0));//0

        //containsValue() methodu value larin icinde aranan bir degerin olup olmadigni kontrol eder
        System.out.println(stdAges.containsValue(63));
        System.out.println(stdAges.containsValue(163));

        //containsKey() methodu key lerin icinde aranan bir degerin olup olmadigni kontrol eder
        System.out.println(stdAges.containsKey("AliCan"));
        System.out.println(stdAges.containsKey("AliCaN"));

        //remove() methodu key kullanarak entry silmeye yarar
        stdAges.remove("AliCan");
        System.out.println(stdAges);

        //remove("Tom",76); methodu hem key hemde value yu kontrol eder eslesirse siler eslesmez ise silmez
        stdAges.remove("Tom",76);
        System.out.println(stdAges);

    }
}
