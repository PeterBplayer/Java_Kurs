package klasy_i_obiekty.klasy;

//Klasa to taki szablon/foremka dzięki której można tworzyć obiekty, które są przedstawicielami danej klasy.
public class Car {
    //    Pola(Field) - coś jak cechy
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;
    //    Konstruktor domyślny
    public Car() {

    }
    //    Konstruktor z parametrami
    public Car(String marka, String model, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.info();
    }

    //    Klasy_i_objekty.Metody(Methods) - coś jak zachowanie
    public void jedz() {
        System.out.println("Jadę!");
    }

    public void hamuj() {
        System.out.println("Hamuję!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }
}
