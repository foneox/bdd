package bionic.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Log4Test;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

@DefaultUrl("https://accounts.google.com/")
public class GoogleAccountPage extends PageObject {
    private static Log4Test mLog = new Log4Test(GoogleAccountPage.class.getName());
    @FindBy(id = "Email") WebElementFacade email;
    @FindBy(id = "next") WebElementFacade buttonNext;
    @FindBy(id = "Passwd") WebElementFacade password;
    @FindBy(id = "signIn") WebElementFacade signIn;
    @FindBy(xpath= "//a[contains(@href,'accounts.google.com')]", timeoutInSeconds = "35") WebElementFacade userInfo;

    public void login(String userName, String userPassword) {
        mLog.info("Opening the Google Account Page.");
        open();
        mLog.info("Loggining as: " + userName + ", pass: " + userPassword);
        email.clear();
        email.sendKeys(userName);
        buttonNext.click();
        waitFor(password);
        password.sendKeys(userPassword);
        signIn.click();
        assertTrue(getDriver().getCurrentUrl().contains("myaccount"));
        mLog.info("User is logged in.");
    }
}
