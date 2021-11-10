package models;

import com.github.javafaker.Faker;

public class ProjectFactory {
    static Faker faker;

    public static Project get() {
        faker = new Faker();

        return Project.builder()
                .title(faker.name().title())
                .code(faker.code().ean8())
                .build();
    }
}
