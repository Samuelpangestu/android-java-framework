package test.page_object;

import static test.utils.Utils.env;

public class LoginPage extends BasePage {
    public void isOnboardingPage() {
        assertIsDisplay("ICON_STOCKBIT_ONBOARDING_PAGE");
    }

    public void tapLogin() {
        tap("BUTTON_LOGIN_ONBOARDING_PAGE");
    }

    public void inputUsername(String usernames) {
        typeOn("FIELD_USERNAME", env(usernames));
    }

    public void inputPassword(String password) {
        typeOn("FIELD_PASSWORD", env(password));
    }

    public void tapLoginButton() {
        tap("BUTTON_LOGIN");
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

