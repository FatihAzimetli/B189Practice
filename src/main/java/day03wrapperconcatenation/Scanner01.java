package day03wrapperconcatenation;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yasinizi Giriniz :");

        byte age  = input.nextByte();

        System.out.println(age);

    }
}
