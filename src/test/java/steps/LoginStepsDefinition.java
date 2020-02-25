package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.qameta.allure.Step;
import pages.LoginPageActions;
import utilities.TestUtilities;

public class LoginStepsDefinition {
    private LoginPageActions loginPageActions;
    private TestUtilities testUtils;
    private final String SITE_URL = "http://127.0.0.1:8080/main.html";

    public LoginStepsDefinition(LoginPageActions loginPageActions, TestUtilities testUtils) {
        this.loginPageActions = loginPageActions;
        this.testUtils = testUtils;
    }

    @Given("I go to main page")
    public void iGoToMainPage() {
        testUtils.openBrowser(SITE_URL);
    }

    @And("I login as \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void iLoginAsWithPassword(String login, String password) {
        loginPageActions.fillInLogin(login);
        loginPageActions.fillInPassword(password);
        loginPageActions.loginButtonClick();
    }
    @Then("I have not been successfully logged$")
    public void iShouldSeeTheLinkToDownloadFile() {
        loginPageActions.isLoginIncorrect();
    }
    @And("I login with correct credentials")
    public void iLoginWithCorrectCredentials() {
        loginPageActions.correctLogin();
    }

}
