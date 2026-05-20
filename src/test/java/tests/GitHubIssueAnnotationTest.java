package tests;

import base.BaseTest;
import pages.GitHubSteps;
import org.junit.jupiter.api.Test;

public class GitHubIssueAnnotationTest extends BaseTest {

    private GitHubSteps steps = new GitHubSteps();

    @Test
    void checkIssueTitle() {
        steps.openRepository("https://github.com/allure-framework/allure2");
        steps.openIssuesTab();
        steps.clickOnIssue("3351");
        steps.checkIssueTitle("Error 404 on behaviors tab");
    }
}