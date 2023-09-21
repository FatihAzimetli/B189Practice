package day23exceptions;


public class ExceptionRunner {

    public static void main(String[] args)  {
        getStudentGrade(115);

/*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()

     */

    }
    public static void getStudentGrade(int grade)  {
        if(grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Studens grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }else {
            System.out.println(grade);
        }

    }

}