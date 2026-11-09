package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GitHubSelenideCodeTab {
    private final SelenideElement wikiTab = $("[href='/selenide/selenide/wiki']");

    public GitHubSelenideWikiTab goToWikiTab() {
        wikiTab.click();
        return new GitHubSelenideWikiTab();
    }
}
