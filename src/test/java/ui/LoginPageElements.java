package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageElements {
    public static Target USERNAME_FIELD = Target.the("username field")
            .located(By.id("usernameTextField"));
    public static Target PASSWORD_FIELD = Target.the("password field")
            .located(By.id("passwordTextField"));
    public static Target LOGIN_BTN = Target.the("login button")
            .located(By.id("loginButton"));

    public static Target TOAST_MESSAGE = Target.the("toast mesaage")
            .located(By.xpath("/hierarchy/android.widget.Toast"));
    //Invalid username or password!

}
