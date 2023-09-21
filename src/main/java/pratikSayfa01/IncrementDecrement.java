package pratikSayfa01;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        a = a+2;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        int c = 8;
        System.out.println(c);

        c = c-3;
        System.out.println(c);

        c -= 3;
        System.out.println(c);

        int d = 6;
        System.out.println(d);

        d= d*2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);

        int e = 24;
        System.out.println(e);


        e = e/2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        int f = 13;
        System.out.println(f);

        f++;
        System.out.println(f);//+1 artirmak

        int h =9;
        //h=h-1;
        //h -= 1;
        h--; //-1 azaltir

        //Post-increment  / pre- increment

        int i = 10 ;
        int k = i++;  //Post inkrement
        System.out.println(k);//10
        System.out.println(i);//11

        int m = 15 ;
        int n = ++m;  //pre increment
        System.out.println(m);//16
        System.out.println(n);//16

        int p =17;
        int r = p--;
        System.out.println(p);
        System.out.println(r);


        int s = 20;
        int t = --s;
        System.out.println(s);
        System.out.println(t);







    }
}
