package day18oop;

public class StudentRunner {
    public static void main(String[] args) {



       Student s1 = new Student();
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        System.out.println("==============");
        s1.setStdId("KS6754354DS");
        s1.setNotOrt(4.4);
        s1.setSuccesful(false);
        System.out.println(s1.getStdId());

    }
}
