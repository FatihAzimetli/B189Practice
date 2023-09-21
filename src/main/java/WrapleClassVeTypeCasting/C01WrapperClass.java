package WrapleClassVeTypeCasting;

public class C01WrapperClass {
    public static void main(String[] args) {
        System.out.println(Short.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Boolean.FALSE);

        int sayi = 15;
        double sayi2= sayi;
        System.out.println("sayi2 = " + sayi2);
        Integer sayi3 = (int)sayi2;
        System.out.println(sayi+sayi3.doubleValue());
        System.out.println(sayi+sayi2+sayi3.toString());
        String str = sayi3.toString();
        System.out.println("str = " + str);
        System.out.println(str+sayi);
        Double sayi4 = sayi3.doubleValue();
        System.out.println("sayi4 = " + sayi4);


    }
}
