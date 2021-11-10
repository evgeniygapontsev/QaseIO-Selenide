package tests;

import adapters.BaseAdapter;
import com.google.gson.Gson;
import models.*;
import org.testng.annotations.Test;

public class CaseTest extends BaseTest {

    CaseInfo caseInfo;

    @Test
    public void testCaseShouldBeCreated() {

        Project project = Project.builder()
//                .title("011021 Project 2")
//                .code("ABCDEFG")
                .build();
        new BaseAdapter().post(new Gson().toJson(project), "v1/project");

//        projectAdapter.create(project);
//        Project actualProject = projectAdapter.get(project.getCode());
//        System.out.println(actualProject);
//        projectAdapter.delete(project.getCode());


//                .createNewCase()
//                .getCaseInfo(CaseInfoFactory.get());

        //validate case info
    }

    @Test
    public void createSuiteTest() {
        Project project = ProjectFactory.get();
        Suite suite = SuiteFactory.get();
        CaseInfo caseInfo = CaseInfoFactory.get();
        projectAdapter.create(project);
        suiteAdapter.createSuite(suite, project.getCode());
        Response<Suite> suiteResponse = suiteAdapter.getSuite(project.getCode(), 1);
        System.out.println(suiteResponse);
        caseAdapter.createCase(caseInfo, project.getCode());
        Response<CaseInfo> caseInfoResponse = caseAdapter.getCase(project.getCode(), 1);
        System.out.println(caseInfoResponse);
        caseAdapter.deleteCase(project.getCode(), 1);
        suiteAdapter.deleteSuite(project.getCode(), 1);
        projectAdapter.delete(project.getCode());
    }
}