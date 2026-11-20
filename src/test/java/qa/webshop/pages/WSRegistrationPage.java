package qa.webshop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WSRegistrationPage {
    private final SelenideElement pageTitle = $("div.page-title");
    private final SelenideElement maleGenderRadio = $("#gender-male");
    private final SelenideElement firstNameInput = $("#FirstName");
    private final SelenideElement lastNameInput = $("#LastName");
    private final SelenideElement emailInput = $("#Email");
    private final SelenideElement passwordInput = $("#Password");
    private final SelenideElement confirmPasswordInput = $("#ConfirmPassword");
    private final SelenideElement registerButton = $("#register-button");
    private final SelenideElement registrationResultMessage = $("div.result");
    private final SelenideElement emailInHeader = $("div.header-links ul li");

    public void register(String firstName, String lastName, String email, String password) {
        selectGenderMale()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .enterEmail(email)
                .enterPassword(password)
                .confirmPassword(password)
                .clickRegisterButton();
    }

    public WSRegistrationPage verifyRegistrationPageTitle() {
        pageTitle.shouldHave(text("Register"));
        return this;
    }

    public WSRegistrationPage selectGenderMale() {
        maleGenderRadio.click();
        return this;
    }

    public WSRegistrationPage enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public WSRegistrationPage enterLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public WSRegistrationPage enterEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public WSRegistrationPage enterPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public WSRegistrationPage confirmPassword(String password) {
        confirmPasswordInput.setValue(password);
        return this;
    }

    public WSRegistrationPage clickRegisterButton() {
        registerButton.click();
        return this;
    }

    public WSRegistrationPage verifyRegistrationResult() {
        registrationResultMessage.shouldHave(text("Your registration completed"));
        return this;
    }

    public void verifyEmailInHeader(String email) {
        emailInHeader.shouldHave(text(email));
    }


}
