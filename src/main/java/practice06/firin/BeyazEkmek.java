package practice06.firin;

public abstract class BeyazEkmek implements Ekmek{
    @Override
    public void un() {
        System.out.println("Beyaz ekmekler %59 un icerir");
    }
    @Override
    public void su() {
        System.out.println("Beyaz ekmekler %38 su icerir");
    }
    @Override
    public void maya() {
        System.out.println("Beyaz ekmekler %1,5 maya icerir");
    }
    public abstract void sekil();
}
