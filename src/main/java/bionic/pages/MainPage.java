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

    @FindBy(id="field-input-search")
    private WebElementFacade searchField;

    @FindBy(id="btn-search-top")
    private WebElementFacade searchButton;


    public boolean isLogoDisplayed(){
        return logoImage.isCurrentlyVisible();
    }
    public boolean isCatalogDisplayed(){
        return catalogFrame.isCurrentlyVisible();
    }

    public SearchResultsPage lookup_term() {
        searchButton.click();
        return new SearchResultsPage();
    }

    public void enters_term(String searchTerm) {
        searchField.sendKeys(searchTerm);
    }
}
