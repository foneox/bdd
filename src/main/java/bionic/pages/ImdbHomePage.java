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

    @FindBy(id="catalog")
    private WebElementFacade catalogFrame;

}
