package drivers;

public class WebDriverObject {
    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        return null;
    }
    public static void main(String[] args) {
        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();

       /* FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();*/
    }


}
