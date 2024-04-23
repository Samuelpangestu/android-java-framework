package step_definitions;

import io.cucumber.java8.En;
import test.page_object.LoginPage;

public class LoginPageSteps implements En {
    LoginPage loginPage = new LoginPage();
    public LoginPageSteps() {
        Given("User is on stockbit landingpage", () -> loginPage.isOnboardingPage());
        When("^User click login$", () -> loginPage.tapLogin());
        And("^User input username as \"([^\"]*)\"$", (String usernames) -> loginPage.inputUsername(usernames));
        And("^User input password as \"([^\"]*)\"$", (String password) -> loginPage.inputPassword(password));
        And("^User click button login$", () -> loginPage.tapLoginButton());
        Then("^User see watchlist page$", () -> loginPage.isWatchlistPage());
    }
}
