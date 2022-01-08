package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;
import ui.LoginPageElements;
import ui.PaymentPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakePayment implements Task {
    private String phone = "";
    private String name = "";
    private String country = "";

    public MakePayment(String phone, String name, String country) {
        this.phone = phone;
        this.name = name;
        this.country = country;
    }

    @Override
    @Step("{0} logins to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.MAKEPAYMENT_BTN),
                Click.on(PaymentPageElements.PHONE_FIELD),
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE_FIELD),
                Click.on(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.name).into(PaymentPageElements.NAME_FIELD),
                SendKeys.of().into(PaymentPageElements.AMOUNT_BAR)
        );
    }

    public static MakePayment pay() {
        return instrumented(MakePayment.class);
    }
}
