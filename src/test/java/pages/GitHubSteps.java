package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSteps {

    @Step("Открыть репозиторий {repoUrl}")
    public void openRepository(String repoUrl) {
        open(repoUrl);
    }

    @Step("Перейти на вкладку Issues")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }

    @Step("Найти и кликнуть на Issue {issueNumber}")
    public void clickOnIssue(String issueNumber) {
        $("a[href*='issues/" + issueNumber + "']").shouldBe(visible).click();
    }

    @Step("Проверить, что заголовок Issue = '{expectedTitle}'")
    public void checkIssueTitle(String expectedTitle) {
        $("[data-testid='issue-title']").shouldHave(text(expectedTitle));
    }
}