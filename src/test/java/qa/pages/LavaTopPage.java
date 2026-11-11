package qa.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LavaTopPage {
    private final SelenideElement currencyDropdown = $("span.ant-select-selection-wrap");
    private final ElementsCollection currencyOptions = $$("[role='option']");
    private final SelenideElement price = $("h3[data-at='H3']");

    public LavaTopPage openCurrencyDropdown() {
        currencyDropdown.click();
        return this;
    }

    public LavaTopPage selectRub() {
        currencyOptions.filterBy(visible).findBy(exactText("RUB")).click();
        return this;
    }

    public LavaTopPage checkSum(String expectedSum) {
        price.shouldHave(exactText(expectedSum));
        return this;
    }
}
