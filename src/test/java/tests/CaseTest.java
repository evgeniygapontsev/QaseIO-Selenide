package tests;

import models.CaseInfo;
import models.CaseInfoFactory;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CaseTest extends BaseTest {

    CaseInfo caseInfo;

    @Test
    public void testCaseShouldBeCreated() {


        new LoginPage()
                .open()
                .login("gapontsev91@gmail.com", "pass1234")
                .openProject("Selenide-Project")
                .createNewCase()
                .getCaseInfo(CaseInfoFactory.get());

        //validate case info
    }
}