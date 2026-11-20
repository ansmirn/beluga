package qa.webshop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WSMainPage {
    private final SelenideElement registrationLink = $("a.ico-register");

    public WSRegistrationPage openRegistration(){
        registrationLink.click();
        return new WSRegistrationPage();

    }
}
