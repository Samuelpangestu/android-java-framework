package test.page_object;

import static test.utils.Utils.env;

public class LoginPage extends BasePage {
    public void isOnLoginPage() {
        assertIsDisplay("ICON_COMPANY");
        assertIsDisplay("TEXT_VERSION");
    }

    public void tapRegister() {
        tap("TEXT_REGISTER");
    }

    public void inputName(String name) {
        typeOn("FIELD_NAME", (name));
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

    public void isSuccessRegisterNotif() {
        assertIsDisplay("TEXT_SUCCESS_REGISTER");
    }

    public void tapSkipBiometricPopup() {
        tap("BUTTON_SKIP_BIOMETRIC");
    }

    public void tapSkipAvatarPopup() {

        tap("BUTTON_SKIP_AVATAR");
    }

    public void isWatchlistPage() {
        tapSkipBiometricPopup();
        tapSkipAvatarPopup();
        assertIsDisplay("ICON_STOCKBIT_WATCHLIST");
    }
}

