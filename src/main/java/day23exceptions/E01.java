package day23exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

 /*
    1) Run button'una bastiktan sonra console da alinan Exception lara RunTime Exception denir
        ArithmeticException, NumberFormatException vs....
        Runtime Exception lara Unchecked Exception da denir
    2) Code yazarken kirimiz alti cizgi seklinde alinan exceptionlara Compile Time Excepiton denir
        FileNotFoundException, IOException vs...
        Compile Time Exception lara Checked Exception da denir

     interview sorusu
     throw ile throws keywordleri arasindaki fark nedir?
     1) throw method bodysi icinde , throws ise method parantezinden hemen sonra  kullaniliri
     2) throw method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
        throws ise method parantezinden hemen sonra ve sadece bir kere kullanilibilir
     3) throw dan sonra new keyword ve constructor kullanarak object olusturulur
        throws dan sonra sadece Exception class ismi yazilir
     4) throw belli sartlar icin Exception firlatmada kullanilir
        throws ise bir methodun belli bir Exception u firlatabileceğini belirtmek icin kullanilir

     */

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day23exceptions\\file.txt");


        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }



    }
}
