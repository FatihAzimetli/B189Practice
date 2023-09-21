package prakice05.inheritance02;

public class Corsa extends Opel{
    String hiz="Corsa max 200 km hız yapar";

    String yakit="Corsa arabalar benzinli veya elektriklidir";
    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakıt tuketir");
    }

    protected void vitesSayisi(){
        System.out.println("Corsa arabalar 5 viteslidir");
    }

    public static void main(String[] args) {

        Corsa arb1 = new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//araba
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//corsa
        System.out.println("arb1.marka = " + arb1.marka);//opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//opel
        System.out.println("arb1.model = " + arb1.model);//corsa

        arb1.motor();//corsa

        Opel arb2 = new Corsa();//bir opel objesi olusturduk
        System.out.println("arb2.hareket = " + arb2.hareket);//araba
        System.out.println("arb2.hiz = " + arb2.hiz);//opel
        System.out.println("arb2.yakit = " + arb2.yakit);//araba
        System.out.println("arb2.marka = " + arb2.marka);//opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//opel

        arb2.motor();//corsa
        /*
        inheritanceda variablelar;
        aramaya data turu ne ise oradan baslanır,
        yoksa parenta bakılır ve
        ilk buldugu yerden getirilir

        inheritanceda methodlar;
        aramaya data turu ne ise oradan baslanır,
        yoksa parenta bakılır,
        ilk buldugunu GETIRMEZ,
        constructorun oldugu classa kadar override edilmiş mi diye kontrol edilir
        son buldugunu getirilir
         */
        //arama her zaman asagıdan yukarı dogrudur
        //override kontrol her zaman yukarıdan asagı dogrudur
        arb2.garanti();//opel
        arb2.yakitTuketimi();//corsa

        // arb2.vitesSayisi()  CTE
        //arb2.model Cte

        Araba arb3 = new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);//araba
        System.out.println("arb3.hiz = " + arb3.hiz);//araba
        System.out.println("arb3.yakit = " + arb3.yakit);//araba
        System.out.println("arb3.marka = " + arb3.marka);//araba
        // arb3.sirketMerkezi Cte

        arb3.yakitTuketimi();//corsa
        arb3.motor();//corsa
        //arb3.garanti() CTE

        Araba arb4 = new Opel();
        System.out.println("arb4.hiz = " + arb4.hiz);//araba
        System.out.println("arb4.yakit = " + arb4.yakit);//araba
        System.out.println("arb4.marka = " + arb4.marka);//araba

        arb4.yakitTuketimi();//araba
        arb4.motor();
        //arb4.garanti()  CTE


    }
}
