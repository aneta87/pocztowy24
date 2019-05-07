package pl.pocztowy24.pages.transferOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferObject {

    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public TransferObject(WebDriver webDriver, WebDriverWait webDriverWait) {

        this.webDriver = webDriver;
        this.webDriverWait = webDriverWait;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = TransferData.EXTERNAL_TRANSFER_BUTTON)
    private WebElement externalTransfer;

    public void clickOnExTransferButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(externalTransfer));
        externalTransfer.click();
    }

    @FindBy(xpath = TransferData.INPUT_ACC_NO)
    private WebElement accNo;

    public void inputOnAccNo(String number){
        webDriverWait.until(ExpectedConditions.visibilityOf(accNo));
        accNo.clear();
        accNo.sendKeys(number);
    }

    @FindBy (xpath = TransferData.INPUT_NAME_RECIPIENT)
    private WebElement nameRecipient;

    public void inputNameRecipient(String name){
        webDriverWait.until(ExpectedConditions.visibilityOf(nameRecipient));
        nameRecipient.clear();
        nameRecipient.sendKeys(name);
    }

    @FindBy (xpath = TransferData.INPUT_TITLE_OF_PAYMENT)
    private WebElement title;

    public void inputTitleOfPayment(String titlePayment){
        webDriverWait.until(ExpectedConditions.visibilityOf(title));
        title.clear();
        title.sendKeys(titlePayment);
    }

    @FindBy (xpath = TransferData.INPUT_AMOUNT_OF_PAYMENT)
    private WebElement amount;

    public void inputAmount(String amountPayment){
        webDriverWait.until(ExpectedConditions.visibilityOf(amount));
        amount.clear();
        amount.sendKeys(amountPayment);
    }

    @FindBy(xpath = TransferData.INPUT_DAY_OF_EXECUTIVE)
    private WebElement dayExe;

    public void inputDayExe(String day){
        webDriverWait.until(ExpectedConditions.visibilityOf(dayExe));
        dayExe.clear();
        dayExe.sendKeys(day);
    }

    @FindBy(xpath = TransferData.INPUT_REGULAR_TYPE_OF_TRANSFER)
    private WebElement regularTrasferType;

    public void clickOnButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(regularTrasferType));
        regularTrasferType.click();
    }

    @FindBy(xpath = TransferData.CLICK_ON_SUBMIT_BUTTON)
    private WebElement submitButton;

    public void clickOnSubmitButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(submitButton));
        submitButton.click();
    }

    public void transferForm(String number, String name,String titlePayment, String amountPayment, String day){
        clickOnExTransferButton();
        inputOnAccNo(number);
        inputNameRecipient(name);
        inputTitleOfPayment(titlePayment);
        inputAmount(amountPayment);
        inputDayExe(day);
        clickOnButton();
        clickOnSubmitButton();
    }




}
