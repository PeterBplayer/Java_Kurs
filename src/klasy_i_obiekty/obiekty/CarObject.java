package klasy_i_obiekty.obiekty;

import klasy_i_obiekty.klasy.Car;

public class CarObject {
    public static void main(String[] args) {
//        Tworzymy obiekt klasy Klasy_i_objekty.Car z pomocą domyślnego konstruktora
//        Mercedes
        Car mercedes = new Car();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rokProdukcji = 2020;
        mercedes.przebieg = 1000;

        mercedes.info();
        mercedes.jedz();
        mercedes.hamuj();
//        Audi
        Car audi = new Car();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rokProdukcji = 2021;
        audi.przebieg = 0;

        audi.info();
        audi.jedz();
        audi.hamuj();

//        Tworzymy obiekt za pomocą konstruktora z parametrami
        Car toyota = new Car("Toyota", "Auris", 2022, 36);
        toyota.jedz();
        toyota.hamuj();
    }
}
