package day09loops01;

public class doWhileLoop {
    public static void main(String[] args) {

        /*
        //while loop

        baslangic degeri

        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
        }

        // do - while loop

        baslangic degeri
        do{
            calisacak kodlar
            artirma / azaltma
        }while (loop calisma kurali);
        */

        //ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz

        int i = 5;

        do {

            System.out.println(i);
            i--;
        }while (i>2);

        //------------------------------------------------------------------------------------------

        // 1 ) while loop

        int a = 1;

        while (a<1){
            System.out.println("Sen bir while loopsun...");
            a++;
        }



        // 2 ) do-while-loop
        int b = 1;
        do {
            System.out.println("Sen bir do while loopsun...");
            b++;
        }while (b<1);

















    }
}
