package qa.webshop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement productName = $(".product-name");
    private final SelenideElement productSubTotal = $(".product-subtotal");
    private final SelenideElement itemQuantity = $(".qty-input");

    public String getQuantity() {
        return itemQuantity.getAttribute("value");
    }

    public CartPage shouldHaveName(String itemName) {
        productName.shouldHave(text(itemName));
        return this;
    }

    public CartPage shouldHaveSubtotal(String itemQuantity, String itemPrice) {
        productSubTotal.shouldHave(text(String.valueOf(
                (Float.parseFloat(itemQuantity)) * (Float.parseFloat(itemPrice)))));
        return this;

    }
}
