package day22map_exception;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //HashMap arkasinda calisan mekanizma
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");
        capitals.put("Italy","Roma");
        capitals.put("Turkiye","Ankara");
        capitals.get("Turkiye");
        capitals.put("Turkiye","Istanbul");
    }
}
