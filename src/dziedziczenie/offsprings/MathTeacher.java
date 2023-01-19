package dziedziczenie.offsprings;

import dziedziczenie.parents.Person;

public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze MATHTEACHER");
        this.school = school;
    }

    //    Method overwriting
    public void walk() {
        super.walk(); // zostanie wywołana metoda z klasy PERSON
        System.out.println("I walk very fast.");
    }

    public void teachMath() {
        System.out.println("I am teaching math in " + school);
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
