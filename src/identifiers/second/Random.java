package identifiers.second;

import identifiers.first.Parent;

public class Random {
    //    Klasa w innej paczce nie ma dostępu do pól/metod private, pól/metod default czyli bez identyfikatora oraz pól/metod protected
    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        parent.firstMethod();
    }
}
