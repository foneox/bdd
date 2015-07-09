package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by bdd on 09.07.15.
 */
@DefaultUrl("http://www.sokol.ua/")
public class MainPage extends PageObject {

    @FindBy(id="catalog")
    private WebElementFacade catalogFrame;

    @FindBy(className="logo")
    private WebElementFacade logoImage;


    public boolean isLogoDisplayed(){
        return logoImage.isCurrentlyVisible();
    }
    public boolean isCatalogDisplayed(){
        return catalogFrame.isCurrentlyVisible();
    }
}
