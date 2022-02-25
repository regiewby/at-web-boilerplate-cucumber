package factories;

import com.aventstack.extentreports.ExtentTest;

/**
 * @author regiewby on 25/02/22
 * @project at-web-boilerplate-cucumber
 */
public class ExtentReportFactory {

    private ExtentReportFactory() {
    }

    private static ExtentReportFactory instance  = new ExtentReportFactory();

    public static ExtentReportFactory getInstance() {
        return instance;
    }

    ThreadLocal<ExtentTest> extent = new ThreadLocal<ExtentTest>();

    public ExtentTest getExtent() {
        return extent.get();
    }

    public void setExtent(ExtentTest extentTest) {
        extent.set(extentTest);
    }

    public void removeExtentObject() {
        extent.remove();
    }
}
