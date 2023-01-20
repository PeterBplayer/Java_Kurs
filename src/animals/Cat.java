package animals;

public class Cat extends Animal {
    @Override
    public void sound() {
        sayHello();
        System.out.println("Miau! Miau!");
        System.out.println("I have " + legs + " legs");
    }
}
