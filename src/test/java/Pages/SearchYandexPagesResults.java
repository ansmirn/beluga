package Pages;

import com.codeborne.selenide.conditions.Visible;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SearchYandexPagesResults {

    public BulgakovPage clickResults (String queryResults){
        $("a[href*='" + queryResults + "']")
                .shouldBe(visible)
                .scrollIntoView(false)
                .click();
        return new BulgakovPage();
    }
}
