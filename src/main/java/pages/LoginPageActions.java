package pages;

import locators.LoginPageLocators;

public class LoginPageActions {
    private LoginPageLocators loginPageLocators;
    private CommonActions commonActions;

    public LoginPageActions(LoginPageLocators loginPageLocators, CommonActions commonActions) {
        this.loginPageLocators = loginPageLocators;
        this.commonActions = commonActions;
        commonActions.pageFactoryInitElements(loginPageLocators);
    }
    public LoginPageActions fillInLogin(String loginName){
        commonActions.fillInField(loginPageLocators.loginField, loginName);
        return this;
    }

    public LoginPageActions fillInPassword(String password){
        commonActions.fillInField(loginPageLocators.passwordField, password);
        return this;
    }
    public void loginButtonClick(){
        commonActions.clickOnElement(loginPageLocators.loginButton);
    }

    public void isLoginIncorrect(){
        commonActions.isAlertText("Wrong credentials!");
    }

    public void correctLogin(){
        fillInLogin("bugofnet");
        fillInPassword("1234Abcd@");
        loginButtonClick();
    }

}
