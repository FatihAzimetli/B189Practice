package day04scannerinrementdecrementifstetemens;

public class IncrementDecrenent {
    public static void main(String[] args) {
        //Increment
        int a = 5;
        System.out.println(a);
        a = a+2;//Kodingde tekrar sevilmez
        System.out.println(a);
        a +=2;
        System.out.println(a);

        //Decrement
        int c= 8; //8
        System.out.println(c);
        c = c-3; //5
        System.out.println(c);
        c -= 3; //2
        System.out.println(c);

        //incremen 2
        int d= 6;
        System.out.println(d);
        d = d*2;
        System.out.println(d);
        d*= 2;
        System.out.println(d);

        //dicrement bölme ile yapma
        int e = 24;
        System.out.println(e);

        e= e/2;
        System.out.println(e);

        e /=2;
        System.out.println(e);

        //java 1 ile artirmak ve 1 ile azaltmak icin özel bir simtex gelistirmistir

        int f= 13;
        System.out.println(f);
        //f = f+1
        //f += 1;

        f++;
        System.out.println(f);

        //1 ile dikremwnt

        int h=9;
        System.out.println(h);

        // h = h-1;
        // h -= 1;

        h--;
        System.out.println(h);

        //post-incremet  önce esaiment etti sonra artirma islemi yapar cünkü önce i sepete tasir
        // pre- increment sonra artan esaiment önce ++ görür anlamsizdir devam eder m görünce artirip n kavanozuna koyar

        int i=10;
        int k= i++;
        System.out.println(k); //10 i artirilmadan k koydugu icin  degeri 10 olur
        System.out.println(i);//11

        int m = 15;
        int n = ++m;
        System.out.println(m); //16 m satir sonunda degeri artirildigi icin m degeri 16 olur
        System.out.println(n);//16 m artirildiktan sonra n kondugu icin n degeri 16 olur

        //örnek
        int p = 17;
        int r = p--;
        System.out.println(p);//16 buna sebep r icin okuma yaparken -- sonra görmesidir
        System.out.println(r); //p okur ve r kutusna tasir deger 17 dir sonra bakar azaltma yapmasi gerekiyor bu azaltmayi p degerinden yapar 16 olur

        int s = 20;
        int t = --s;
        System.out.println(s); //19
        System.out.println(t); //19 t sepetine s eksiltip koydugu icin s degeri artik 19 olur









    }
}
