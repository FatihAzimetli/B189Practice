package Overloading;

public class C02_telefon {
    String marka;
    String model;
    int depolama;
    String renk;
    C02_telefon(String marka){
        this.marka=marka;
    }
    // C02_telefon(String model){
    //     this.model=model;
    // }

    C02_telefon(String marka,String model){
        this.marka=marka;
        this.model=model;
    }

    C02_telefon(String marka,String model,int depolama){
        this.marka=marka;
        this.model=model;
        this.depolama=depolama;
    }
    C02_telefon(String marka,String model,String renk){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
    }
    C02_telefon(String marka,String model,String renk,int depolama){
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        this.depolama=depolama;
    }

    @Override
    public String toString() {
        return "C02_telefon{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", depolama=" + depolama +
                ", renk='" + renk + '\'' +
                '}';
    }
}
