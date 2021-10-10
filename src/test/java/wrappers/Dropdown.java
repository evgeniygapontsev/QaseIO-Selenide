package wrappers;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Dropdown {

    public Dropdown (String fieldName, String option) {
        $(By.xpath(String.format("//*[@id='%s']//descendant::*[@class=' css-1hwfws3']", fieldName))).click();
        $$(".css-1gg2qke-menu").findBy(Condition.text(option)).click();
    }
}
