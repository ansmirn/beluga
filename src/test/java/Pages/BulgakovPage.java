package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class BulgakovPage {

    private final SelenideElement vkatButton = $x("//*[text()='Хочу вкатиться в QA']"); // В этом случае мне показалось это самый удобный способ (наверное)
    private final SelenideElement goPayButton = $x("//*[text()='Бегу оплачивать']"); // тут тоже как будто удобнее

    public BulgakovPage clickPrice(){
        $$(".t-menu__list li").last().click();// тут не вынес в селенид элемент так как со списком - это сложнее (наверное)
        return this;
    }

    public BulgakovPage clickVkat(){
        vkatButton.click();
        return this;
    }

    public BulgakovPage goPay(){
        goPayButton.click();
        return this;
    }


}
