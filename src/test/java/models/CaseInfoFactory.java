package models;

import com.github.javafaker.Faker;

public class CaseInfoFactory {
    static Faker faker;

    public static CaseInfo get() {
        faker = new Faker();

            return new CaseInfo(faker.job().title(), "Actual", "Test cases without suite",
                "Blocker", "High", "Smoke", "E2E",
                "Yes", "Not set", "Positive", "Automated");
    }
}
