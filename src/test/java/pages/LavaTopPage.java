package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LavaTopPage {
    private final SelenideElement currencyDropdown = $("span.ant-select-selection-wrap");
    private final SelenideElement rubOption = $(byText("RUB"));
    private final SelenideElement price = $("h3[data-at='H3']");

    public LavaTopPage openCurrencyDropdown() {
        currencyDropdown.click();
        return this;
    }

    public LavaTopPage selectRub() {
        rubOption.click();
        return this;
    }

    public LavaTopPage checkSum(String expectedSum) {
        price.shouldHave(text(expectedSum));
        return this;
    }
}
