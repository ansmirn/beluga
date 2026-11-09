package pages;

import static com.codeborne.selenide.Selenide.$;


public class YandexSearchResultsPage extends BasePage {

    public YandexSearchResultsPage clickResults(String queryResults) {
        $("[href*='" + queryResults + "']").click();
        return this;
    }
}
