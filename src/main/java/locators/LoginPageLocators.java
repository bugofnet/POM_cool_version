package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {
    @FindBy(how = How.ID, using = "username")
    public WebElement loginField;

    @FindBy(how = How.ID, using = "password")
    public WebElement passwordField;

    @FindBy(how = How.ID, using = "save")
    public WebElement loginButton;

    @FindBy(how = How.ID, using = "logout")
    public WebElement logoutLabel;

}
