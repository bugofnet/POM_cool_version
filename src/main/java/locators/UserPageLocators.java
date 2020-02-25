package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserPageLocators {
    @FindBy(how = How.ID, using = "logout")
    public WebElement logoutLabel;

    @FindBy(how = How.ID, using = "edit")
    public WebElement editButton;

    @FindBy(how = How.ID, using = "name")
    public WebElement userNameField;

    @FindBy(how = How.ID, using = "surname")
    public WebElement userSurnameField;

    @FindBy(how = How.ID, using = "role")
    public WebElement userRoleSelect;

    @FindBy(how = How.ID, using = "save")
    public WebElement saveButton;
}
