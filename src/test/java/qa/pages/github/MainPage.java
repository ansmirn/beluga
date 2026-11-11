package qa.pages.github;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement searchButton = $("[aria-label = 'Search or jump to, type / to search']");
    private final SelenideElement searchInput = $("[aria-label='Search or jump to']");

    public MainPage clickSearch() {
        searchButton.click();
        return this;
    }

    public SearchResults input(String query) {
        searchInput.setValue(query).pressEnter();
        return new SearchResults();
    }


}
