package OopTekrarPaj2;

public class Cat extends Animal {
    public void meow(){

        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void drink() {
        System.out.println("Cat drink");
    }
}
