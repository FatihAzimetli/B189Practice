package day18oop;

public class Student {
    /*
    * /*
    Encapsulation ==>kapsulleme
    Encapsulation Nedir? Data hiding (veri saklama)
    Data nasil saklanir?
    Acces Modifierlarini private yaparak datayi diger classlardan gorunmez hale getirerek saklarim

    Encpasulation yaptigimiz data yi istersek diger classlardan okuyabiliriz
    Nasil okuyabiliriz?
    get method olusturarak encapsulate edilmis datanin degerini okuyabiliriz

    1) get methodlar public olur
    2) get methodun return type i okudugu variable in return type i ile ayni olur
    3) get method bir boolean variable icin olusturulduysa ismi is ile baslar

    Encpasulation yaptigimiz data yi istersek diger classlardan değistirebiliriz
    Nasil degistirebiliriz?

    1) set methodlari hep public olur
    2) set methodunun return type i hep void olur
    3) set method parametre kullanir, paramatre nin data type i variable ile ayni olur

    set method kullanarak varolan object uzerinde degisiklikler yaparak o objecti sanki yeni bir
    object mis gibi kullanabiliriz

    //getter ve setter larin ikisine birden "java beans" denir.



     */



     public int age =15;
    private String stdId = "AC23255566777";
    public String stdName = "Ali Can";

    private double notOrt =3.13;

    private boolean succesful = false;

    public boolean isSuccesful() {

        return succesful;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public String getStdId() {
        return stdId;
    }
}
