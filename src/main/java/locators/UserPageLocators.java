package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserPageLocators {
    @FindBy(how = How.ID, using = "logout")
    public WebElement logoutLabel;

    @FindBy(how = How.ID, using = "edit")
    public WebElement editButton;
}
