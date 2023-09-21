package Day04ScannerIncrementDecrementIfstatamentsTk;

public class incrementDecrement {
    public static void main(String[] args) {

        //increment

        int a = 5;
        System.out.println(a);

        a = a+2;
        System.out.println(a);

        a += 2;
        System.out.println(a);

        //decrement

        int c = 8;

        c = c-3;
        System.out.println(c);

        c -= 3;
        System.out.println(c);

        //inkrement 2

        int d = 6;
        d = d*2;
        System.out.println(d);

        d *= 2;
        System.out.println(d);

        //Decrement

        int e = 24;

        e = e/2 ;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        // 1 ile inkrement
        int f = 13 ;

        //f = f + 1 ;

       // f  += 1;
       // System.out.println(f);

        f ++;
        System.out.println(f);

        //1 ile dikrement

        int h =13;

        h --;
        System.out.println(h);

        // POST- INCREMENT */ PRE- INCREMENT           * POST=SONRA          * PRE=ÖNCE

        int i = 10;
        int k = i++; // post increment
        System.out.println(k); // artirma yapmadi sonra artirmak icin hafizasina +1 ekledi
        System.out.println(i); // i degerine hafizasindan 1 ekledi


        int m = 15;
        int n = ++m; //pre increment
        System.out.println(n); // artirmayi yapti
        System.out.println(m); // m degirini esit sekilde 1 artirdi

        //Örnek
        int p = 17;
        int r = p--;
        System.out.println(p);
        System.out.println(r); // r icin sonraki islemde hafizasina -1 kaydettigi icin deger artisi olmadi

        int s = 20 ; // burda s 19 olur
        int t = --s;  // t burda 19 olur
        System.out.println("s = " + s);
        System.out.println("t = " + t);


    }







}
