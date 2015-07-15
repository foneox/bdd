package bionic.steps;

import bionic.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.StringUtils;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

public class EndUserSteps extends ScenarioSteps {
    HomePage homePage;
    ImdbHomePage imdbHomePage;
    GoogleLoginPage googleLoginPage;
    SearchResultPage searchResultPage;
    ProductPage productPage;

    @Step
    public void is_the_home_page() {
        homePage.open();
    }

    @Step
    public void should_see_product_catalog() {
        assertTrue(homePage.catalogIsDisplayed());
    }

    @Step
    public void search_for(String product) {
        homePage.search(product);
    }

    @Step
    public void found_product_should_be(int position, String product, String category) {
        assertTrue(StringUtils.containsIgnoreCase(searchResultPage.getProductName(position), product));
        productPage = searchResultPage.openProduct(position);
        assertTrue(productPage.getCurrentCategoryName().equals(category));
    }

    @Step
    public void isTheImdbHomePage() {
        imdbHomePage.open();
    }

    @Step
    public void logInToTheSystem(String login, String password) {
        imdbHomePage = logInToTheGoogle(login, password);
        imdbHomePage.open();
        imdbHomePage.login();
    }

    @Step
    public ImdbHomePage logInToTheGoogle(String login, String password) {
        googleLoginPage.open();
        return googleLoginPage.login(login, password);
    }
}