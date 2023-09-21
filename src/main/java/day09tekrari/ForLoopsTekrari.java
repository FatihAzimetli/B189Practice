package day09tekrari;

public class ForLoopsTekrari {
    public static void main(String[] args) {

        //Example : verilen verilen sayıda ondalik kisminin toplamini bulun
        //            28.587 ==> 5+8+7 =20
        double num = 28.587;
        String sNum = String.valueOf(num);
        String decimalPart = sNum.split("[.]")[1];
        int intOndalikSayi = Integer.valueOf(decimalPart);
        int sum = 0;

        for (int i = intOndalikSayi; i >0 ; i=i/10) {
            sum = sum+i%10;
        }

        System.out.println("son üc basamak toplami :" + sum);

        System.out.println();
//Example : verilen sayıda ondalik kisminin toplamini bulun
        //           57.976 ==> 9+7+6

        double num1= 57.976;
        String aNum = String.valueOf(num1);
       String decimalPart1 = aNum.split("[.]")[1];
       int intOndalikSayi1 = Integer.valueOf(decimalPart1);
       int sum1= 0;
        for (int k = intOndalikSayi1; k >0 ; k=k/10) {
            sum1 = sum1+k%10;
        }

        System.out.println("son üc basamak toplami :" + sum1);



    }
}
