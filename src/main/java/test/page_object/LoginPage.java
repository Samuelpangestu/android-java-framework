package test.page_object;

public class LoginPage extends BasePage {

    public void tapLoginButton() {
        tap("BUTTON_LOGIN");
    }

    public void isHomePage() {
        assertIsDisplay("TEXT_HOMEPAGE");
    }

    public void backDevice() {
        getDriver().navigate().back();
    }

    public void isWrongEmailPassword() {
        assertIsDisplay("TEXT_ERROR_WRONG_EMAIL_PASSWORD");
    }
}
