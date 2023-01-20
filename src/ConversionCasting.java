import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {
//        przykład 1
        int a = 2;
        double b = 4.23;

        double c = a / b; // konwersja nie jawna, zmienna a zostaje przekonwertowana na double

        int d = a / (int) b; // konwersja ręczna b konwertujemy na int

        System.out.println(c);
        System.out.println(d);
//        przykład 2
        WebDriver driver = new FirefoxDriver();

        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();

    }
}
