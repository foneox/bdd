package bionic.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import utils.Log4Test;

@DefaultUrl("http://secure.imdb.com/register-imdb/login?ref_=nv_usr_lgin_3")
public class ImdbLoginPage extends PageObject {
    private static Log4Test mLog = new Log4Test(ImdbLoginPage.class.getName());
    @FindBy(xpath= "//a[@rel='open_google']", timeoutInSeconds = "10")
    private WebElementFacade googleLink;

    public void goToLoginOptions() {
        mLog.info("Navigating to the page with loggining options.");
        open();
    }

    public void logViaGoogle() {
        mLog.info("Choosing loggin via Google.");
        googleLink.sendKeys(Keys.chord(Keys.CONTROL, "t"));
       // googleLink.click();
    }
}
