import pages.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.github.MainPage;
import pages.yandex.SearchPage;

import static com.codeborne.selenide.Selenide.open;


public class StudyTest {
    @BeforeAll
    static void setUp() {
        Configuration.timeout = 6000; // таймаут прогрузки элементов
    }


    @Test
    void studyPriceShouldBe47000Test() {
        open("https://ya.ru/", SearchPage.class)
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
        MainPage gitHubPages = new MainPage();

        open("https://github.com", MainPage.class)
                .clickSearch()
                .input("Selenide")
                .openSelenideRepository()
                .goToWikiTab()
                .goToPagesSoftAssertions()
                .checkText("Using JUnit5 extend test class");

    }
}
