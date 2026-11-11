package qa.tests;

import org.junit.jupiter.api.Test;
import qa.pages.github.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class GitHubWikiTest {
    @Test
    void softAssertionsWikiShouldMentionJUnit5Test() {

        open("https://github.com", MainPage.class)
                .clickSearch()
                .input("Selenide")
                .openSelenideRepository()
                .goToWikiTab()
                .goToPagesSoftAssertions()
                .checkText("Using JUnit5 extend test class");
        webdriver().shouldHave(url("https://github.com/selenide/selenide/wiki/SoftAssertions"));

    }
}
