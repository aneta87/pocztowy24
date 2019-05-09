package pl.pocztowy24.pages.transferCorfirmation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.pocztowy24.config.SingletonWebDriver;

public class ConfirmatonTest {
    private ConfirmationObject confirmationObject;

    @BeforeClass
    public void setUp(){
        confirmationObject= new ConfirmationObject(SingletonWebDriver.getWebDriver(), SingletonWebDriver.getWebDriverWait());
    }

    @Test
    @Parameters({"number"})
    public void confirmationForm(String number){
        confirmationObject.confirmationForm(number);
    }



}
