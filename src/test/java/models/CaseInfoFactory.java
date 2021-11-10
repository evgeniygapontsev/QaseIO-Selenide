package models;

import com.github.javafaker.Faker;

public class CaseInfoFactory {
    static Faker faker;

    public static CaseInfo get() {
        faker = new Faker();

            return CaseInfo.builder()
                    .title(faker.job().title())
                    .severity(3)
                    .priority(2)
                    .type(2)
                    .layer(2)
                    .isFlaky(0)
                    .behavior(1)
                    .automation(0)
                    .status(0)
                    .suite(0)
                    .milestone(0)
                    .build();
    }
}
