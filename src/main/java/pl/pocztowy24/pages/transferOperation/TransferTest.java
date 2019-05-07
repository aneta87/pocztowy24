package pl.pocztowy24.pages.transferOperation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.pocztowy24.config.SingletonWebDriver;

public class TransferTest {

private TransferObject transferObject;

@BeforeClass
    public void setUp(){
    transferObject = new TransferObject(SingletonWebDriver.getWebDriver(),SingletonWebDriver.getWebDriverWait());
}

@Test
@Parameters({"number","name", "titlePayment", "amountPayment", "day"})
    public void transferFormTest(String number, String name,String titlePayment, String amountPayment, String day){
    transferObject.transferForm(number,name,titlePayment,amountPayment,day);
}






}
