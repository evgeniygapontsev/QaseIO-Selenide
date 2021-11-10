package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class ProjectTest extends BaseTest {

    @Test
    public void projectShouldBeCreated() {
        new LoginPage()
                .open()
                .login(user, pass)
                .createButton()
                .createNewProject("Selenide-Project", "SP", "This is a new project!", "Public");
    }
}
