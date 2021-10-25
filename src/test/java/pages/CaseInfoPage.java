package pages;

import models.CaseInfo;
import wrappers.Dropdown;

import static com.codeborne.selenide.Selenide.$;

public class CaseInfoPage {

    public ProjectDetailsPage getCaseInfo(CaseInfo caseInfo) {

        $("#title").setValue(caseInfo.getTitle());
        new Dropdown("statusGroup").selectOption(caseInfo.getStatus());
        new Dropdown("suiteGroup").selectOption(caseInfo.getSuite());
        new Dropdown("severityGroup").selectOption(caseInfo.getSeverity());
        new Dropdown("priorityGroup").selectOption(caseInfo.getPriority());
        new Dropdown("typeGroup").selectOption(caseInfo.getType());
        new Dropdown("layerGroup").selectOption(caseInfo.getLayer());
        new Dropdown("is_flakyGroup").selectOption(caseInfo.getIsFlaky());
        new Dropdown("milestoneGroup").selectOption(caseInfo.getMilestone());
        new Dropdown("behaviorGroup").selectOption(caseInfo.getBehavior());
        new Dropdown("automationStatusGroup").selectOption(caseInfo.getAutomationStatus());

        $("#save-case").click();
        return new ProjectDetailsPage();
    }

}
