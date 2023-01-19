package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Opening Firefox browser...");
    }

    @Override
    public void findElementBy() {
        System.out.println("Finding element in Firefox browser...");
    }
}
