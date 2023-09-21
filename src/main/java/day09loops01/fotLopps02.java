package day09loops01;

public class fotLopps02 {
    public static void main(String[] args) {


        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20

        double num = 28.587;
        //ondalikli kismi alabilmek icin stringe cevirmeliyiz


        String sNum = String.valueOf(num);
        //Stringe cevirmis oldugumuz sayiyi split() methodu ile bolerek ondalikli kismi alabiliriz


        String decimalPart = sNum.split("[.]")[1];

        //String tipinde olan decimalPart uzerinde matematiksel islem yapabilmek icin int e cevirmeliyiz
        int intDecimalPart = Integer.valueOf(decimalPart);

        int sum = 0;

        for (int i = intDecimalPart;        i > 0;                      i = i / 10) {

            sum = sum + i % 10;
        }
        System.out.println(sum);














    }
}
