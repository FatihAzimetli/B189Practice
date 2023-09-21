package day23exceptions;

public class E03 {

    public static void main(String[] args) {
        /*
        1) Exception olsda da olmasa da calistirmamiz gereken kodlari finally block icine yazariz
        2) Database ile baglantiyi kesme icini yapan kodlar gibi kodlar her halukarda calistirilmalidir
        dolayisiyla bu tarz kodlari finally block icine yazariz
         */

        int a = 12;
        int b = 1;
        int c[] = {1, 2, 3, 4, 5};
        getNumberFromIntArray(c,a,b);

    }
    public static void getNumberFromIntArray(int[] c, int a, int b) {
        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the database");
        }

       /*
       1)try tek basina kullanilamaz,  try + 1 catch olur - try + cok catch olur
         try catch block olmadan sadece finally ile de kullanilabilir
         try ile coklu catch ve finally block kullanilablir
       2) Coklu finally block kullanilamaz
        */

    }


}