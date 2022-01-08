package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {
    public final static Target MAKEPAYMENT_BTN = Target.the("make payment button")
            .located(By.id("makePaymentButton"));
    public final static Target LOGOUT_BTN = Target.the("logout button")
            .located(By.id("logoutButton"));


    //
    //Your balance is: 100.00$
    //
}
