package day13tekrari;

public class Varrags {
    public static void main(String[] args) {
int sum =toplamaYap(3,5,8,9,10);
        System.out.println(sum);
int sum1 = CarpmaYap(2,7,9,11,2);
        System.out.println(sum1);

    }
//verilen sayilarin toplamini yapan kodu yazirin
    public static int   toplamaYap (int... a){
        int sum = 0;
        for (int w: a) {
            sum = sum+w;
        }
        return sum;
    }
    //Rastgele girilecek sayilarin carpimini yapacak kodun yazdirilmasi
    public static int CarpmaYap (int... k){
        int sum1 = 1;
        for (int w:k) {
            sum1 = sum1*w;
        }
        return sum1;
    }
    //verilen sayilarin toplamini ortalamasina bölen kodu yaziniz





}
