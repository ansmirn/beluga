package qa.webshop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WSLoginPage {
    private final SelenideElement loginLink = $(".ico-login");
    private final SelenideElement emailInput = $("#Email");
    private final SelenideElement passwordInput = $("#Password");
    private final SelenideElement logInButton = $(".login-button");
    private final SelenideElement emailInHeader = $("div.header-links ul li");

    public WSLoginPage openLoginPage() {
        loginLink.click();
        return this;
    }

    public WSLoginPage enterEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public WSLoginPage enterPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public WSLoginPage clickLoginButton() {
        logInButton.click();
        return this;
    }

    public void verifyEmailInHeader(String email) {
        emailInHeader.shouldHave(text(email));
    }
}
