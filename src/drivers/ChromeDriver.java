package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Opening Chrome browser...");
    }

    @Override
    public void findElementBy() {
        System.out.println("Finding element in Chrome browser...");
    }
}
