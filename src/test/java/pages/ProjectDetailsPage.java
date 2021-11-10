package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProjectDetailsPage {

    public CaseInfoPage createNewCase() {
        $(By.linkText("Create new case")).click();
        return new CaseInfoPage();
    }
}
