package bionic.pages.imdb;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;

/**
 * Created by Sergii on 7/15/2015.
 */
public class LoginDialog extends PageObject{
    @FindBy(xpath=".//*[@id='thirdparty']/div[2]/span[2]/a")
    private WebElementFacade googleLoginLink;

    @FindBy(name="1436991582154")
    private WebElementFacade cboxIframe;

    public ImdbHomePage loginWithGmail() {
        cboxIframe.waitUntilVisible();
        getDriver().switchTo().frame(cboxIframe);
        googleLoginLink.waitUntilClickable();
        googleLoginLink.click();
        getDriver().switchTo().defaultContent();
        cboxIframe.waitUntilNotVisible();
        ImdbHomePage imdbHomePage = new ImdbHomePage();
        return imdbHomePage;
    }
}
