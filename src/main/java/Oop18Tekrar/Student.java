package Oop18Tekrar;

public class Student {




    public  String stdName = "Ali Can";
    public int age = 17 ;

    private String stdId = "AC1234567";
    private double notOrt = 3.87;
    private boolean succesful = false;


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

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
}
