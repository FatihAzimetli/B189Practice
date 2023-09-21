package day19oopNt;

public interface Ac {
    /*
  1) Bir interface i bir classin parenti yapmak icin implements keywordunu kullaniriz
  2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen multiple parent a
  ihtiyac duyariz. Bu ihtiyaci gidermek icin java interface isimli yeni bir yapi olusturdu
  3) interface lerin icine concrete method konulamaz, cunku concrete methodlarda body vardir ve body
  o methodun isi nasil yapacağıni belirtir. Isini nasil yapilacaği bircok detay icerir buda child classlarda
  kafa karisikligina sebep olur. halbuki sadece yapilmasi gereken isi söyleyip nasil yapilacağıni childa birakirsaniz
  child classin kafa karisikligini engellemis olursunz
  4) interfacelerdeki tum methodlar otomatik olarak public dir abstract tir static degildir
  5) interfacler concrete method icermezler, dolayisiyla interface icindeki hicbirsey istege bagli degildir,
  hersey chlid classlar icin mecburidir. Bu yüzden interfaceler "to-do-list"denir
  6) Coklu interface parent larin herbirini icine ayni isimde methodlar koyabiliriz
  Mesela run() methodunu koymak gibi
  Child class herhangi birini override ettiginde hepsini override etmis gibi olur sonrada body yi child classa yazarak
  uygulamasini yapmis olur
  7) interface lerdeki tum variablelar otomatik (default)olarak  public tir, static tir ve finaldir
     final oldugu icin interface icindeki variable i mutlaka initialize yapmalisiniz
     interfacelerde variable cagirirken interface ismi kullanilarak cagrilir cunku bu hem static
     olamanin geregidir hemde okunurlugu artirir
  8) Nomalde interface icine concrete method konulamaz ama bazi ozel durumlarda concrete method koymamiz gerekirse
      a) default keyworud kullanarak interface icine concerete method koyabiliriz
      b) static keywordunu kullanarak interface icine concerete method koyabiliriz
         ==> static keywordunu kullanarak olusturdugumuz concrete methodlara ulasmak icin object olusturmaya gerek yoktur
          interface ismi yeterlidir
         ==> default keywordunu kullanarak olusturdugumuz concrete methodlara interface in child classindan object olusturarak
         ulasilabilir
  9)interface lerden object olusturulamaz. interfacelerin constructorlari yoktur

         Child        Parent
         class        class       ==>   extends
         interface    interface   ==>   extends
         class        interface   ==>   implements
         interface    class       ==>    olamaz

  interview sorusu
  Abstract class ile interface arasindaki farklar nelerdir?
  1) Abstract classlar lem abstract hemde concrete methodlar icerebilir fakat interfaceler sadece abstract method icerir
      Ama interfacelerde istersek default ve static keywordlerini kullanarak concrete method olusturabiliriz

  2) Abstract classlar multiple inheritance i desteklemez ama interfaceler destekler

  3) Abstract classlar icinde herturlu variable olusturulabilir, interfaceler icindeki variable lar
  public, static, ve final olmak zorundadir.

  4) interfacelerde constructor yoktur, abstract classlarda constructor vardir, her ikisindende object uretilemez

  5) interface classin childi olamaz ama abstract class classin childi olabilir

   */
    public abstract void cool();
    void run();

    int price =2000;

    default void eco(){
        System.out.println("Uses gas less");
    }
}
