package bionic.pages.imdb;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by bdd on 13.07.15.
 */

@DefaultUrl("http://www.imdb.com")
public class ImdbHomePage extends PageObject {

    @FindBy(id="catalog")
    private WebElementFacade catalogFrame;

    @FindBy(id="nblogin")
    private WebElementFacade nblogin;

    @FindBy(id="navUserMenu")
    private WebElementFacade navUserMenu;

    public LoginDialog openSighInDialog() {
        nblogin.click();
        try {
            wait(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new LoginDialog();
    }

    public boolean isUserLoggedIn() {
        return navUserMenu.isCurrentlyVisible();
    }
}
