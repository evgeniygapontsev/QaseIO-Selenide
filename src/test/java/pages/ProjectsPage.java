package pages;

import com.codeborne.selenide.Condition;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProjectsPage {

    public ProjectsPage shoudBeOpened() {
        $("#createButton").shouldBe(Condition.visible);
        return this;
    }

    public ProjectsPage createButton() {
        $("#createButton").click();
        return this;
    }

    public void createNewProject(String projectName, String projectCode, String description, String accessType) {

        $("#inputTitle").setValue(projectName);
        if (StringUtils.isNotEmpty(projectCode)) {
            $("#inputCode").setValue(projectCode);
        }
        $("#inputDescription").setValue(description);
        switch (accessType) {
            case "Private": {
                $("#private-access-type").click();
                break;
            }
            case "Public": {
                $("#public-access-type").click();
                break;
            }
        }
        $(By.className("btn")).click();

    }

    public ProjectDetailsPage openProject(String name) {
        $$("a.defect-title").findBy(Condition.text(name)).click();
        return new ProjectDetailsPage();
    }




}
