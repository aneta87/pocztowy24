package pl.pocztowy24.pages.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginObject {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public LoginObject(WebDriver webDriver, WebDriverWait webDriverWait){

        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = LoginData.LOGIN_BUTTON)
    private WebElement loginButton;


    public void clickOnLoginButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }
}
