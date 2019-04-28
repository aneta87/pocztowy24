package pl.pocztowy24.pages.loginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.pocztowy24.config.SingletonWebDriver;

public class LoginTest {
    private LoginObject loginObject;
    private String url;

    @BeforeClass
    public void SetUp() {
        loginObject = new LoginObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
        Assert.assertNotNull(loginObject);
    }

    @Test
    public void clickOnLoginButton() {
        url = SingletonWebDriver.getWebDriver().getCurrentUrl();
        loginObject.clickOnLoginButton();
        String a = SingletonWebDriver.getWebDriver().getCurrentUrl();
        Assert.assertEquals(url, SingletonWebDriver.getWebDriver().getCurrentUrl());
    }
}
