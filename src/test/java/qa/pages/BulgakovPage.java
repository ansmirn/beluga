package qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class BulgakovPage extends BasePage {

    private final SelenideElement wantToQaButton = $(byText("Хочу вкатиться в QA"));
    private final SelenideElement goPayButton = $(byText("Бегу оплачивать"));
    private final SelenideElement costLink = $("[href='#cost']");

    public BulgakovPage clickPrice() {
        costLink.click();
        return this;
    }

    public BulgakovPage clickWantToQa() {
        wantToQaButton.click();
        return this;
    }

    public BulgakovPage goPay() {
        goPayButton.click();
        return this;
    }


}
