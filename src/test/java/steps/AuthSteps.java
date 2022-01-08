package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import tasks.LoginToEriBank;
import ui.HomePageElements;
import ui.LoginPageElements;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class AuthSteps {

    @Managed(driver = "Appium")
    public WebDriver herMobileDevice;

    String actorName = "hhag";
    Actor actor = Actor.named(actorName);

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("I login with username company and password company")
    public void i_login_with_username_company_and_password_company() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("company", "company"));
    }

    @Then("you should see the home page")
    public void you_should_see_the_home_page() {
        actor.should(GivenWhenThen.seeThat(the(HomePageElements.MAKEPAYMENT_BTN),
                containsText("Make Payment")));
    }


    @When("I login in with the wrong username and password")
    public void ı_login_in_with_the_wrong_username_and_password() {
        actor.can(BrowseTheWeb.with(herMobileDevice));
        actor.attemptsTo(LoginToEriBank.login("username", "password"));
    }

    @Then("you should see the information toast")
    public void you_should_see_the_information_toast() {
        actor.should(GivenWhenThen.seeThat(the(LoginPageElements.TOAST_MESSAGE),
                containsText("Invalid username or password!")));
    }

}