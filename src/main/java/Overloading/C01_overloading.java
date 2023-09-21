package Overloading;

public class C01_overloading {
    public static void main(String[] args) {
        toplama(7.6,1.2);
        toplama(5,5.6);
        toplama(6.5, 6);
        toplama(6,7);

    }
    //autoWiding
    private static void toplama(double v, double v1) {
        System.out.println(v + v1);
        System.out.println(v);
    }
    private static void toplama(int a,double b){
        System.out.println(a+b);
        System.out.println(a);
    }
    private static void toplama(double a,int b){
        System.out.println(a+b);
        System.out.println(a);
    }
    private static void toplama(int a,int b){
        System.out.println(a+b);
        System.out.println(a);
    }
}
