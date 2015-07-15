package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import utils.Log4Test;

@DefaultUrl("http://www.imdb.com/?ref_=nv_home")
public class ImdbHomePage extends PageObject {
    private static Log4Test mLog = new Log4Test(ImdbHomePage.class.getName());
    @FindBy(xpath= "//li[@id='navUserMenu']//a[contains(@href,'user')]", timeoutInSeconds = "20")
    WebElementFacade userInfo;
    @FindBy(xpath= "//a[@id='home_img']", timeoutInSeconds = "20")
    WebElementFacade homeImg;

    public void verifyUserIsLogged() {
        waitFor(userInfo);
    }

    public void goToHomePage() {
        homeImg.click();
    }
}
