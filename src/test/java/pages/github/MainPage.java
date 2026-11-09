package pages.github;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement searchButton = $("[aria-label = 'Search or jump to, type / to search']");
    private final SelenideElement inputSaerch = $("[aria-label='Search or jump to']");

    public MainPage clickSearch() {
        searchButton.click();
        return this;
    }

    public SearchResults input(String query) {
        inputSaerch.setValue(query).pressEnter();
        return new SearchResults();
    }


}
