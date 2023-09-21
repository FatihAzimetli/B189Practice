package practice06.firin;

public class KepekliEkmek implements Ekmek{


    @Override
    public void un() {
        System.out.println("Kepekli ekmek %50 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Kepekli ekmek %38 su içerir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmek %1,5 maya içerir");
    }

    @Override
    public void tuz() {
        System.out.println("Kepekli ekmek %1,5 tuz içerir");
    }
    public void kepek(){
        System.out.println("Kepekli ekmek %9 kepek içerir");
    }
    public void sekil(){
        System.out.println("Kepekli ekmek yuvarlaktır");
    }
}
