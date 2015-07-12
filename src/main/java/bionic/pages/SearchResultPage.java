package bionic.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends PageObject {
    @FindBy(css = ".search-result > *")
    private List<WebElementFacade> resultProducts;

    @FindBy(css = ".row.tierce.menu-sections > .cell > li > a")
    private List<WebElementFacade> resultCategories;

    private By productName = By.cssSelector(".title>a");

    public String getProductName(int position) {
        return resultProducts.get(position).findElement(productName).getText();
    }

    public ProductPage openProduct(int position) {
        resultProducts.get(position).findElement(productName).click();
        return new ProductPage();
    }

    public List<String> getFoundCategoriesName() {
        List<String> foundCategoriesName = new ArrayList<>();
        for (WebElementFacade category : resultCategories) {
            String categoryNameWithProductNumber = category.getText();
            String categoryName = categoryNameWithProductNumber.substring(0, (categoryNameWithProductNumber.indexOf("(") - 1));
            foundCategoriesName.add(categoryName);
        }
        return foundCategoriesName;
    }
}