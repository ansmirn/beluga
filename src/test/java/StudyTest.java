import pages.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;


public class StudyTest {
    @BeforeAll
    static void setUp() {
        Configuration.timeout = 6000; // таймаут прогрузки элементов
    }


    @Test
    void studyPriceShouldBe47000Test() {
        open("https://ya.ru/", SearchYandexPage.class)
                .search("bulgakov qa")
                .clickSearch()
                .clickResults("ivanbulgakovqa.ru")
                .switchToWindow(1, BulgakovPage.class)
                .clickPrice()
                .clickWantToQa()
                .goPay().switchToWindow(2, LavaTopPage.class)
                .openCurrencyDropdown()
                .selectRub()
                .checkSum("₽ 47 000.00");
    }

    @Test
    void softAssertionsWikiShouldMentionJUnit5Test() {
        GitHubMainPage gitHubPages = new GitHubMainPage();

        open("https://github.com", GitHubMainPage.class)
                .clickSearch()
                .input("Selenide")
                .openSelenideRepository()
                .goToWikiTab()
                .goToPagesSoftAssertions()
                .checkText("Using JUnit5 extend test class");

    }
}
