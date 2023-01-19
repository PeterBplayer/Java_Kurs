package klasy_i_obiekty.klasy;

public class User {
    public String userName;
    public String password;

    public User() { // konstruktor
    }
    public User(String userName, String password) { // konstruktor z parametrami
        System.out.println("Hello from constructor");
        this.userName = userName;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello my names is " + userName);
    }
}
