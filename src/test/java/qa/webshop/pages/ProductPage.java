package qa.webshop.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    private final SelenideElement productName = $(".product-name");
    private final ElementsCollection processorOptions = $$("input[name='product_attribute_72_5_18']");
    private final SelenideElement quantityInput = $(".qty-input");
    private final SelenideElement productPrice = $(".price-value-72");
    private final SelenideElement addToCartButton = $("#add-to-cart-button-72");
    private final SelenideElement barNotification = $("#bar-notification");
    private final SelenideElement cartQuantityInHeader = $(".cart-qty");
    private final SelenideElement cartLink = $(".ico-cart");

    public String getProductName() {
        return productName.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public ProductPage shouldHaveName(String itemName) {
        productName.shouldHave(text(itemName));
        return this;
    }

    // index 0 = slow, 1 = medium, 2 = fast
    public ProductPage selectProcessor(int index) {
        processorOptions.get(index).click();
        return this;
    }

    public ProductPage setProductQuantity(String itemQuantity) {
        quantityInput.setValue(itemQuantity);
        return this;
    }

    public ProductPage shouldHavePrice(String itemPrice) {
        productPrice.shouldHave(text(itemPrice));
        return this;
    }

    public ProductPage addToCart() {
        addToCartButton.click();
        return this;
    }

    public ProductPage shouldShowSuccessNotification() {
        barNotification.shouldBe(visible);
        return this;
    }

    public ProductPage shouldHaveCartQuantityInHeader(String itemQuantity) {
        cartQuantityInHeader.shouldHave(text("(" + itemQuantity + ")"));
        return this;
    }

    public CartPage openCart() {
        cartLink.click();
        return new CartPage();
    }
}
