package animals;

public class Dog extends Animal {
    @Override
    public void sound() {
        sayHello();
        System.out.println("Hau! Hau!");
        System.out.println("I have " + legs + " legs");
    }
}
