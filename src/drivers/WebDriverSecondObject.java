package drivers;

public class WebDriverSecondObject {
    public static void main(String[] args) {

//        Klasa anonimowa - klasa definiowana w kodzie która ma dokładnie jeden obiekt(instancje).
        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening Safari browser...");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element in Safari browser...");
            }
        };

        safari.get();
        safari.findElementBy();


    }
}
