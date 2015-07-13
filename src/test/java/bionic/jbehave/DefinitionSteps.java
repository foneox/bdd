package bionic.jbehave;

import bionic.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;


    @Given("I am on main page")
    @Alias("main page is opened")
    public void givenMainPageIsOpened() {
        endUser.open_shop();
    }

    @When("I see shop logo")
    public void whenISeeShopLogo() {
        endUser.should_see_logo();
    }

    @Then("I see products catalog")
    public void thenISeeProductsCatalog() {
        endUser.should_see_catalog();
    }


    @When("I search for <product>")
    public void whenISearchForProduct(String product) {
        endUser.searches_by_keyword(product);
    }

    @Then("I should see result list of items which belong to <category>")
    public void thenIShouldSeeResultListOfItemsWhichBelongTocategory(String category) {
        endUser.should_see_items_in_result_list_related_to_category(category);
    }

    @Then("item <number> from result list contains title <product>")
    public void thenItemNumberFromResultListHasTitleProduct(int number, String title) {
        endUser.should_see_item_with_title(number, title);
    }

}
