package Dziedziczenie;

public class PersonObject {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "Hogwarts");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();

        Footballer footballer = new Footballer("Rayn", 23, "Liverpool FC");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
