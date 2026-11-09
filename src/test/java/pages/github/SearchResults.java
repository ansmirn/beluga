package pages.github;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SearchResults {
    private final SelenideElement selenideLink = $("[href = '/selenide/selenide']");

    public SelenideCodeTab openSelenideRepository() {
        selenideLink.click();
        return new SelenideCodeTab();
    }
}
