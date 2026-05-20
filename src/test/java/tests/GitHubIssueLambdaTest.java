package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GitHubIssueLambdaTest extends BaseTest {

    @Test
    void checkIssueTitle() {
        step("Открыть репозиторий allure-framework/allure2", () -> {
            open("https://github.com/allure-framework/allure2");
        });

        step("Перейти на вкладку Issues", () -> {
            $("#issues-tab").click();
        });

        step("Найти и кликнуть на Issue #3351", () -> {
            $("a[href*='/issues/3351']").shouldBe(visible).click();
        });

        step("Проверить заголовок Issue", () -> {
            $("[data-testid='issue-title']").shouldHave(text("Error 404 on behaviors tab"));
        });
    }
}