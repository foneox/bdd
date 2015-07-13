package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

/**
 * Created by Illya on 13.07.2015.
 */
@DefaultUrl("http://www.sokol.ua/")
public class SearchPage {

    @FindBy(xpath = "//div[@class='search-result goods list']/div[@class='item']")
    private List<WebElementFacade> allResultsList;

    private static final By category = By.tagName("script");
    private static final By title = By.xpath(".//div[@class='title']/a");


    public boolean itemsBelongToCategory(String groupName) {
        if (!allResultsList.isEmpty()) {
            for (WebElementFacade item : allResultsList) {
                if (!item.findElement(category).getText().contains(groupName))
                    return false;
            }
        } return true;
    }

    public boolean itemTitleContains(int number, String name) {
        return allResultsList.get(number).findElement(title).getText().contains(name);
    }


}
