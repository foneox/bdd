package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.imdb.com")
public class ImdbHomePage extends PageObject {
    @FindBy(id = "nblogin")
    private WebElementFacade lnkLogin;

    public ImdbHomePage login() {
        lnkLogin.click();
        //TODO
        return this;
    }
}
