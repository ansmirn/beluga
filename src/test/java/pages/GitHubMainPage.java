package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubMainPage {
    private final SelenideElement searchButton = $("[aria-label = 'Search or jump to, type / to search']");
    private final SelenideElement inputSaerch = $("[aria-label='Search or jump to']");

    public GitHubMainPage clickSearch() {
        searchButton.click();
        return this;
    }

    public GitHubSearchResults input(String query) {
        inputSaerch.setValue(query).pressEnter();
        return new GitHubSearchResults();
    }


}
