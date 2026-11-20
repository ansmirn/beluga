package qa.webshop.tests;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import qa.webshop.pages.WSMainPage;

import static com.codeborne.selenide.Selenide.open;
import static qa.webshop.config.Config.WEB_SHOP_URL;

public class WSRegistrationTest {
    private static final Faker faker = new Faker();

    @Test
    void registrationTest() {
        String password = faker.credentials().password();
        String email = faker.internet().emailAddress();

        open(WEB_SHOP_URL, WSMainPage.class)
                .openRegistration()
                .verifyRegistrationPageTitle()
                .selectGenderMale()
                .enterFirstName(faker.name().firstName())
                .enterLastName(faker.name().lastName())
                .enterEmail(email)
                .enterPassword(password)
                .confirmPassword(password)
                .clickRegisterButton()
                .verifyRegistrationRusult()
                .verifyEmailInHeader(email);

    }
}
