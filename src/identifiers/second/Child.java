package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {
    //    Klasa potomna w innej paczce nie ma dostępu do pól/metod private oraz pól/metod default czyli bez identyfikatora
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }
}
