package factories;

import org.openqa.selenium.WebDriver;

/**
 * @author regiewby on 25/02/22
 * @project at-web-boilerplate-cucumber
 */
public class DriverFactory {


    private DriverFactory(){
    }

    private static DriverFactory instance  = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();


    public WebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }

    public void closeBrowser() {
        driver.get().close();
        driver.remove();
    }


}
