package step_definitions;

import io.cucumber.java8.En;
import test.page_object.LoginPage;

public class LoginPageSteps implements En {
    LoginPage loginPage = new LoginPage();
    public LoginPageSteps() {
        Given("User is on login page", () -> loginPage.isOnLoginPage());
        When("User click create account", () -> loginPage.tapRegister());
        And("^User input name as \"([^\"]*)\"$", (String name) -> loginPage.inputName(name));
        And("^User input email as \"([^\"]*)\"$", (String email) -> loginPage.inputEmail(email));
        And("^User input password as \"([^\"]*)\"$", (String password) -> loginPage.inputPassword(password));
        And("^User input confirmation password as \"([^\"]*)\"$", (String confirmPassword) -> loginPage.inputConfirmPassword(confirmPassword));
        And("User click button login", () -> loginPage.tapRegisterButton());
        Then("User see registration successful notification", () -> loginPage.isSuccessRegisterNotif());
    }
}
