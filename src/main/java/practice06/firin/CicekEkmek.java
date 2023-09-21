package practice06.firin;

public class CicekEkmek extends BeyazEkmek{
    @Override
    public void sekil() {
        System.out.println("Cicek ekmek cicek seklindedir");
    }

    @Override
    public void tuz() {
        System.out.println("Cicek ekmek %1 tuz icerir");
    }
}
