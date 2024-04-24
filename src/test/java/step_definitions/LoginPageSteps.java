package step_definitions;

import io.cucumber.java8.En;
import test.page_object.LoginPage;

public class LoginPageSteps implements En {

    LoginPage loginPage = new LoginPage();

    public LoginPageSteps() {
        Given("User click button login", () -> loginPage.tapLoginButton());
        When("User see homepage", () -> loginPage.isHomePage());
        When("User click back", () -> loginPage.backDevice());
        When("User see error email and password is wrong", () -> loginPage.isWrongEmailPassword());
    }
}
