package pl.pocztowy24.pages.transferCorfirmation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public ConfirmationObject(WebDriver webDriver, WebDriverWait webDriverWait){

        this.webDriver=webDriver;
        this.webDriverWait=webDriverWait;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = ConfirmationData.CLICK_ON_SUBMIT_BUTTON)
    private WebElement submitButton;

    public void clickOnSubmitButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();
    }

    @FindBy(xpath = ConfirmationData.INPUT_AUTHORISATION_CODE)
    private  WebElement smsCode;

    public void inputAuthorisationCode(String number){
        webDriverWait.until(ExpectedConditions.visibilityOf(smsCode));
        smsCode.clear();
        smsCode.sendKeys(number);
    }

    @FindBy(xpath = ConfirmationData.CLICK_ON_SIGN_IN_BUTTON)
    private WebElement signButton;

    public void clickOnSignIn(){
        webDriverWait.until(ExpectedConditions.visibilityOf(signButton));
        signButton.click();
    }

    @FindBy(xpath = ConfirmationData.CLICK_ON_END_BUTTON)
    private WebElement endButton;

    public void clickOnEnd(){
        webDriverWait.until(ExpectedConditions.visibilityOf(endButton));
        endButton.click();
    }

    public void confirmationForm(String number){
        clickOnSubmitButton();
        inputAuthorisationCode(number);
        clickOnSignIn();
        clickOnEnd();
    }

}
