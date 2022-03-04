package com.regiewby.runners;

import com.regiewby.factories.BrowserFactory;
import com.regiewby.factories.DriverFactory;
import com.regiewby.utilities.PropertiesOps;
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
        features = "features",
        glue={"com.regiewby.steps"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-report.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @Parameters("browserType")
    @BeforeMethod
    public void setupBrowser() {
        String browserType = PropertiesOps.getPropertyValueByKey("BROWSER_TYPE");
        String url = PropertiesOps.getPropertyValueByKey("URL");
        BrowserFactory bf = new BrowserFactory();

        DriverFactory.getInstance().setDriver(bf.launchBrowser(browserType));
        WebDriver webDriver = DriverFactory.getInstance().getDriver();
        webDriver.manage().window().maximize();
        webDriver.navigate().to(url);
    }

    @AfterMethod
    public void teardownBrowser(){
        DriverFactory.getInstance().closeBrowser();
    }
}
