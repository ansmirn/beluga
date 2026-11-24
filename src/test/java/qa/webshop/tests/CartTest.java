package qa.webshop.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qa.webshop.pages.CartPage;
import qa.webshop.pages.ProductPage;
import qa.webshop.pages.WSMainPage;
import qa.webshop.steps.AuthSteps;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CartTest {

    private static final String ITEM_QUANTITY = "2";

    private final AuthSteps authSteps = new AuthSteps();
    private final WSMainPage wsMainPage = new WSMainPage();
    private final ProductPage productPage = new ProductPage();

    @BeforeEach
    void registerNewUser() {
        authSteps.registrationNewUser();
    }

    @Test
    void addProductToCart_shouldShowCorrectQuantityAndSubtotal() {
        wsMainPage.hoverMenuItem("Computers")
                .openDesktopsCategory().
                openCheapComputer();
        String itemName = productPage.getProductName();
        String itemPrice = productPage.getProductPrice();
        CartPage cart = productPage.shouldHaveName(itemName)
                .selectProcessor(0)
                .setProductQuantity(ITEM_QUANTITY)
                .shouldHavePrice(itemPrice)
                .addToCart()
                .shouldShowSuccessNotification()
                .shouldHaveCartQuantityInHeader(ITEM_QUANTITY)
                .openCart()
                .shouldHaveName(itemName)
                .shouldHaveSubtotal(ITEM_QUANTITY, itemPrice);
        String itemQuantityInCart = cart.getQuantity();
        assertEquals(ITEM_QUANTITY, itemQuantityInCart);
    }
}
