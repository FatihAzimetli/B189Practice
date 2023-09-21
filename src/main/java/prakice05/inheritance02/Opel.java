package prakice05.inheritance02;

public class Opel extends Araba{


String hiz="Opel arabalar max 220 km hız yapar";
    String marka="Opel";
    String sirketMerkezi="Almanya";
    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanırlar");
    }
    protected void garanti() {
        System.out.println("Opel arabalar 2 yıl garantilidir");
    }



}