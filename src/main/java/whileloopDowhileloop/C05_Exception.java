package whileloopDowhileloop;

public class C05_Exception {
    public static void main(String[] args) {
        printAge(63);


        try {
            printAge(-5);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }


    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }

    }

 /*
    throw keyword bir methodun body si icinde istedigimiz yerde, istedigimiz kosullar icin istedigiimz kadar Exception atmamizi saglar
    throw yazildiktan sonra bir Exception class objecti olusturulur
    Exception Class constructor inin parantezi icine istedigimiz Exception mesajini yazabiliriz

     */


}

