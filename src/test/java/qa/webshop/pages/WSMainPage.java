package qa.webshop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WSMainPage {

    private final SelenideElement registrationLink = $("a.ico-register");
    private final ElementsCollection menuItems = $$(".top-menu>li");
    private final SelenideElement desktopsItem = $("[href='/desktops']");

    public WSRegistrationPage openRegistration() {
        registrationLink.click();
        return new WSRegistrationPage();

    }

    public WSMainPage hoverMenuItem(String name) {
        menuItems.findBy(text(name)).hover();
        return this;
    }

    public DesktopsPage openDesktopsCategory() {
        desktopsItem.click();
        return new DesktopsPage();
    }

}
