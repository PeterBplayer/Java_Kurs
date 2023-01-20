package drivers;

public class WebDriverObject {
    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name.");
    }

    public static void main(String[] args) throws NoValidBrowserName {
        WebDriver driver = getDriver("safari");
        driver.get();
        driver.findElementBy();

       /* FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();*/
    }


}
