package drivers;

//Stwórz interfejs drivers.WebDriver, który będzie miał metody get() i findElementBy()
//Dodaj dwie klasy drivers.ChromeDriver i drivers.FirefoxDriver, które będą implementowały ten interfejs
public interface WebDriver {
    void get();
    void findElementBy();
}
