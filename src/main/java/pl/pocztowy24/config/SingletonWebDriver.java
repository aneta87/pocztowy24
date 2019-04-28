package pl.pocztowy24.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SingletonWebDriver {
    private static SingletonWebDriver singletonWebDriver;
    private static WebDriver webDriver;
    private static WebDriverWait webDriverWait;

    private SingletonWebDriver(String driverPath) {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, driverPath);
        webDriver = new ChromeDriver();
        webDriverWait = new WebDriverWait(webDriver, 5);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    public static void initialize(String driverPath) {
        if (singletonWebDriver == null) {
            singletonWebDriver = new SingletonWebDriver(driverPath);
        }
    }

    public static WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void quitWebDriver() {
        webDriver.quit();
        webDriver = null;
        webDriverWait = null;
        singletonWebDriver = null;
    }
}
