package pl.pocztowy24.pages.transferOperation;

public class TransferData {

    public static final String EXTERNAL_TRANSFER_BUTTON= "//div[@id='btnPrzelewZewnetrzny_1']//img";
    public static final String INPUT_ACC_NO="//input[@id=\"naRachunek\" and @value=\"48 1010 1010 0071 1322 3100 0000\"]";
    public static final String INPUT_NAME_RECIPIENT="//input[@value=\"Jan Kowalski\"]";
    public static final String INPUT_TITLE_OF_PAYMENT= "//textarea[contains(text(),'Wpłata na konto')]";
    public static final String INPUT_AMOUNT_OF_PAYMENT="//input[@value=\"99\"]";
    public static final String INPUT_DAY_OF_EXECUTIVE="//input[@id='pzdw']";
    public static final String INPUT_REGULAR_TYPE_OF_TRANSFER="//input[@id='rad1']";
    public static final String CLICK_ON_SUBMIT_BUTTON="//span[contains(text(),'Wykonaj')]";

}
