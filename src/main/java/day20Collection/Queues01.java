package day20Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("süt");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);//[süt, et, yumurta, peynir]
        depo.remove();
        System.out.println(depo);

        System.out.println(depo.peek());
        System.out.println(depo);

        depo.clear();
        System.out.println(depo);
        System.out.println(depo.poll());//null
        //   System.out.println(depo.element());//Exception
        System.out.println(depo.peek());//null

        Queue<String> wareHouse= new PriorityQueue<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Orange");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);//[Egg, Milk, Meat, Orange, Tomatoes]

        //Double ended queu ==> iki uclu queue
        Deque<String> d=new LinkedList<>();



    }
}
