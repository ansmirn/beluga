package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class SearchYandexPages {
    private final SelenideElement inputSearch = $("textarea.search3__input");
    private final SelenideElement buttonSearch = $("button.search3__button");


    public SearchYandexPages search(String qwery){
        inputSearch.setValue(qwery);
        return this;
    }

    public SearchYandexPagesResults clickSearch (){
        buttonSearch.click();
        return new SearchYandexPagesResults();
    }

}
