package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LavaTopPage {
    private final SelenideElement currencyDropdownButton = $("span.ant-select-selection-wrap");
    private final SelenideElement rubButton = $(byText("RUB"));

    public LavaTopPage currencyDropdown (){
        currencyDropdownButton.click();
        return this;
    }

    public LavaTopPage clickRub (){
        rubButton.click();
        return this;
    }

    public LavaTopPage checkSum(){
        $(".styles-module__bFURDW__header3").shouldHave(text("₽ 47 000.00"));
        return this;
    }
}
