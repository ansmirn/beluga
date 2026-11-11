package qa.pages.yandex;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private final SelenideElement inputSearch = $("textarea.search3__input");
    private final SelenideElement buttonSearch = $("button.search3__button");

    public SearchPage search(String query) {
        inputSearch.setValue(query);
        return this;
    }

    public SearchResultsPage clickSearch() {
        buttonSearch.click();
        return new SearchResultsPage();
    }

}
