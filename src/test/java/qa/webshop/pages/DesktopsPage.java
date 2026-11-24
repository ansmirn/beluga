package qa.webshop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DesktopsPage {
    private final SelenideElement cheapComputer = $("[href='/build-your-cheap-own-computer']");

    public ProductPage openCheapComputer() {
        cheapComputer.click();
        return new ProductPage();
    }
}
