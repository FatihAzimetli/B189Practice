package day19oopNt;

public class Accord implements Ac, Security, Engine {
    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }
}
