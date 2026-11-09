package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubSearchResults {
    private final SelenideElement selenideLink = $("[href = '/selenide/selenide']");

    public GitHubSelenideCodeTab openSelenideRepository() {
        selenideLink.click();
        return new GitHubSelenideCodeTab();
    }
}
