package Oop18Tekrar;

public class StudentRunner {
    public static void main(String[] args) {


        Student ali = new Student();

        System.out.println("ali.getStdId() = " + ali.getStdId());

        System.out.println("ali.getNotOrt() = " + ali.getNotOrt());
        System.out.println("ali.isSuccesful() = " + ali.isSuccesful());
        System.out.println("====================");
        ali.setNotOrt(3.13);
        System.out.println("ali.getNotOrt() = " + ali.getNotOrt());

        ali.setSuccesful(false);
        System.out.println("ali.isSuccesful() = " + ali.isSuccesful());

        ali.setStdId("kC1234568");
        System.out.println("ali.getStdId() = " + ali.getStdId());


        System.out.println("=========================");
        ali.setNotOrt(4.13);
        System.out.println("ali.getNotOrt() = " + ali.getNotOrt());

        ali.setSuccesful(true);
        System.out.println("ali.isSuccesful() = " + ali.isSuccesful());

        ali.setStdId("VH1234568");
        System.out.println("ali.getStdId() = " + ali.getStdId());


    }
}
