package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.qameta.allure.Step;

import pages.UserPageActions;
import utilities.TestUtilities;

public class UserStepsDefinitions {
    private UserPageActions userPageActions;
    private TestUtilities testUtils;

    public UserStepsDefinitions(UserPageActions userPageActions, TestUtilities testUtils) {
        this.userPageActions = userPageActions;
        this.testUtils = testUtils;
    }

    @Then("I have been successfully logged$")
    public void iShouldSeeTheLinkToDownloadFile() {
        userPageActions.isLoginCorrect();
    }

    @When("I want to edit user profile")
    public void iWantToEditUserProfile() {
        userPageActions.editButtonClick();
    }

    @Then("^I fill in user name with \"([^\"]*)\"$")
    public void iFillInUserNameWith(String userName){

    }

    @And("^I fill in user surname with \"([^\"]*)\"$")
    public void iFillInUserSurnameWith(String userSurname){

    }

    @And("^I select \"([^\"]*)\" in role$")
    public void iSelectInRole(String userRole) {

    }

    @And("^I save all changes$")
    public void iSaveAllChanges() {
    }
}
