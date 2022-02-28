package com.regiewby.runners;

import com.regiewby.factories.BrowserFactory;
import com.regiewby.factories.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

/**
 * @author regiewby on 26/02/22
 * @project at-web-boilerplate-cucumber
 */

@CucumberOptions(
        features = "src/test/resources/features",
        glue={"com.regiewby.steps"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-report.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {

    BrowserFactory bf = new BrowserFactory();

    @Parameters("browserType")
    @BeforeMethod
    public void setupBrowser(String browserType) {
        DriverFactory.getInstance().setDriver(bf.launchBrowser(browserType));
        WebDriver webDriver = DriverFactory.getInstance().getDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void teardownBrowser(){
        DriverFactory.getInstance().closeBrowser();
    }
}
