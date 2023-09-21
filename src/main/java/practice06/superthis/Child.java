package practice06.superthis;



public class Child extends Parent {

    public Child() {
        super();
        System.out.println("Child class parametresiz constructor");
    }

    public Child(int a) {
        super(2);
        System.out.println("Child class tek parametreli constructor");
    }

    public Child(int a, int b) {
        super(4, 5);
        System.out.println("Child class iki parametreli constructor");
    }

    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız

    public static void main(String[] args) {

        //Child obj1=new Child();
        //Child obj2=new Child(1);
        Child obj3 = new Child(1, 2);

    }
}