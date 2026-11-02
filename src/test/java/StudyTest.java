import Pages.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class StudyTest {

  @Test
  void studyPriceShouldBe47000Test() {
    Configuration.browser = "chrome"; // выбор браузера
    //Configuration.pageLoadTimeout = 100000; // таймаут прогрузки страницы
    Configuration.timeout = 6000; // таймаут прогрузки элементов

    BulgakovPage bulgakovPage = new BulgakovPage();
    LavaTopPage lavaTopPage = new LavaTopPage();


    open("https://ya.ru/", SearchYandexPages.class)
            .search("bulgakov qa")
            .clickSearch()
            .clickResults("ivanbulgakovqa.ru");
    switchTo().window(1);
    bulgakovPage
            .clickPrice()
            .clickVkat()
            .goPay();
    switchTo().window(2);
    lavaTopPage.currencyDropdown()
            .clickRub().checkSum();
  }

  @Test
  void SearchSelenide (){
    GitHubPages gitHubPages = new GitHubPages();

    open("https://github.com", GitHubPages.class)
            .clickToInputSearch()
            .inputSearchSelenide()
            .clickSelenideToList()
            .goToWikiTab()
            .goToPagesSoftAssertions()
            .goToPagesSoftAssertions();


}
}
