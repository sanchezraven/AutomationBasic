package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorOfSelenide {

    @Test
    void authorShouldBeOnTop() {
        open("https://github.com/selenide/selenide");
        $(".BorderGrid").$(Selectors.byText("Contributors")).ancestor(".BorderGrid-row").
                $$("ul li").first().hover();
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}
