package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GitHubPages {
    public GitHubPages clickToInputSearch (){
        $("[aria-label = 'Search or jump to, type / to search']").click();
        return this;
    }

    public GitHubPages inputSearchSelenide (){
        $("[aria-label='Search or jump to']").setValue("Selenide").pressEnter();
        return this;
    }

    public GitHubPages clickSelenideToList (){
        $("[href = '/selenide/selenide']").click();
        return this;
    }

    public GitHubPages goToWikiTab (){
        $("[href='/selenide/selenide/wiki']").click();
        return this;
    }
    public GitHubPages goToPagesSoftAssertions (){
        $("[href='/selenide/selenide/wiki/SoftAssertions']").click();
        return this;
    }

    public GitHubPages assertToTextJUnit5 (){
        $("body").shouldHave(text("Using JUnit5 extend test class:"));
        return this;
    }


}
