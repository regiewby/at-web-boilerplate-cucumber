package factories;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.net.MalformedURLException;

/**
 * @author regiewby on 25/02/22
 * @project at-web-boilerplate-cucumber
 */
public class BrowserFactory {

    public WebDriver launchBrowser(String browser) throws MalformedURLException {

        WebDriver webDriver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("headless chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("disable-gpu");
            webDriver = new ChromeDriver(chromeOptions);

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            webDriver = new FirefoxDriver(options);

        } else if (browser.equalsIgnoreCase("headless firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            options.addArguments("disable-gpu");

            webDriver = new FirefoxDriver(options);
        }

        return webDriver;
    }
}
