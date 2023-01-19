//Stwórz klasę bazową App, która zawiera pole name i metodę appInfo, dodaj konstruktor do którego przekażesz wartość name
//Stwórz klasę potomną AndroidApp i IphoneApp, które zawierają metody runAdroidApp i runIphoneApp
package dziedziczenie.parents;

public class App {
    //    Pole
    public String name;

    //    Konstruktor (skrót klawiszowy ctrl + insert)
    public App(String name) {
        this.name = name;
    }

    //    Metoda
    public void appInfo() {
        System.out.println("Application name is " + name);
    }
}
