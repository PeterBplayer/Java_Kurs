package klasy_i_obiekty.obiekty;

import klasy_i_obiekty.klasy.User;

public class UserObject {
    public static void main(String[] args) {
//        Klasy_i_objekty.User user = new Klasy_i_objekty.User();

        User user = new User("Kinga", "12345");

       /* user.userName = "Piotr";
        user.password = "QWERTY";*/

        user.sayHello();
    }
}
