package dziedziczenie.offsprings;

import dziedziczenie.parents.Person;

public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze FOOTBALLER");
        this.footballClub = footballClub;
    }
//    Method overwriting
    public void eat() {
        System.out.println("I am on diet.");
    }

    public void playFootball() {
        System.out.println("I am playing football for " + footballClub);
    }

}
