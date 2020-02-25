package pages;

import locators.UserPageLocators;

import static org.testng.AssertJUnit.assertEquals;

public class UserPageActions {
    private UserPageLocators userPageLocators;
    private CommonActions commonActions;

    public UserPageActions(UserPageLocators userPageLocators, CommonActions commonActions) {
        this.userPageLocators = userPageLocators;
        this.commonActions = commonActions;
        commonActions.pageFactoryInitElements(userPageLocators);
    }

    public void isLoginCorrect() {
        commonActions.isElementDisplayed(userPageLocators.logoutLabel);
    }

    public void editButtonClick() {
        commonActions.clickOnElement(userPageLocators.editButton);
    }

    public void fillInUserNameField(String name) {
        commonActions.fillInField(userPageLocators.userNameField, name);
    }

    public void fillInUserSurnameField(String surname) {
        commonActions.fillInField(userPageLocators.userSurnameField, surname);
    }

    public void selectRole(String role){
        commonActions.selectWebElementByVisibleText(userPageLocators.userRoleSelect, role);
    }

    public void saveButtonClick(){
        commonActions.clickOnElement(userPageLocators.saveButton);
    }

    public void isNameSavedAs(String name){
        assertEquals(name, commonActions.getElementText(userPageLocators.userNameField));
    }

    public void isSurnameSavedAs(String surname){
        assertEquals(surname, commonActions.getElementText(userPageLocators.userSurnameField));
    }

    public void isRoleSavedAs(String role){
        assertEquals(role, commonActions.getElementText(userPageLocators.userRoleSelect));
    }
}
