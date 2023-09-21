package StatikOopTekrar;

public class StdRunner {
    public static void main(String[] args) {
        System.out.println("Student.stdName = " + Student.stdName);


        Student ali = new Student();
        System.out.println("ali.age = " + ali.age);


        Student.staticMethod();

        ali.nonStaticMethod();


    }
}
