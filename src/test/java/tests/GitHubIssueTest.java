package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GitHubIssueTest extends BaseTest {

    @Test
    void checkIssueTitle() {
        open("https://github.com/allure-framework/allure2");
        $("#issues-tab").click();
        $("a[href*='/issues/3351']").shouldBe(visible).click();
        $("[data-testid='issue-title']").shouldHave(text("Error 404 on behaviors tab"));
    }
}