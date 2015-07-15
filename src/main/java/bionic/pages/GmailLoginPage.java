package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Sergii on 7/14/2015.
 */
@DefaultUrl("http://gmail.com")
public class GmailLoginPage extends PageObject{
    @FindBy(id="Email")
    private WebElementFacade emailBox;

    @FindBy(id="next")
    private WebElementFacade nextButton;

    @FindBy(id="Passwd")
    private WebElementFacade passwdBox;

    @FindBy(id="signIn")
    private WebElementFacade signInButton;

    @FindBy(css=".gb_pa.gb_l.gb_r.gb_h")
    private WebElementFacade userNameOnTopOfGmailApp;

    public void specifyEmail(String email) {
        emailBox.sendKeys(email);
        nextButton.click();
    }

    public void specifyPassword(String password) {
        passwdBox.sendKeys(password);
        signInButton.click();
        userNameOnTopOfGmailApp.waitUntilVisible();

    }
}
