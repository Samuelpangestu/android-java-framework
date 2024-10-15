package test.page_object;

public class RegisterPage extends BasePage {
    public void isOnLoginPage() {
        assertIsDisplay("ICON_COMPANY");
        assertIsDisplay("TEXT_VERSION");
    }

    public void tapRegister() {
        tap("TEXT_REGISTER");
    }

    public void inputName(String name) {
        typeOn("FIELD_NAME", name);  // Use the typeOn method to input the name
    }

    public void inputEmail(String email) {
        typeOn("FIELD_EMAIL", (email));
    }

    public void inputPassword(String password) {
        typeOn("FIELD_PASSWORD", (password));
    }

    public void inputConfirmPassword(String confirmPassword) {
        typeOn("FIELD_CONFIRM_PASSWORD", (confirmPassword));
    }

    public void tapRegisterButton() {
        tap("BUTTON_REGISTER");
    }

    public void isSuccessRegisterNotification() {
        assertIsDisplay("TEXT_SUCCESS_REGISTER");
    }

    public void isInvalidEmailNotification() {
        assertIsDisplay("TEXT_ERROR_ENTER_VALID_EMAIL");
    }

    public void isInvalidNameNotification() {
        assertIsDisplay("TEXT_ERROR_ENTER_VALID_NAME");
    }

    public void isEmailExistsNotification() {
        assertIsDisplay("TEXT_ERROR_EMAIL_ALREADY_EXISTS");
    }

    public void isEnterPasswordNotification() {
        assertIsDisplay("TEXT_ERROR_ENTER_PASSWORD");
    }

    public void isPasswordNotMatchNotification() {
        assertIsDisplay("TEXT_ERROR_PASSWORD_IS_NOT_MATCH");
    }
}
