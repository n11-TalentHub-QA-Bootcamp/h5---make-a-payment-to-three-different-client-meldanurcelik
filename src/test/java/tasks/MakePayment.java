package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;
import ui.PaymentPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MakePayment implements Task {
    private String phone;
    private String name;
    private String amount;
    private String country;

    public MakePayment(String phone, String name, String amount, String country) {
        this.phone = phone;
        this.name = name;
        this.amount = amount;
        this.country = country;
    }

    @Override
    @Step("{0} payment to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaymentPageElements.PHONE_FIELD),
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE_FIELD),
                Click.on(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.name).into(PaymentPageElements.NAME_FIELD),
                SendKeys.of(this.amount).into(PaymentPageElements.AMOUNT_BAR),
                Click.on(PaymentPageElements.COUNTRY_FIELD),
                SendKeys.of(this.country).into(PaymentPageElements.COUNTRY_FIELD),
                Click.on(PaymentPageElements.SENDPAYMENT_BTN),
                Click.on(PaymentPageElements.YES_BTN),
                Click.on(HomePageElements.LOGOUT_BTN)
        );
    }

    public static MakePayment pay(String phone,
                                  String name,
                                  String amount,
                                  String country) {
        return instrumented(MakePayment.class,
                phone,
                name,
                amount,
                country);
    }
}
