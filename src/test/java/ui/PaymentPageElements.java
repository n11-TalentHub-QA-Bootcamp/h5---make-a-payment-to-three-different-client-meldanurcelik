package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPageElements {
    public final static Target PHONE_FIELD = Target.the("phone field")
            .located(By.id("phoneTextField"));
    public final static Target NAME_FIELD = Target.the("name field")
            .located(By.id("nameTextField"));
    public final static Target AMOUNT_BAR = Target.the("amount bar")
            .located(By.id("amount"));
    public final static Target COUNTRY_FIELD = Target.the("country field")
            .located(By.id("countryTextField"));
    public final static Target COUNTRY_BTN = Target.the("country button")
            .located(By.id("countryButton"));
    public final static Target COUNTRY_VALUE = Target.the("country value")
            .located(By.id("android:id/text1"));
    public final static Target COUNTRY_LIST = Target.the("country list")
            .located(By.id("countryList"));
    public final static Target SENDPAYMENT_BTN = Target.the("send payment button")
            .located(By.id("sendPaymentButton"));
    public final static Target CANCEL_BTN = Target.the("cancel button")
            .located(By.id("cancelButton"));

    public final static Target MESSAGE_TEXT = Target.the("message text")
            .located(By.id("message")); //Are you sure you want to send payment?
    public final static Target YES_BTN = Target.the("yes button")
            .located(By.id("android:id/button1"));
    public final static Target NO_BTN = Target.the("no button")
            .located(By.id("button2"));
}
