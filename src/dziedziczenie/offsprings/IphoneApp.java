package dziedziczenie.offsprings;

import dziedziczenie.parents.App;

public class IphoneApp extends App {
    //    Konstruktor
    public IphoneApp(String name) {
        super(name);
    }

    //    Metoda
    public void runIphoneApp() {
        System.out.println("Running app " + name + " on iOS environment.");
    }
}
