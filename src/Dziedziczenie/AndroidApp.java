package Dziedziczenie;

public class AndroidApp extends App {
    //    Konstruktor
    public AndroidApp(String name) {
        super(name);
    }

    //    Metoda
    public void runAndroidApp() {
        System.out.println("Running app " + name + " on Android environment.");
    }
}
