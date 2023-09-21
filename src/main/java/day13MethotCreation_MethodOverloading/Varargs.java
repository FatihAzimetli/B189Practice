package day13MethotCreation_MethodOverloading;

public class Varargs {

    public static void main(String[] args) {

        int result = toplamaYap(5,6,7,8,9,10);
        System.out.println(result);

    }

    public static int toplamaYap(int... a) {
        int sum = 0;
        for (int w : a ) {
            sum=sum+w;
        }
        return sum;
    }

    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir

    //toplama islemi yapan bir method olusturun
//    public static int toplamaYap(int a, int b) {
//        return a + b;
//    }
//
//    public static int toplamaYap(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int toplamaYap(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }










}

