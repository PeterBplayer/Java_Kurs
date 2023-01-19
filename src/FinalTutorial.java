import dziedziczenie.parents.Person;

public class FinalTutorial {
    public static void main(String[] args) {
        final int x = 3; // nie można zmienić wartości zmiennej typu final

        final Person person = new Person("Tim", 26); // nie można stworzyć nowego obiektu tego typu do zmiennej person
        person.age = 25;
//        klasa typu final nie może być dziedziczna
//        metody typu final nie można modyfikować
    }
}
