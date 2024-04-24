package step_definitions;

import io.cucumber.java8.En;
import test.page_object.RegisterPage;

public class RegisterPageSteps implements En {
    RegisterPage registerPage = new RegisterPage();
    public RegisterPageSteps() {
        Given("User is on login page", () -> registerPage.isOnLoginPage());
        When("User click create account", () -> registerPage.tapRegister());
        And("^User input name as \"([^\"]*)\"$", (String name) -> registerPage.inputName(name));
        And("^User input email as \"([^\"]*)\"$", (String email) -> registerPage.inputEmail(email));
        And("^User input password as \"([^\"]*)\"$", (String password) -> registerPage.inputPassword(password));
        And("^User input confirmation password as \"([^\"]*)\"$", (String confirmPassword) -> registerPage.inputConfirmPassword(confirmPassword));
        And("User click button register", () -> registerPage.tapRegisterButton());
        Then("User see registration successful notification", () -> registerPage.isSuccessRegisterNotification());
        Then("User see error invalid email notification", () -> registerPage.isInvalidEmailNotification());
        Then("User see error invalid name notification", () -> registerPage.isInvalidNameNotification());
        Then("User see error email already exists notification", () -> registerPage.isEmailExistsNotification());
        Then("User see error enter password notification", () -> registerPage.isEnterPasswordNotification());
        Then("User see error password is not match notification", () -> registerPage.isPasswordNotMatchNotification());
    }
}
