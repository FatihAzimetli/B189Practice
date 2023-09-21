package day19oopNt;

public abstract class Courses {
    //Abstraction
    /*
    1) Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece child classlarin
    yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak "Abstraction" yapariz
    2) Bazen parent classdaki methodun bodysi hicbir chid class tarafindan kullanilmaz. Bu durumda
    parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir. Bizde o methoda body yazmayiz
    3)Methodun bodysini silince java bize hata verdi.bizde abstract keywordunu kullanarak javaya bu methodun
    bodysi olmayacak deriz
    4)abstract keywordunu kullaninca elde ettigimiz abstract method normal claslara konulamaz, oyüzden
    classida abstract yapmaliyiz
    5) Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yüzden tum childlar icin mecburi olmasini istedigimiz methodlari abstract yapariz
    6) Bodysi olan methodlar (concrete method) abstract classlarin icine yazilabilir. Abstract methodlar
    concrete classlarin icine yazilamazlar. Concrete methodlar child classlar tarafindan override edilmek
    zorunda degildir
    7) Abstract keyword ile method body bir methodda ayni anda kullanilamaz
    8) final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
    override edilmek icin olusturulurlar. Bu celiskidir bu nedenle java abstract methodlarin final olamsina
    müsaade etmez
    9) Abstract classlarin icinde abstract methodlar olur, abstract methodlarin bodysi olmadigindan eksik methodlar
    gibi düsünülebilir. Dolayisiyla bu eksik yapi barindiran kaliptan eksik bir obje üretilmesini engellemek icin
    java abstract classlardan object olusturulmasina müsaade etmez
    10) Abstract classlarin constructorlari vardir, ama object olusturamazlar
    11) Abstract classin abstract childi veya concrete child i olabilir. Eger child abstract ise abstract methodlari
    override etmek zorunda degildir
    12) Abstract methodlar private olamazlar cunku child classlar abstract methodlari kullanirlar, private yapinca
    kullanima kapali olur ve bu celiskiden dolayi java abstract methodlarin private olmasina
    musaade etmez
    13) Classlar final oldugunda child classa sahip olamazlar ama abstract classlar icin child olmalidir
    cunku child classlar abstract parent classdaki abstract methodlari kullanirlar bu nedenle
    java abstract classlarin final olmasina müsaade etmez
​
     */


    public abstract void math();
    public void art(){
        System.out.println("Learn art");
    }
    // public final abstract void science();

        //private abstract void sum();





}