package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Sergii on 7/12/2015.
 */
public class SearchResultsPage extends PageObject {

    @FindBy(css=".title>a")
    private List<WebElement> searchResultTitles;

    public String getSearchResultLinkByIndex(int index) {
        return searchResultTitles.get(index).getAttribute("href");
    }
}
