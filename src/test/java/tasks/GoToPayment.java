package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import ui.HomePageElements;
import ui.PaymentPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToPayment implements Task {

    @Override
    @Step("{0} logins to the eribank")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePageElements.MAKEPAYMENT_BTN)
        );
    }

    public static GoToPayment goTo() {
        return instrumented(GoToPayment.class);
    }
}
