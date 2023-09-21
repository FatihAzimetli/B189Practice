package day21map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        /*
        1) Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Map ler deki her bir elemana entry denir, tamamina ise EntrySet denir
        4) Entry ler tekrarsiz oldugu icin entry set denilir
        5) Key ve valuelar ayri ayri data type larinda olabilirler
        6) Map ler collection degildir, farkli bir yapidir
        7) HashMap ler entry leri rastgele siralar, bu yuzden en hizli map dir
         */

        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map e entry nasil eklenir?
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Italy",40000000);
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Turkiye",83000000);
        countryPopulation.put("Netherland",18000000);
        System.out.println(countryPopulation);

        //get() methodu key ile calisir ve value kismini verir
        Integer turkiyePopulation= countryPopulation.get("Turkiye");
        System.out.println(turkiyePopulation);
        //Butun key leri nasil alabilirim?
        Set<String> keys= countryPopulation.keySet();
        System.out.println(keys);
        //Butun value lari nasil alabilirim?
        Collection<Integer> values=  countryPopulation.values();
        System.out.println(values);

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

        int sum=0; //kavanoz
        for (Integer w: values) {
           sum= sum+ w;
        }
        System.out.println("sum = " + sum/ values.size());

        //entrySet() methodu mapteki entry leri kalip halinde alip Set in icine koyarak verir
        //loop lar map ler ile kullanilamaz, bunun icin entryset methodunu kullanarak mapin key value olan entry lerini bir setin icine koyariz
        Set<  Map.Entry<String,Integer>   > entries = countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Italy=40000000, Germany=83000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int toplam = 0;

        for (Map.Entry<String,Integer> w:entries) {
           toplam = toplam+ w.getKey().length()+ w.getValue();
        }
        System.out.println(toplam);





    }
}
