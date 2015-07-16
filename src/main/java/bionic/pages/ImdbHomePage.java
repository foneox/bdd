package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by bdd on 13.07.15.
 */

@DefaultUrl("http://www.imdb.com")
public class ImdbHomePage extends PageObject {

    @FindBy(id="nblogin")
    private WebElementFacade loginLink;

    @FindBy(id="nblogout")
    private WebElementFacade logouLink;

    @FindBy(xpath="//*[@id='thirdparty']//a[@rel='open_google']")
    private WebElementFacade loginTroughGoogleLink;

    @FindBy(xpath="//*[@id='sidebar']//div[@class='aux-content-widget-2'][2]//*[@class='rhs-row'][1]//a")
    private WebElementFacade firstTheatreMovieLink;

    @FindBy(xpath="//*[@id='sidebar']//div[@class='aux-content-widget-2'][3]//*[@class='rhs-row'][1]//a")
    private WebElementFacade firstComingSoonMovieLink;

    @FindBy(css=".cboxIframe")
    private WebElementFacade loginFrame;

    @FindBy(xpath=".//*[@id='navUserMenu']/*[@class='downArrow']")
    private WebElementFacade userMenuLink;


    public void openPage() {
        open();
        getDriver().manage().window().maximize();
    }

    public boolean isLogined() {
        return userMenuLink.isCurrentlyVisible();
    }

    public void clickLogout() {
        userMenuLink.click();
        logouLink.click();
    }

    public ImdbHomePage loginTroughGoogleAccount() {
        loginLink.click();
        getDriver().switchTo().frame(loginFrame);
        loginTroughGoogleLink.click();
        getDriver().switchTo().window(getDriver().getWindowHandles().toArray()[1].toString());
        return this;
        //return this.switchToPage(ImdbHomePage.class);
    }

    public void clickTheatreMovieLink() {
        firstTheatreMovieLink.click();
    }

    public void clickComingSoonMovieLink() {
        firstComingSoonMovieLink.click();
    }




}
