package pages;

import models.CaseInfo;
import models.CaseInfoFactory;
import wrappers.Dropdown;

import static com.codeborne.selenide.Selenide.$;

public class CaseInfoPage {

    public ProjectDetailsPage getCaseInfo(CaseInfo caseInfo) {

        $("#title").setValue(CaseInfoFactory.set().getTitle());
        new Dropdown("statusGroup", CaseInfoFactory.set().getStatus());
        new Dropdown("suiteGroup", CaseInfoFactory.set().getSuite());
        new Dropdown("severityGroup", CaseInfoFactory.set().getSeverity());
        new Dropdown("priorityGroup", CaseInfoFactory.set().getPriority());
        new Dropdown("typeGroup", CaseInfoFactory.set().getType());
        new Dropdown("layerGroup", CaseInfoFactory.set().getLayer());
        new Dropdown("is_flakyGroup", CaseInfoFactory.set().getIsFlaky());
        new Dropdown("milestoneGroup", CaseInfoFactory.set().getMilestone());
        new Dropdown("behaviorGroup", CaseInfoFactory.set().getBehavior());
        new Dropdown("automationStatusGroup", CaseInfoFactory.set().getAutomationStatus());

        $("#save-case").click();
        return new ProjectDetailsPage();
    }

}
