package qa.pages.github;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelenideCodeTab {
    private final SelenideElement wikiTab = $("[href='/selenide/selenide/wiki']");

    public SelenideWikiTab goToWikiTab() {
        wikiTab.click();
        return new SelenideWikiTab();
    }
}
