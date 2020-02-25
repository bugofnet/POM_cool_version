package pages;

import locators.UserPageLocators;

public class UserPageActions {
    private UserPageLocators userPageLocators;
    private CommonActions commonActions;

    public UserPageActions(UserPageLocators userPageLocators, CommonActions commonActions) {
        this.userPageLocators = userPageLocators;
        this.commonActions = commonActions;
        commonActions.pageFactoryInitElements(userPageLocators);
    }

    public void isLoginCorrect(){
        commonActions.isElementDisplayed(userPageLocators.logoutLabel);
    }

    public void editButtonClick(){
        commonActions.clickOnElement(userPageLocators.editButton);
    }
}
