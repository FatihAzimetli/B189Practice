package TernaryNestedClass;

import java.util.Scanner;

public class C05_IfStatemens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir gün ismi giriniz");
        String günAdi = input.next();

        if (günAdi.equalsIgnoreCase("Pazartesi")){
            System.out.println("1'nci calisma günü");
        } else if (günAdi.equalsIgnoreCase("Sali")) {
            System.out.println("2'nci Calisma günü");
        } else if (günAdi.equalsIgnoreCase("Carsamba")) {
            System.out.println("3'ncü is günü");
        } else if (günAdi.equalsIgnoreCase("Persembe")) {
            System.out.println("4'ncü calisma günü");
        } else if (günAdi.equalsIgnoreCase("Cuma")) {
            System.out.println("5'nci Calisma günp");
        } else if (günAdi.equalsIgnoreCase("Cumartesi")) {
            System.out.println("6'nci gün hafta sonu");
        } else if (günAdi.equalsIgnoreCase("Pazar")) {
            System.out.println("7'nci gün Hafta sonu");
        }else {
            System.out.println("Lütfen sadece gün adi giriniz");
        }



        switch (günAdi.toLowerCase()){
            case "pazartesi":
                System.out.println("1");
                break;
            case "sali":
                System.out.println("2");
                break;
            case "carsamba":
                System.out.println("3");
                break;
            case "persembe":
                System.out.println("4");
                break;
            case "cuma":
                System.out.println("5");
                break;
            case "cumartesi":
                System.out.println("6");
                break;
            case "pazar":
                System.out.println("7");
                break;
            default:
                System.out.println("Lütfen sadece ve sadece gün adi giriniz");
        }


    }
}
