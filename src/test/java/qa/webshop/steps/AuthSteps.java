package qa.webshop.steps;

import net.datafaker.Faker;
import qa.webshop.pages.WSRegistrationPage;

import static com.codeborne.selenide.Selenide.open;
import static qa.webshop.config.Config.WEB_SHOP_REGISTRATION_URL;

public class AuthSteps {
    private static final Faker faker = new Faker();

    public void registrationNewUser() {
        open(WEB_SHOP_REGISTRATION_URL, WSRegistrationPage.class)
                .register( faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.credentials().password());
    }
}