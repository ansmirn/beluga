package qa.webshop.tests;

import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import qa.webshop.pages.WSLoginPage;
import qa.webshop.pages.WSRegistrationPage;

import static com.codeborne.selenide.Selenide.*;
import static qa.webshop.config.Config.WEB_SHOP_REGISTRATION_URL;
import static qa.webshop.config.Config.WEB_SHOP_URL;

public class LoginTest {
    private static final Faker faker = new Faker();
    private static String email = faker.internet().emailAddress();
    private static String password = faker.credentials().password();

    @BeforeAll
    static void registration() {
        open(WEB_SHOP_REGISTRATION_URL, WSRegistrationPage.class)
                .register(faker.name().firstName(),
                        faker.name().lastName(),
                        email,
                        password);
        cookies().clear();

    }

    @Test
    void successLogin() {
        open(WEB_SHOP_URL, WSLoginPage.class)
                .openLoginPage()
                .enterEmail(email)
                .enterPassword(password)
                .clickLoginButton()
                .verifyEmailInHeader(email);
        System.out.println(1);
    }
}
