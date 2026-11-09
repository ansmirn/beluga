package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GitHubSelenideWikiTab {
    private final SelenideElement softAssertionsLink = $("[href='/selenide/selenide/wiki/SoftAssertions']");
    private final SelenideElement pageContent = $(".markdown-body");

    public GitHubSelenideWikiTab goToPagesSoftAssertions() {
        softAssertionsLink.click();
        return this;
    }

    public GitHubSelenideWikiTab checkText(String expectedText) {
        pageContent.shouldHave(text(expectedText));
        return this;
    }


}
