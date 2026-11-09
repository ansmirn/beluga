package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchYandexPage {
    private final SelenideElement inputSearch = $("textarea.search3__input");
    private final SelenideElement buttonSearch = $("button.search3__button");

    public SearchYandexPage search(String query) {
        inputSearch.setValue(query);
        return this;
    }

    public YandexSearchResultsPage clickSearch() {
        buttonSearch.click();
        return new YandexSearchResultsPage();
    }

}
