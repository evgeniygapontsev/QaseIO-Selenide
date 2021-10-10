package models;

public class CaseInfoFactory {

    public static CaseInfo set() {
        return new CaseInfo("Authorization test", "Actual", "Test cases without suite",
                "Blocker", "High", "Smoke", "E2E",
                "Yes", "Not set", "Positive","Automated");
    }
}
