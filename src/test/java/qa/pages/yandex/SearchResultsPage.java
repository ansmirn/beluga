package qa.pages.yandex;

import qa.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;


public class SearchResultsPage extends BasePage {

    public SearchResultsPage clickResults(String queryResults) {
        $("[href*='" + queryResults + "']").click();
        return this;
    }
}
