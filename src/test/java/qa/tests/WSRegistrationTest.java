package qa.tests;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;
import qa.pages.webShop.WSMainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static qa.config.Config.WEB_SHOP_URL;

public class WSRegistrationTest {
    private static final Faker faker = new Faker();

    @Test
    void registrationNewUser() {
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


        System.out.println("1");


    }
}
