package pages.github;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SelenideWikiTab {
    private final SelenideElement softAssertionsLink = $("[href='/selenide/selenide/wiki/SoftAssertions']");
    private final SelenideElement pageContent = $(".markdown-body");

    public SelenideWikiTab goToPagesSoftAssertions() {
        softAssertionsLink.click();
        return this;
    }

    public SelenideWikiTab checkText(String expectedText) {
        pageContent.shouldHave(text(expectedText));
        return this;
    }


}
